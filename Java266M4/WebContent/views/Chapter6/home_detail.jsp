<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form class="form-search" method="get"
	action="${pageContext.request.contextPath}/home/search.html">
	<input type="text" placeholder="Search..." name="q">
	<button class="btn btn-primary">Search</button>
</form>

<div class="products">
	<div class="col-5">
		<img style="width: 300px;" src="${pageContext.request.contextPath}/upload/${o.imageUrl}">
	</div>
	<div class="col-7">
		<h2>${o.title}</h2>
		<p>
			ISBN: <b>${o.isbn}</b>
		</p>
		<p>
			Pages: <b>${o.pages}</b>
		</p>
		<p>
			Price: <b>${o.price}</b>
		</p>
		<form method="post"
			action="${pageContext.request.contextPath}/cart/add.html">
			<input type="hidden" value="${o.id}" name="productId"> <input
				type="number" name="quantity" value="1">
			<button class="btn btn-primary">Add to Cart</button>
		</form>
	</div>
</div>