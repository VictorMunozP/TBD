<template>
  
  <div>
    <header>
      <div class="branding">
        <img class ="logo-small" src="./img/joystick.png" />
        <span>WorstBest</span>
      </div>
      <nav>
        <a href="#/">Home</a>
        <a href="#/new">Agregar Empresa</a>
        <a href="#/new">Gestionar Empresas</a>         
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
