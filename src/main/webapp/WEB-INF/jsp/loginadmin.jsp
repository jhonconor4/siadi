<%-- 
    Document   : login
    Created on : 05/09/2019, 04:11:32 PM
    Author     : roca
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="indexModule">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>
        <jsp:include page="shared/favicon.jsp" flush="true"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap/bootstrap-3.3.6.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/fonts/css/font-awesome.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/admin/animate.min.css" rel="stylesheet">

        <link href="${pageContext.request.contextPath}/assets/css/admin/cmxform.css" rel="stylesheet" type="text/css"/>

        <link href="${pageContext.request.contextPath}/assets/css/admin/site.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/admin/custom.css" rel="stylesheet">
        <script type="text/javascript">
            var contextPath = '${pageContext.request.contextPath}';
        </script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap/bootstrap-3.3.6.min.js" type="text/javascript"></script>

        <script src="${pageContext.request.contextPath}/assets/js/jquery/jquery.validate.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/assets/js/admin/custom.js" type="text/javascript"></script>

        <script src="${pageContext.request.contextPath}/assets/js/angular/angular.min.js" type="text/javascript"></script>
    </head>
    <body style="background:#F7F7F7;" ng-controller="loginadminController" ng-cloak>
        <div class="">
            <a class="hiddenanchor" id="toregister"></a>
            <a class="hiddenanchor" id="tologin"></a>
            <div id="wrapper">
                <div id="login" class="animate form">
                    <section class="login_content">
                        <form name="formulario" ng-submit="autenticar(formulario)" ng-validate="validate">
                            <h1>Autenticación</h1>
                            <div style="padding-bottom: 20px">
                                <input ng-model="usuario.usuario" type="text" name="usuario" class="form-control input-sm" placeholder="ID USUARIO" autofocus="">
                            </div>
                            <div style="padding-bottom: 20px">
                                <input ng-model="usuario.contrasena" type="password" name="contrasena" class="form-control input-sm" placeholder="CONTRASEÑA">
                            </div>
                            <p ng-show="showmessage" class="error-message">
                                {{message}}
                            </p>
                            <div style="text-align: center">
                                <button class="btn btn-default submit" type="submit">Ingresar</button>
                            </div>
                            <div class="clearfix"></div>
                            <div class="separator">
                                <div class="clearfix"></div>
                                <br>
                                <div>
                                    <h1><i class="fa fa-paw" style="font-size: 26px;"></i> SIF!</h1>
                                    <p>©2019 Todos los derechos reservados ROCA E.I.R.L</p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/assets/js/angular/angular-validate.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/assets/js/angular/angular-local-storage.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/assets/js/angular/angular-components.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/assets/js/angular/angular-pagination.js" type="text/javascript"></script>

        <script src="${pageContext.request.contextPath}/assets/controller/indexModule.js" type="text/javascript"></script>
    </body>
</html>
