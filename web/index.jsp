<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <title>Inicio Sesión</title>
        
    </head>
    <body>
         
<link rel="stylesheet" href="css/estilos.css">


        <div class="container">
    <div class="row">
        <form action="validate.do" method="post" >
            
            <div class="form-group">
                <label>nombre de usuario:</label>
                <input type="text" id="name" name="txtMail" placeholder="Usuario..." class="form-control"> 
            </div>
            
            <div class="form-group">
                <label -sm10>Contraseña:</label>
                <input type="password" id="contra" name="txtPass" placeholder="Contraseña..." class="form-control"> 
            </div>
            
            <div class="form-group">
                <label -sm10>documento:</label>
                <input type="text" id="document" name="doc" placeholder="Identificación..." class="form-control"> 
            </div>
            
            <div class="form-group" -sm-6 bg-white-text-center>
                <button class"btn btn-success" -sm-6 bg-white-text-center> Enviar </button> 
            </div>
            
        </form>
        
        
        
    </div>
    
    
    
</div>
    </body>
</html>
