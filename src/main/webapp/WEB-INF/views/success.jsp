<%@ include file="header.jsp"%>

<div class="container">

	<!-- Static navbar -->
	<div class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="<spring:url value="/" />">Spring
					Learning</a>
			</div>
			<div class="navbar-collapse collapse">


				<ul class="nav navbar-nav">
					<li class="${current == 'index' ? 'active' : ''}"><a
						href='<spring:url value="/" />'>Home</a></li>
					<li class="${current == 'register' ? 'active' : ''}"><a
						href="<spring:url value="/register.html" />">Register</a></li>
					<li class="${current == 'shopping' ? 'active' : ''}"><a
						href="<spring:url value="/shopping.html" />">Shopping</a></li>
					<li class="${current == 'shopping' ? 'active' : ''}"><a
						href="<spring:url value="/shopping.html" />">Spring</a></li>
				</ul>

			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.container-fluid -->
	</div>


	<div class="jumbotron">


		<table class="table">

			<tr>
				<td>email</td>
				<td>${student1.email}</td>
			</tr>
			<tr>
				<td>password</td>
				<td>${student1.password}</td>
			</tr>
			<tr>
				<td>mobno</td>
				<td>${student1.mobno}</td>
			</tr>
			

			<tr>
				<td>city</td>
				<td>${student1.studentaddress.city}</td>
			</tr>
			<tr>
				<td>state</td>
				<td>${student1.studentaddress.state}</td>
			</tr>
			<tr>
				<td>country</td>
				<td>${student1.studentaddress.country}</td>
			</tr>




		</table>
	</div>



</div>

<%@ include file="footer.jsp"%>
