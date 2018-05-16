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
      <div class="izquierda" style="float: left; padding-left: 50px">

        <div calign="center">
          <img class="img-responsive img-portfolio img-hover" src="./img/fotoPerfil.png" style="max-width: 200px">
           <ul >
            <a href="#" class="list-group-item"><strong> Cambiar Imagen </strong></a> <br/>
          </ul>
        </div>
      </div>

      <!-- Columna Izquierda -->
     
        <div class="derecha" style="float: left; padding-left: 150px">
          <form action="/action_page.php">

            <label> Nombre Empresa </label>
            <br />
            <input type="text" id="nombre" style="width: 500px; padding: 12px 20px; margin: 8px 0; display: inline-block; border: 1px solid #ccc; border-radius: 4px">
            <br />

            <label> E-mail </label>
            <br />
            <input type="text" id="e-mail" style="width: 500px; padding: 12px 20px; margin: 8px 0; display: inline-block; border: 1px solid #ccc; border-radius: 4px">
            <br />

            <label> Rut </label>
            <br />
            <input type="text" id="rut" style="width: 500px; padding: 12px 20px; margin: 8px 0; display: inline-block; border: 1px solid #ccc; border-radius: 4px">
            <br />

            <label> Contraseña </label>
            <br />
            <input type="text" id="pass" style="width: 500px; padding: 12px 20px; margin: 8px 0; display: inline-block; border: 1px solid #ccc; border-radius: 4px">
            <br />

            <label for="pais"> País </label>
            <br />
            <select id="pais" name="pais" style="width: 500px; padding: 12px 20px; margin: 8px 0; display: inline-block; border: 1px solid #ccc; border-radius: 4px">
              <option value="Ar">Argentina</option>
              <option value="Bo">Bolivia</option>
              <option value="Br">Brasil</option>
              <option value="Ch">Chile</option>
              <option value="Co">Colombia</option>
              <option value="Ec">Ecuador</option>
              <option value="Gu">Guyana</option>
              <option value="Pa">Paraguay</option>
              <option value="Pe">Perú</option>
              <option value="Su">Surinam</option>
              <option value="Ur">Uruguay</option>
              <option value="Ve">Venezuela</option>
            </select>
            <br /><br />
          
            <input type="submit" value="Guardar" style="width: 20%; background-color: #5499C7; color: white; padding: 14px 20px; border: none; border-radius: 4px">
            <input type="submit" value="Cancelar" style="width: 20%; background-color: #5499C7; color: white; padding: 14px 20px; border: none; border-radius: 4px">
          </form>
        </div>
      




  </div>
      



</div>

</template>

<script>
export default{
  data(){
    return{
      title:'Configuración'
    }
  },
  mounted:function(){
    console.log('ConfiguracionPE.vue')
  }
}
</script>