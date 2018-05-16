<template>

<div class="cuerpo">
    <h2 style="color: #2980B9">{{title}} </h2>
	<br/>


    <div>
      <div style="border-width: 90%; border-style: solid; border-color: lightgrey; width:90%">
        <h2 style="text-align: center"> Nombre Empresa </h2>
      </div>
      <br/>

      <!-- Columna Izquierda -->
      <div style="float: left; padding-left: 50px">

        <div calign="center">
          <img class="img-responsive img-portfolio img-hover" src="./img/fotoPerfil.png" style="max-width: 200px">
           <ul >
            <a href="#/configuracion" class="list-group-item"><strong> Configuración </strong></a> <br/>
          </ul>
        </div>

 

      </div>

      <!-- Columna Derecha -->
      <div style="float: left; padding-left: 250px">

      <div style="font-size:20px">
        <p><strong> Información de Empresa </strong></p>
          <a> Nacionalidad:  </a> <br/><br/>
          <a> Sucursales en países:  </a> <br/><br/>
          <a> Contacto: </a> <br/><br/>
          <a> Página Web: </a> <br/><br/>
      </div>

    </div>




  </div>
      



</div>

</template>

<script>
export default{
  data(){
    return{
      title:'Mi Perfil'
    }
  },
  mounted:function(){
    console.log('PerfilE.vue')
  }
}
</script>