<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form class="form-search" method="get" action="${pageContext.request.contextPath}/home/search.html">
	<input type="text" placeholder="Search..." name="q" >
	<button class="btn btn-primary">Search</button>
</form>
<div class="products">
	<c:forEach var="o" items="${list}">
		<div class="col-4">
			<div class="item">
				<img alt="${o.title}" src="${pageContext.request.contextPath}/upload/${o.imageUrl}">
				<div class="info">
					<a href="${pageContext.request.contextPath}/home/detail.html/${o.id}">${o.title}</a>
				</div>
			</div>					
		</div>
	</c:forEach>
	<div class="clear"></div>
</div>
<ul class="pagination">
	<c:forEach begin="1" end="${n}" step="1" var="i">
		<li class="page-item">
			<a class="page-link" href="${pageContext.request.contextPath}/home/list.html/${i}">${i}</a>
		</li>
	</c:forEach>
</ul>
