<%@ include file="header.jsp"%>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Login</th>
      <th scope="col">MobileNo</th>
      <th scope="col">Date of Birth</th>
      <td><a href="RegistrationCTL?id=<%=user.getId()%>">Edit</a></td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>1</td>
      <td>2</td>
      <td>3</td>
      <td>4</td>
    </tr>

  </tbody>
</table>
<%@ include file="footer.jsp"%>