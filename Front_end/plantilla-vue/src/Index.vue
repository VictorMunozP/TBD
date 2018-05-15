<template>

<div class="center">
  
  <h2>{{title}}</h2>
  <p> República Gamer a tiempo real </p>
  <img class="logo-big" src="./img/wbt.png" />
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
