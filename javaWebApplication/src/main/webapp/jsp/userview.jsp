<%@page import="com.javawebapp.utility.DataUtility"%>
<%@page import="com.javawebapp.beans.UserBeans"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.javawebapp.utility.ServletUtility"%>
<%@ include file="header.jsp"%>

<br>
<h2>User List</h2>
<br>
<h4 style="color: red;"><%=ServletUtility.getErrorMessage(request)%></h4>
<h4 style="color: green;"><%=ServletUtility.getSuccessMessage(request)%></h4>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Login</th>
      <th scope="col">MobileNo</th>
      <th scope="col">Date of Birth</th>
    </tr>
  </thead>
  <tbody>
  <%
          int index=1;
          List list=ServletUtility.getList(request);
          Iterator it=list.iterator();
          while(it.hasNext()){
          UserBeans user=(UserBeans)it.next();
  %>
    <tr>
      <th scope="row"><%=index++%></th>
      <td><%=user.getFirstName()+" "+user.getLastName()%></td>
      <td><%=user.getLogin()%></td>
      <td><%=user.getMobileNo()%></td>
      <td><%=DataUtility.getDateString(user.getDob())%></td>
    </tr>
<%} %>
  </tbody>
</table>
<%@ include file="footer.jsp"%>