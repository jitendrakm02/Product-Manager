<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page isELIgnored = "false" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
    <div align="center">
        <h1>Update Product</h1>
        <form:form action="saveProduct" method="post" modelAttribute="product">
        <table>
        
            <form:hidden path="pid"/>
            <tr>
                <td>Product Name:</td>
                <td><form:input path="pname" /></td>
            </tr>
            <tr>
                <td>Product Price:</td>
                <td><form:input path="price" /></td>
            </tr>
          
            <tr>
                <td>Product quantity:</td>
                <td><form:input path="pquantity" /></td>
            </tr>
             <tr>
                <td>Product Type:</td>
                <td><form:input path="ptype" /></td>
            </tr> 
             <tr>
                <td>Product Description:</td>
                <td><form:textarea path="pdescription" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
        
    </div>
</body>
   
</html>