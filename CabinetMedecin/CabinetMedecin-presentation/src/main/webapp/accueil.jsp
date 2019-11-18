<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="listPatients" method="get" id="patientForm" role="form" >    
  <c:choose>
      <c:when test="${not empty patientList}">
          <table  class="table table-striped">
              <thead>
                  <tr>
                      <td>#</td>
                      <td>Name</td>
                      <td>Last name</td>
                      <td>Birth date</td>
                      <td>Role</td>
                      <td>Department</td>
                      <td>E-mail</td>
                  </tr>
              </thead>
              <c:forEach var="employee" items="${patientList}">
                  <c:set var="classSucess" value=""/>
                  <c:if test ="${idPatient == patient.id}">                           
                      <c:set var="classSucess" value="info"/>
                  </c:if>
                  <tr class="${classSucess}">
                      <td>${patient.id}</td>
                      <td>${patient.nom}</td>
                      <td>${patient.prenom}</td>
                      <td>${patient.email}</td>
                      <td>${patient.adresse}</td>
                      <td>${patient.sexe}</td>
                      <td>${patient.symptomes}</td>                        
                  </tr>
              </c:forEach>               
          </table>  
      </c:when>                    
      <c:otherwise>
      <br>  </br>           
          <div class="alert alert-info">
              No people found matching your search criteria
          </div>
      </c:otherwise>
  </c:choose>                        
</form>
</body>
</html>