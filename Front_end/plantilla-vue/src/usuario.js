import Vue from 'vue';
import VueRouter from 'vue-router';
import VueResource from 'vue-resource';
require("./style.scss");


var Nombre = function(firstName, lastName){
   this.firstName = firstName;
   this.lastName = lastName;
}



function getFormJson(){
	var nombreObj = new Nombre($('#firstName').val(), $('#lastName').val());

//	jQuery.each(prodCodigos, function(pos, item){
//		nombreObj.addUsuario(new Producto(prodCodigos[pos].value, prodUnidades[pos].value));
//	});
	
	return nombreObj;
};

function loadUser(){
	$.ajax({
	  	url: 'http://localhost:3000/actors/',
	  	type: 'GET',
	  	contentType: "application/json",
	  	success: function(jsonObj) { 
		  	$("#firstName").val(jsonObj["firstName"]);
			  	$("#lastName").val(jsonObj["lastName"]);
			}
	});		
}