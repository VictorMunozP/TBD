package com.tdb.back.Indice;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;


import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class IndiceInvertido {
	
	private ArrayList<String> tweets;
	
	public void crear() {
		try {
			MongoClient mongo= new MongoClient();
			DB db= mongo.getDB("twitter3");
			DBCollection col=(DBCollection) db.getCollection("statusJSONImpl");
			DBCursor cur=col.find();
			
			
			 Directory dir = FSDirectory.open(Paths.get("indice/"));
		     Analyzer analyzer = new StandardAnalyzer();
		     IndexWriterConfig iwc = new IndexWriterConfig(analyzer);
		     iwc.setOpenMode(OpenMode.CREATE);
		     IndexWriter writer = new IndexWriter(dir, iwc);
		   
		     Document document=null;
		     
		     while(cur.hasNext()) {
		    	 document= new Document();
		    	 DBObject elemento=cur.next();
		    	 
		    	 document.add(new StringField("id",elemento.get("_id").toString(),Field.Store.YES));
		    	 document.add(new TextField("text",elemento.get("text").toString(),Field.Store.YES));
		    	 
		    	 if(writer.getConfig().getOpenMode() == OpenMode.CREATE) {
    				 System.out.println("Indexando el archivo: "+elemento.get("_id"));
    				 System.out.println("cuyo texto es: "+elemento.get("text"));
    				 writer.addDocument(document);
    			 }
		    	 else {
    				 writer.updateDocument(new Term("text"+elemento.get("text")), document);
    			 }
		     }
		     writer.close();		     
		}
		catch(IOException ioe) {
			Logger.getLogger(IndiceInvertido.class.getName()).log(Level.SEVERE, null, ioe);
		}		
	}
	
	public ArrayList<String> buscar(String consulta) {
		
		
		try {
			IndexReader reader = DirectoryReader.open(FSDirectory.open(Paths.get("indice")));
			IndexSearcher searcher = new IndexSearcher(reader);
		    Analyzer analyzer = new StandardAnalyzer();
		    
		    QueryParser parser = new QueryParser("text", analyzer);
		    Query query = parser.parse(consulta);
		    
		    TopDocs results = searcher.search(query,9999);
		    ScoreDoc[] hits = results.scoreDocs;
		   this.tweets=new ArrayList<String>();
		    
		    for(int i = 0; i < hits.length; i++) {
		    	Document doc = searcher.doc(hits[i].doc);
		    	this.tweets.add(doc.get("text"));
		    	String id = doc.get("id");
		    	System.out.println((i+1)+".- score="+hits[i].score + " doc="+hits[i].doc+" id="+id);
		    	System.out.println(doc.get("text"));
		    }
		    reader.close();
		    
		}
		catch(IOException ioe) {
			Logger.getLogger(IndiceInvertido.class.getName()).log(Level.SEVERE, null, ioe);
		}
		catch(ParseException pe) {
			Logger.getLogger(IndiceInvertido.class.getName()).log(Level.SEVERE, null, pe);
		}
		return tweets;
	}
		
}
	
	
	
	
	


