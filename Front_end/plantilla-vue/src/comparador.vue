<template>
  <section class="container">
    <h1>Selecciona los juegos a comparar</h1>

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
        <button type="compare" @click="fillData()" >Comparar</button>
    </b-row>
    </b-container>

    <h3>Gráfico comparador de juegos</h3>
    <reactive :chart-data="datacollection"></reactive>

    <!--bar-chart></bar-chart>
    <h3> Grafico de lineas</h3>
    <line-chart></line-chart>
    <chartjs-radar :datasets="datacollection.datasets"></chartjs-radar>
    <h3>al igual q este de burbujas, aunque podria ser util</h3>
    <bubble-chart></bubble-chart-->
  </section>
</template>

<script>
  import LineChart from './LineChart.vue';
  import BarChart from './BarChart.vue';
  import BubbleChart from './BubbleChart.vue';
  import Reactive from './Reactive.vue';

  export default {
    name: 'VueChartJS',
    components: {
      LineChart,
      BarChart,
      BubbleChart,
      Reactive
    },
    //---------------------------------------------------------------------
    data () {
      return {
        // instantiating datacollection with null
        datacollection: null
      }
    },
    created () {
    //anytime the vue instance is created, call the fillData() function.
      this.fillData()
    },
    methods: {
      fillData () {
        this.datacollection = {
          // Data for the y-axis of the chart
          labels: ['Tweets Positivos', 'Tweets Negativos', 'Tweets Neutros'],
          datasets: [
            {
              label: 'Opcion 1',
              backgroundColor: [
                'rgba(42, 67, 178, 0.2)',
                'rgba(42, 67, 178, 0.2)',
                'rgba(42, 67, 178, 0.2)'
              ],
              borderColor: [
                'rgba(42, 67, 178, 1)',
                'rgba(42, 67, 178, 1)',
                'rgba(42, 67, 178, 1)'
              ],
              pointBackgroundColor: 'white',
              borderWidth: 1,
              pointBorderColor: '#56bc6b',
              //Data to be represented on y-axis
              data: [this.getRandomInt(),this.getRandomInt(),this.getRandomInt()]
            },
            {
              label: 'Opcion 2',
              backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(255, 99, 132, 0.2)',
                'rgba(255, 99, 132, 0.2)'
              ],
              borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(255, 99, 132, 1)',
                'rgba(255, 99, 132, 1)'
              ],
              pointBackgroundColor: 'white',
              borderWidth: 1,
              pointBorderColor: '#56bc6b',
              //Data to be represented on y-axis
              data: [this.getRandomInt(), this.getRandomInt(), this.getRandomInt()]
            }
          ]
        }
      },
      getRandomInt () {
        // JS function to generate numbers to be used for the chart
        return Math.floor(Math.random() * (50 - 5 + 1)) + 5
      }
    }
    //--------------------------------------------------------------------
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
    color: #42b983;
  }
</style>
