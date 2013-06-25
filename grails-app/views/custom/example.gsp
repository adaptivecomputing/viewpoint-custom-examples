<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<title>Custom Example</title>
<meta name="layout" content="main" />

<r:require module="core"/>

<r:require module="extensions"/>

</head>
<body>
	<cm:header code="Example Custom Page" imagesrc="${resource(dir:'images/icons',file:'service-req.png')}"></cm:header>
<!-- The folowing div uses the value specified for the key origScript in the model map returned from the associated groovy script. i.e. model:[origScript:<some value>] -->
<div>The original script = ${origScript}</div>
<!-- the user is passed into the view by default -->
<div>User = ${user.username}</div>
<div>User is root = ${user.root}</div>
</body>
</html>
