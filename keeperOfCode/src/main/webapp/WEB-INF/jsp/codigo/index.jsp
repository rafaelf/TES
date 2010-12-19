<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>

<h1>Listing Codigos</h1>
<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		 ${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<table>
  <tr>
   <th>nome</th>
   <th>tags</th>
   <th>linguagem</th>
   <th>trecho</th>
   <th></th>
   <th></th>
   <th></th>
  </tr>

<c:forEach items="${codigoList}" var="codigo">
  <tr>
      <td>
      ${codigo.nome}
    </td>
      <td>
      ${codigo.tags}
    </td>
      <td>
      ${codigo.linguagem}
    </td>
      <td>
      ${codigo.trecho}
    </td>
     <!--<td><a href="<c:url value="/codigos/${codigo.id}"/>">show</a></td> -->
    <td><a href="<c:url value="/codigos/${codigo.id}/edit"/>">editar</a></td>
    <td>
      <form action="<c:url value="/codigos/${codigo.id}"/>" method="post">
    	  <input type="hidden" name="_method" value="delete"/>
    	  <button type="submit" onClick="return confirm('Are you sure?')">destroy</button>
	    </form>
	  </td>
    </tr>
</c:forEach>
</table>

<form action="<c:url value="/codigos/busca"/>" method="post">
 <div class="field" >
    <input type="text" name="trecho" />
  </div>

 <div class="actions">
    <button type="submit">Buscar</button>
  </div>
<br> <br> 
</form>
	  </td>

 <p><br />
     <a href="<c:url value="/codigos/new"/>">New Codigo</a> 
 </p>
</body>
