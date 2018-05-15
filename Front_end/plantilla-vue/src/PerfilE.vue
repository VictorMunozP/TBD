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
      title:'(nombre empresa)'
    }
  },
  mounted:function(){
    console.log('PerfilE.vue')
  }
}
</script>