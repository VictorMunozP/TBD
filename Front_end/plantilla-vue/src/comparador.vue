<template>
  <!--section class="container"-->
  <section class="container">
    <!--ul>
      <li><router-link to="/">Home</router-link></li>
      <li><router-link to="/chartjs">vue-chartjs</router-link></li>
      <li><router-link to="/charts">vue-charts</router-link></li>
      <li><router-link to="/chartkick">vue-chartkick</router-link></li>
    </ul-->
    <h1>Demo examples of vue-charts</h1>

    <b-container class="bootstrapVue-example-row">
    <b-row>
        <b-col>
          <label for="juego1" class="form-control-label"></label>
          <select id="juego1" name="juego1" class="form-control" required>
          <option selected disabled hidden></option>
          <option value="J1">Juego_1</option>
          <option value="J2">Juego_2</option>
          <option value="J3">Juego_3</option>
          </select>
        </b-col>
        <b-col>comparar con </b-col>
        <b-col>
          <label for="juego2" class="form-control-label"></label>
          <select id="juego2" name="juego2" class="form-control" required>
          <option selected disabled hidden></option>
          <option value="J1">Juego_1</option>
          <option value="J2">Juego_2</option>
          <option value="J3">Juego_3</option>
          </select>
        </b-col>
        <button type="compare">Comparar</button>
    </b-row>
    </b-container>




    <div class="columns">
      <div class="column">
        <h3>Line Chart</h3>
        <!--Line Chart Example-->
        <chartjs-line></chartjs-line>
      </div>
      <div class="column">
        <h3>Bar Chart</h3>
        <!--Bar Chart Example-->
        <canvas id="1" :count="2"></canvas>
        <chartjs-bar :target="1" :label="label1" :labels="labels" :data="data1"></chartjs-bar>
        <chartjs-bar :target="1" :label="label2" :labels="labels" :data="data2"></chartjs-bar>
      </div>
    </div>
    <div class="columns">
      <div class="column">
        <h3>Radar Chart</h3>
        <!--Radar Chart Example-->
        <chartjs-radar></chartjs-radar>
      </div>
      <div class="column">
        <h3>Data Binding Line Chart</h3>
        <!--Data Binding Line Chart Example-->
        <form @submit.prevent="addData">
          <input placeholder="Add a Data" v-model="dataentry">
          <input placeholder="Add a Label" v-model="datalabel">
          <button type="submit">Submit</button>
        </form>
        <chartjs-line :labels="labels" :data="dataset" :bind="true"></chartjs-line>
      </div>
    </div>
  </section>
</template>

<script>
  export default {
    name: 'VueCharts',
    data () {
      return {
        label1: 'hola',
        label2: 'chao',
        labels: ['Buenos', 'Malos', 'Neutros'],
        data1: [1,2,3],
        data2: [4,5,6]
      }
    },
    //-----------------------------------------------
    methods: {
      addData () {
        this.dataset.push(this.dataentry)
        this.labels.push(this.datalabel)
        this.datalabel = ''
        this.dataentry = ''
      }
    }
    //-------------------------------------------------
  }
</script>

<style scoped>
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #7d42b9;
  }
</style>
