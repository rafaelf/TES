<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
<script src="/codepress/codepress.js" type="text/javascript"></script> 
<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		 ${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="<c:url value="/codigos"/>" method="post">
  
  <c:if test="${not empty codigo.id}">
    <input type="hidden" name="codigo.id" value="${codigo.id}"/>
    <input type="hidden" name="_method" value="put"/>
  </c:if>

  <div class="field">
    Nome:<br />
    <input type="text" name="codigo.nome" value="${codigo.nome}"/>
  </div>
  <div class="field">
    Tags:<br />
    <input type="text" name="codigo.tags" value="${codigo.tags}"/>
  </div>
  <div class="field">
    Linguagem:<br />
    <input type="text" name="codigo.linguagem" value="${codigo.linguagem}"/>
  </div>
<div class="field">
    Trecho:<br />
    <textarea name="codigo.trecho" cols="100" rows="15" class="codepress java linenumbers-off" value="${codigo.trecho}">${codigo.trecho}</textarea> 
  </div>
  <div class="actions">
    <button type="submit">send</button>
  </div>
</form>

<a href="<c:url value="/codigos"/>">Back</a>
</body>
