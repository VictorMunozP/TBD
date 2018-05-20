<script>
  //Importing Line class from the vue-chartjs wrapper
  import {Line} from 'vue-chartjs'
  //Exporting this so it can be used in other components
  //export default Line.extend({
  export default{
    extends: Line,
    data () {
      return {
        datacollection: {
        //Data to be represented on x-axis
          labels: ['Januero', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
          datasets: [
            {
              label: 'Data One',
              backgroundColor: [
                'rgba(42, 67, 178, 0.2)',
                'rgba(42, 67, 178, 0.2)',
                'rgba(42, 67, 178, 0.2)',
                'rgba(42, 67, 178, 0.2)',
                'rgba(42, 67, 178, 0.2)',
                'rgba(42, 67, 178, 0.2)'
              ],
              borderColor: [
                'rgba(42, 67, 178, 1)',
              ],
              pointBackgroundColor: 'white',
              borderWidth: 1,
              pointBorderColor: '#33d22d',
              //Data to be represented on y-axis
              data: [10,56,25,7,43,45,78]
            },
            {
              label: 'Data Two',
              backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
              ],
              borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
              ],
              pointBackgroundColor: 'white',
              borderWidth: 1,
              pointBorderColor: '#249EBF',
              //Data to be represented on y-axis
              data: [4,345,34,23,54,23,45,34,23,23]
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
          backgroundColor: { fill:'transparent'},
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
