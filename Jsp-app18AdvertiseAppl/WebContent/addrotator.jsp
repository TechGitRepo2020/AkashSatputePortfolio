<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    
    <jsp:useBean id="rotator"  class="com.nt.rotator.AddRotator" scope="session"/>
    <%
    	rotator.nextAdvertisement();
    	response.setHeader("refresh","2");    
    
    %>
    
    <a href='<jsp:getProperty property="link" name="rotator"/>'>
    	<img src='<jsp:getProperty property="image" name="rotator"/>'    
    </a>
    
    
    <h1>daily hunt</h1>