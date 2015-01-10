<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form class="form-horizontal" role="form" action="/Day9_SpringMVCForm/submituserdata.html" method="POST" >
 
 
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email:</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" name="email" id="email" placeholder="Enter email">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Password:</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" name="password" id="password" placeholder="Enter password">
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">mobnno:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="mobno" id="mobno" placeholder="Enter password">
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">address:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="address" id="address" placeholder="Enter password">
    </div>
  </div>

 
 
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
</form>



</body>
</html>