<template>

<div style="padding-top: 50px">


	<h2 style="color: #2980B9">{{title}} </h2>
	<br/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">

  <div class="container" >
		<form name="cadastro" class="card px-3 py-3" novalidate style="background-color: #F2F3F4">

			<div class="row">
				<div class="col-md form-group">
					<label for="nombre" class="form-control-label">Nombre Empresa</label>
					<input id="nombre"  name="nombre" type="text" class="form-control" required>
				</div>
		  </div>

		  <div class="row">
				<div class="col-md form-group">
					<label for="rut" class="form-control-label">Rut</label>
					<input id="rut" name="rut"  class="form-control" required>
				</div>

				<div class="col-md form-group">
					<label for="email" class="form-control-label">E-mail</label>
					<input id="email" name="email" type="email" class="form-control" required>
				</div>
		  </div>

		  <div class="row">
				<div class="col-md form-group">
					<label for="pass" class="form-control-label">Contraseña</label>
					<input id="pass"  name="pass" type="text" class="form-control" required>
				</div>

				<div class="col-md form-group">
					<label for="idade" class="form-control-label">ID</label>
					<input id="idade" min="16" name="idade" type="number" class="form-control" required>
				</div>

				<div class="col-md-2 form-group">
					<label for="pais" class="form-control-label">País</label>
					<select id="pais" name="pais" class="form-control" required>
					<option selected disabled hidden></option>
					<option value="Ar">Argentina</option>
					<option value="Bo">Bolivia</option>
					<option value="Br">Brasil</option>
					<option value="Ch">Chile</option>
					<option value="Co">Colombia</option>
					<option value="Ec">Ecuador</option>
					<option value="Gu">Guyana</option>
					<option value="Pa">Paraguay</option>
					<option value="Pe">Perú</option>
					<option value="Su">Surinam</option>
					<option value="Ur">Uruguay</option>
					<option value="Ve">Venezuela</option>
					</select>
				</div>
		  </div>

		  <div class="mt-1">
				<button style="background-color: #5499C7" type="submit" class="btn btn-primary">Registrar</button>
				<button style="background-color: #AAB7B8" type="reset" class="btn btn-secondary">Cancelar</button>
		  </div>

		</form>
	</div>
</div>

</template>

<script>
export default{
  data(){
    return{
      title:'Registrar Empresa'
    }
  },
  mounted:function(){
    console.log('RegistrarE.vue')
  }
}
</script>
