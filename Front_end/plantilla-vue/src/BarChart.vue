<script>
  //Importing Bar class from the vue-chartjs wrapper
  import {Bar} from 'vue-chartjs'
  //Exporting this so it can be used in other components
  //export default Bar.extend({
  export default{
    extends: Bar,
    data () {
      return {
        datacollection: {
          //Data to be represented on x-axis
          labels: ['Tweets Positivos', 'Tweets Negativos', 'Tweets Neutros'],
          datasets: [
            {
              label: 'Juego 1',
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
              data: [40, 20, 30]
            },
            {
              label: 'Juego 2',
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
              data: [10, 30, 5]
            }
          ]
        },
        //Chart.js options that controls the appearance of the chart
        options: {
          scales: {
            yAxes: [{
              ticks: {
                beginAtZero: true
              },
              gridLines: {
                display: true
              }
            }],
            xAxes: [ {
              gridLines: {
                display: false
              }
            }]
          },
          legend: {
            display: true
          },
          responsive: true,
          maintainAspectRatio: false
        }
      }
    },
    mounted () {
    //renderChart function renders the chart with the datacollection and options object.
      this.renderChart(this.datacollection, this.options)
    }
  }
</script>
