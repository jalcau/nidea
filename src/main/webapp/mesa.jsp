<%@page import="com.ipartek.formacion.nidea.pojo.Mesa"%>

<jsp:include page="templates/navbar.jsp"></jsp:include>

<%
//recoger atributo del controlador, si es que existe

Mesa mesa =(Mesa)request.getAttribute("mesa");
String[] materiales = (String[])request.getAttribute("materiales");
int[] materialesCodigo = (int[])request.getAttribute("materialesCodigo");
if(mesa==null){
	mesa =new Mesa();
}


%>
	
<p>Precio: <%=mesa.Suma() %> &euro;</p>


<form action="generar-mesa" method="post">
	<label for="patas">Numero de patas</label>
	<input type="number" value="4" name="patas" required>
<br>	
	<label for="dimension">Dimension en m2: </label>
	<input type="number" value="<%=mesa.getDimension()%>" name="dimension" required>
<br>
<label for="material">Selecciona Material:</label>
<select name="material">
	<% for ( int i=0; i < materiales.length; i++ ) { %>
	<% } %>
 
</select>
<br>
<input type="submit" value="Calcular Precio">
</form>


