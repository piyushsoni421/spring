<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="test" uri="/WEB-INF/tlds/custom.tld"%>
<%@taglib prefix="add" uri="/WEB-INF/tlds/addition.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@page import="com.yash.service.Label"  %>
<%@page import="com.yash.service.LabelValue"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function myFunction()
{
	
	if(${appBean.label.labelName !=null })
		{
		
	var m="<add:addition  first="${appBean.label.labelId}" second="<%=LabelValue.m %>"/>";
		
	alert(m);
		
		 
	  <c:if test="${appBean.label.region || appBean.label.labelName }"> 
	  
	 /*  alert('\"This is a great day.\"'); */
	 <%-- alert( <add:addition  first="${appBean.label.labelId}" second="<%=LabelValue.m %>" />); --%>
	   
	    </c:if>
}}

function popupwindow(){
	
	mywindow=open('/springjsppoc/interceptor','comment','resizable=no,width=300,height=350');
	mywindow.location.href='/springjsppoc/interceptor';
	
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
	<h2 align="center">${appBean.label.labelId}</h2>
	<h2 align="center">${appBean.label.labelName }</h2>
SUBSTRING OF(PIYUSH SONI, 1, 4) is
    <font color="blue">
    <test:substring input="PIYUSH SONI" start="1" end="4"/>
    </font><br/><br/>
    
     <font color="red">
     Additon of ${appBean.label.labelId} and 10 is 
    <add:addition  first="${appBean.label.labelId}" second="<%=LabelValue.m %>"/>
   </font><br/><br/>
  <%--   <c:set var="appBean" value="${appBean.label.region}"/> --%>
   <c:if test="${!appBean.label.euRegion && appBean.label.labelName !=null}">
   I m here
   </c:if>
 <c:if test="fn:containsIgnoreCase(<%=LabelValue.key %>,'JD PARTS')">
   <p>Found test string<p>
</c:if>

 <button type="button" onclick="myFunction()">Click Me!</button><br/>
 <c:set var="theString"  value="<%=LabelValue.key %>"/>
  
 <c:if test="${ fn:containsIgnoreCase(theString,appBean.label.labelName)}">
   <p>Found test string<p>
</c:if>
<c:choose>
    <c:when test="${fn:length(appBean.dealeridcitylist) gt 0 }"> 
      <c:forEach var="iterate" items="appBean.dealeridcitylist">
      <c:if test="true">
     hello
      </c:if>
      
      
      </c:forEach>
      
    
    </c:when> 
    <c:otherwise> 
        <c:choose>
            <c:when test="false"> 
                <!-- do different stuff -->
            </c:when> 
            <c:otherwise> 
             under else
            </c:otherwise>
        </c:choose>
    </c:otherwise> 
</c:choose>
<c:set var="vv" value="${appBean.label.labelName}"/>
<c:if test="${not empty appBean.label.labelName && fn:containsIgnoreCase(vv,appBean.label.labelName) }">
not empty 

</c:if>
<input  type="button" name="but" value="<add:addition  first="${appBean.label.labelId}" second="<%=LabelValue.m %>"/>" onclick=" popupwindow()">
<!--To access isRegion3 label boolean value 
then we have to use region3 convention  -->
  <a href="http://www.google.com" ><test:substring input="PIYUSH SONI" start="1" end="4"/></a>
</body>
</html>