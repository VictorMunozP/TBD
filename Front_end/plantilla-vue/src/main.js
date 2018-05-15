require("./style.scss");
import Vue from 'vue';
import VueRouter from 'vue-router';
import Index from './Index.vue';
import VueResource from 'vue-resource';
import App from './App.vue';
import RegistrarE from './RegistrarE.vue';
import GestionarE from './GestionarE.vue';

Vue.use(VueRouter);
Vue.use(VueResource);
const routes = [
  { path: '/index', alias: '/', component: Index},
  { path: '/registroE', component: RegistrarE},
  { path: '/gestionE', component: GestionarE},
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
