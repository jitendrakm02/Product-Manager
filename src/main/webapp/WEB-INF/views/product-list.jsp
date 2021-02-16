<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%> 
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%> 
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
    <div align="center">
        <h1>Employee List</h1>
        <h3>
            <a href="newProduct">New Product</a>
        </h3>
        <table border="1">
        <tr>
            <th>Product Id</th>
            <th>Product Name</th>
            <th>Product Price</th>
            <th>Product Type</th>
            <th>Product Quantity</th>
            <th>Product Description</th>
           
            <th>Action</th>
        </tr>
            <c:forEach var="prod" items="${products}">
                <tr>
 
                    <td>${prod.pid}</td>
                    <td>${prod.pname}</td>
                    <td>${prod.price}</td>
                    <td>${prod.ptype}</td>
                    <td>${prod.pquantity}</td>
                    <td>${prod.pdescription}</td>
                    <td><a href="editProduct?pid=${prod.pid}">Edit</a>
                             <a
                        href="deleteProduct?pid=${prod.pid}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
   
</html>