<%@ tag description="Page Layout" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ attribute name="title" required="true" description="The JSP page title" %>
<%@ attribute name="context" required="true" description="Page root context" %>

<!DOCTYPE html>
<html>
	<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<title>${title}</title>
		<link href="${context}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
	  	<nav class="navbar navbar-inverse navbar-static-top" data-role="navigation">
        	<div class="container">    
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle Navigation</span> <span class="icon-bar"></span>
                        <span class="icon-bar"></span> <span class="icon-bar"></span>
                    </button>
                </div>

        		<div class="collapse navbar-collapse navbar-ex1-collapse">
        			<ul class="nav navbar-nav">
                        <li class="${empty title || title == 'Home' ? 'active' : ''}">
                            <a href="${context}/">Home</a>
                        </li>
                        <li class="${empty title || title == 'Contacts' ? 'active' : ''}">
                            <a href="${context}/contacts">Contacts</a>
                        </li>
        			</ul>
        		</div>
        	</div>
        </nav>
		<div class="container">
            <c:if test="${not empty msg}">
                <div class="alert alert-${css} alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <strong>${msg}</strong>
                </div>
            </c:if>
			
			<jsp:doBody/>

            <footer>
            </footer>
		</div>
        <script src="${context}/resources/bower_components/jquery/dist/jquery.min.js"></script>
		<script src="${context}/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	</body>
</html>