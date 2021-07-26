<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout title="Contacts"
	context="${pageContext.servletContext.contextPath}">
	<jsp:body>
       <form>
           <div class="form-group">
               <label for="firstName">First Name</label>
               <input id="firstName" value="${contact.firstName}" class="form-control" readonly>
           </div>
           
           <div class="form-group">
               <label for="lastName">Last Name</label>
               <input id="lastName" value="${contact.lastName}" class="form-control" readonly>
           </div>

           <div class="form-group">
               <label for="organisationId">Organisation Name</label>
               <input id="organisationId" value="${contact.organisationName}" class="form-control" readonly>
           </div>

           <div class="form-group">
               <label for="createdDate">Created</label>
               <input id="createdDate" value="${contact.createdDate}" class="form-control" readonly>
           </div>

           <div class="form-group">
               <a href="${pageContext.servletContext.contextPath}/contacts/${contact.id}/edit" class="btn btn-info">
                   Edit
               </a>
           </div>
       </form>
    </jsp:body>
</t:layout>