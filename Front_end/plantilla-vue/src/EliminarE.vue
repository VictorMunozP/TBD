<template>

<div class="cuerpo">
    <h2 style="color: #2980B9">{{title}} </h2>
	<br/>

</div>

</template>

<script>
export default{
  data(){
    return{
      title:'Seleccione Empresa/s a eliminar'
    }
  },
  mounted:function(){
    console.log('EliminarE.vue')
  }
}
</script>
