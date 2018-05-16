<template>

<div>

  <div class="bloque1">
    <div class="center">
      <h2>{{title}}</h2>
      <p> República Gamer a tiempo real </p>
      <img class="logo-big" src="./img/wbt.png" />
    </div>
  </div>

  <div class="bloque2">
    <!--  <link rel="stylesheet" type="text/css" href="iniciarSesion.css"> -->
    
    
 <form class="iniciarSesion" style="width: 340px; height: 600px; padding: 30px 25px; background: #37495F; border: 1px solid #c4c4c4"> 
      <h1 class="IStitulo" style="margin: -28px -25px 25px; padding: 15px 25px; line-height: 30px; font-size: 25px; font-weight: 300; color: #ADADAD; text-align:center; background: #37495F"> Iniciar Sesión </h1>
      <input type="text" class="input" placeholder="ID" autofocus style="width: 285px; height: 50px; margin-bottom: 25px; padding-left:10px; font-size: 15px; background: #fff; border: 1px solid #ccc; border-radius: 4px; border-color:#6e8095; outline: none">
      <input type="password" class="input" placeholder="*****" style="width: 285px; height: 50px; margin-bottom: 25px; padding-left:10px; font-size: 15px; background: #fff; border: 1px solid #ccc; border-radius: 4px; border-color:#6e8095; outline: none">
      <input type="submit" value="Ingresar" class="ingresar" style="width: 100%; height: 50px; padding: 0; font-size: 20px; color: #fff; text-align: center; background: #5499C7; border: 0; border-radius: 5px; cursor: pointer; outline:0">
      <p class="contraseñaO" style="text-align:center; margin-bottom:0px"><a style="color:white; text-decoration:none; font-size:13px">¿Olvidó la contraseña?</a></p>
  </form>


  </div>

</div>

</template>
<script>
export default{
  data(){
    return{
      title:'WorstBest'
    }
  },
  mounted:function(){
    console.log('Index.vue')
  }
}
</script>
