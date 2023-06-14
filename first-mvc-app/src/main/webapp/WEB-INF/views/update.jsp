
<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>


<div class="container my-5">


<h1> ${erorrMs} </h1>

<form action="/update-student" method="post">
<input type="hidden" name = "${_csrf.parameterName }" value="${_csrf.token}" >
	<input type="hidden"   value="${student.id}" name="id" >

  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control"  value="${student.name}" name="name" required>
   
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Date</label>
    <input type="text" class="form-control" value="${student.date}" name="date" required>
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>




<%@ include file="includes/footer.jspf" %>