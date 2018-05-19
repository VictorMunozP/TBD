require("./style.scss");
import Vue from 'vue';
import VueRouter from 'vue-router';
import Index from './Index.vue';
import VueResource from 'vue-resource';
import App from './App.vue';
import RegistrarE from './RegistrarE.vue';
import EliminarE from './EliminarE.vue';
import PerfilE from './PerfilE.vue';
import ConfiguracionPE from './ConfiguracionPE.vue';
import Comparador from './comparador.vue';

//--------------vue-charts------------------------
import 'chart.js';
import 'hchs-vue-charts';

Vue.use(window.VueCharts);
//------------------------------------------------

Vue.use(VueRouter);
Vue.use(VueResource);
const routes = [
  { path: '/index', alias: '/', component: Index},
  { path: '/registroE', component: RegistrarE},
  { path: '/eliminarE', component: EliminarE},
  { path: '/perfil', component: PerfilE},
  { path: '/configuracion', component: ConfiguracionPE},
  { path: '/comparador', component: Comparador},
]

// Create the router instance and pass the `routes` option
const router = new VueRouter({
  routes
})

new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
