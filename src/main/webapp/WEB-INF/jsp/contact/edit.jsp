<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:layout title="Contacts"
	context="${pageContext.servletContext.contextPath}">
	<jsp:body>
       <spring:url value="/contacts" var="actionUrl" />

                <form:form method="post" modelAttribute="contact"
			action="${pageContext.servletContext.contextPath}/contacts"
			commonName="contact">

                    <form:hidden path="id" />

                    <spring:bind path="firstName">
                        <div
					class="form-group ${status.error ? 'has-error' : ''}">
                            <label for="firstName">First Name <span
						style="color: red">*</span></label>
                            <form:input path="firstName" type="text"
						class="form-control" id="firstName" placeholder="First Name" />
                            <form:errors path="firstName"
						class="control-label" />
                        </div>
                    </spring:bind>
                    
                    <spring:bind path="lastName">
                        <div
					class="form-group ${status.error ? 'has-error' : ''}">
                            <label for="lastName">Last Name <span
						style="color: red">*</span></label>
                            <form:input path="lastName" type="text"
						class="form-control" id="lastName" placeholder="Last Name" />
                            <form:errors path="lastName"
						class="control-label" />
                        </div>
                    </spring:bind>

                    <spring:bind path="organisation.id">
                        <div class="form-group">
                            <label for="organisationId">Organisation</label>
                            <form:select id="organisationId"
						path="organisation.id" cssClass="form-control">
                                <form:option value="-1" label="--" />
                                <form:options items="${organisations}"
							itemValue="id" itemLabel="name" />
                            </form:select>
                        </div>
                    </spring:bind>

                    <div class="form-group">
                        <button type="submit" class="btn btn-primary">Save</button>
                        <a class="btn btn-info"
					href="${pageContext.servletContext.contextPath}/contacts/${contact.id}">
                            Cancel
                        </a>
                    </div>
                </form:form>
    </jsp:body>
</t:layout>