<link href="/stylesheet/layout.css" rel="stylesheet" type="text/css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<body>
<h1 align="center">Lista de Codigos</h1>
<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		 ${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<table width="862" border="1" align="center" class="tabelaFiltro">
  <tr>
   <th width="112" class="td_titulo_pagina">nome</th>
   <th width="102" class="td_titulo_pagina">tags</th>
   <th width="141" class="td_titulo_pagina">linguagem</th>
   <th width="246" class="td_titulo_pagina">trecho</th>
   <th width="81" class="td_titulo_pagina"></th>
   <th width="118" class="td_titulo_pagina"></th>
   <th width="16"></th>
  </tr>

<c:forEach items="${codigoList}" var="codigo">
  <tr>
      <td height="63">
      ${codigo.nome}    </td>
      <td>
      ${codigo.tags}    </td>
      <td>
      ${codigo.linguagem}    </td>
      <td>
      ${codigo.trecho}    </td>
     <!--<td><a href="<c:url value="/codigos/${codigo.id}"/>">show</a></td> -->
    <td align="center"><a href="<c:url value="/codigos/${codigo.id}/edit"/>">editar</a></td>
    <td align="center">
      <form action="<c:url value="/codigos/${codigo.id}"/>" method="post">
    	  <input type="hidden" name="_method" value="delete"/>
    	  <button type="submit" onClick="return confirm('Are you sure?')">
    	  <div align="center">Excluir</div>
    	  </button>
	    </form>	  </td>
    </tr>
</c:forEach>
</table>

<form action="<c:url value="/codigos/busca"/>"  method="post">
<div class="field" >
    <div align="center">
      <p>
        <input type="text" name="trecho" />
        </p>
  </div>
</div>

 <div class="actions">
    <div align="center">
      <button type="submit">Buscar</button>
    </div>
</div>
 <div align="center"><br> 
   <br> 
 </form>
   </td>
   
 </div>
 <p align="center"><br />
     <a href="<c:url value="/codigos/new"/>">New Codigo</a> </p>
	 
</body>
