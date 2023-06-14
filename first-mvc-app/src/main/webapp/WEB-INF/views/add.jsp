
<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>

<div class="container my-5">

<c:if test="${ ErorrVali.length() >3 }">
<div class="alert alert-warning" role="alert">
<c:out value=" ${ ErorrVali }"></c:out>
</div>
</c:if>



<h1> ${erorrMs} </h1>

<form action="/add-student" method="post">
<input type="hidden" name = "${_csrf.parameterName }" value="${_csrf.token}" >
  <div class="form-group">
  
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control"  placeholder="Name" name="name">
   
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Date</label>
    <input type="text" class="form-control" placeholder="Date" name="date">
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>





<%@ include file="includes/footer.jspf" %>