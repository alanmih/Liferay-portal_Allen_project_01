<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="Please enter and add a guestbook"/></b>
</p>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/guestbook/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

	<%-- Follwoing line will cause the the guestbook-web fail to deploy, reason to be checked --%>
	<%-- <aui:model-context bean="<%= entry %>" model="<%= GuestbookEntry.class %>" /> --%>

	<aui:fieldset>

		<aui:input name="name" />
		<aui:input name="email" />
		<aui:input name="Phone" />
		<aui:input name="Address" />
		<aui:input name="message" />
		<aui:input name="entryId" type="hidden" />

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
    	<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>

