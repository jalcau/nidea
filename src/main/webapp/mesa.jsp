<%@page import="com.ipartek.formacion.nidea.pojo.Mesa"%>

<jsp:include page="templates/navbar.jsp"></jsp:include>

<%
//recoger atributo del controlador, si es que existe

Mesa mesa =(Mesa)request.getAttribute("mesa");
if(mesa==null){
	mesa =new Mesa();
}





%>

<p>Precio: <%=mesa.Suma() %> &euro;</p>


<form action="generar-mesa" method="post">
<label for="patas">Numero de patas</label>
<input type="number" value="4" name="patas" required>
<br>	
<label for="dimension">Dimension </label>
<input type="number" value="1" name="dimension" required>
<br>

<label for="dimension">Color  <input type="checkbox" value=""></label>

 
</div>
<br>
<input type="submit" value="Calcular Precio">


</form>


<jsp:include page="templates/footer.jsp"></jsp:include>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>