
<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>
<div class="container my-5">

<h1>Hello ${name} </h1>



<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Date</th>
      <th scope="col">Active</th>
      <th scope="col">Delete</th>
      <th scope="col">Edit</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${students}" var ="stud">
    <tr>
      <th scope="row">${stud.id}</th>
      <td>${stud.name}</td>
      <td>${stud.date}</td>
      <td>${stud.isActive}</td>
      <td> <a href="/delete-student?id=${stud.id}" class="btn btn-danger" >Delete</a> </td>
      <td> <a href="/edit-student?id=${stud.id}" class="btn btn-success" >Edit</a> </td>
    </tr>
   </c:forEach>
  
  </tbody>
</table>


</div>








<div class="container">
<a  class="btn btn-primary" href="/add-student" > Add Student</a>
</div>



<%@ include file="includes/footer.jspf" %>
