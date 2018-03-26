
<!-- FORMULARIO CALCULAR -->



<%@page import="com.ipartek.formacion.nidea.controller.CalculadoraController"%>
<jsp:include page="/templates/navbar.jsp"></jsp:include>
<%
	String msg = (String)request.getAttribute("msg");
	if (msg != null){
%>
		<div class="alert alert-warning alert-dismissible" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  <%=msg %>
</div>
<% 
	}
%>
<div class="container">

	<h2>Calculadora </h2>
	
	<form action="calculadora" method="post">
	<div class="form-group">
		
	  <div class="form-group">
    <label for="opcion1">Numero1</label>  <input type="text" class="form-control" name="num1" style="width:50px" >
	 
	  <select class="form-control" id="sel1" name="operacion">
   		 <option value="<%=CalculadoraController.OP_SUMAR%>">Sumar</option>
    	<option value="<%=CalculadoraController.OP_RESTAR%>">Restar</option>
    	<option value="<%=CalculadoraController.OP_MULTIPLICAR%>">Multiplicar</option>
   		 <option value="<%=CalculadoraController.OP_DIVIDIR%>">Dividir</option>
  </select>
	     <label for="opcion1">Numero2</label>  <input type="text" class="form-control" name="num2" style="width:50px">
	 
	 <input type="submit" value="Calcular" class=" btn-succes">
	
</div>
	 </div>
	</form>
</div>












<jsp:include page="/templates/footer.jsp"></jsp:include>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>