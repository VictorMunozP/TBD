<template>
  
  <div>
    <header>
      <div class="branding">
        <img class ="logo-small" src="./img/joystick.png" />
        <span>WorstBest</span>
      </div>
      <nav>
        <a href="/">Home</a>
        <a href="#/registroE">Agregar Empresa</a>
        <a href="#/eliminarE">Eliminar Empresas</a>     
        <a href="#/perfil">Perfil</a>
        <a href="#/comparador">Comparador</a>  
               
      </nav>
    </header>

    <main class="container">
      <router-view></router-view>
    </main>

</div>
</template>

<script>
export default {

}
</script>
