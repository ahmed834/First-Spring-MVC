
<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>




<div class="container my-5">


<h1> ${erorrMs} </h1>

<form action="/login" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control"  placeholder="Name" name="name">
   
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" placeholder="Password" name="password">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>




<%@ include file="includes/footer.jspf" %>