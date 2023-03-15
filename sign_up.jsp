<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Sign_up</title>
</head>
<body>
	<nav>
		<div class="logos">
			<img src="image/Doctor_logo.png" alt="img" id="logo">
			<h3 class="logo_text">
				Health Care
				</h2>
		</div>
		<div class="list">
			<a href="loginpage.html">Log in</a>
		</div>
	</nav>
	<form action="u_register" method="post">
		<div class="outer">
			<h2 class="logo_text">Sign Up</h2>
			<div class="input_log">
				<input name="name" type="text" placeholder="User Name"> 
				<input name="email" type="email" placeholder="Email Id"> 
				<input name="pass" type="password" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{5,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 5 or more characters">
				<input name="phone" type="tel" placeholder="1234567890" pattern="[0-9]{10}"> 
			</div>

			<div>
				<Button class="btn ">Sign up</Button>
			</div>
		</div>
	</form>
	<footer>
		<p1>Souvik copy right </p1>
		<br>
		<p2>Email:Souvik@gmail.com </p2>
	</footer>
</body>
</html>