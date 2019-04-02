<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page import ="java.util.*" %>
<%@ page import ="java.io.*" %>
<%@ page import ="DAO.*" %>
<%@ page import ="Bean.*" %>
<%@ page import ="Conexao.*" %>
<%@ page import ="Controlador.*" %>

<%
	Cliente[] vbCliente = (Cliente[]) request.getSession().getAttribute("listagemgeral");
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859" />
<title>Ravalic - Web Classificados - Versão HTML 5</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="style.css" type="text/css">
	<link href="css/lightbox.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Poppins:400,600,700,500,300' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,900italic,900,700italic,700,400italic,500,500italic,300,100italic,100,300italic' rel='stylesheet' type='text/css'>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
<body>
<header class="header">
	<div class="container">
		<div class="row">
			<div class="col-md-4 ">
			<div class="navbar-header">
					    <button type="button" class="navbar-toggle menu-button" data-toggle="collapse" data-target="#myNavbar">
					        <span class="glyphicon glyphicon-align-justify"></span>
					    </button>
      					<a class="navbar-brand logo" href="#">Classificados Web 5</a>
    			</div>
			</div>
			<div class="col-md-8">
				<nav class="collapse navbar-collapse" id="myNavbar" role="navigation">
					<ul class="nav navbar-nav navbar-right menu">
							<li><a href="index.html" class="page-scroll active">Inicio</a></li>
							<li><a href="cad-gerenciar_cliente.jsp" class="page-scroll">Clientes</a></li>
							<li><a href="cad-gerenciar_funcionario.jsp" class="page-scroll">Funcionarios</a></li>
							<li><a href="cad-gerenciar_anuncio.jsp" class="page-scroll">Anuncios</a></li>
							<li><a href="cad-gerenciar_tipoanuncio.jsp" class="page-scroll">Tipo de Anuncios</a></li>
							<li><a href="cad-gerenciar_sessao.jsp" class="page-scroll">Sessao</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
</header>

<div class="container-fluid main" id="page-top">
	<div class="row">
		<div class="col-md-12 backg">
			<div class="col-md-4 col-md-offset-4 inner col-xs-10 col-xs-offset-1 col-sm-6 col-sm-offset-3">
				<div class="text-box">
                	<p class="intro">Classificados WEB</p>
                    <h2>UNIPÊ 2017</h2>
                    <h3>Análise e Projetos de Sistemas</h3>
				</div>
  			</div>
		</div>
		<div class="col-md-12 some-notes">
			<div class="content">
               <%String mensagem = (String) request.getAttribute("lista");%>
              <%=mensagem%>
        Status da Opera&ccedil;&atilde;o: <strong><font color="#000000"<%=mensagem%>!!!!</font></strong><br />
        <br />

        <p><a href="javascript:history.back()">[ VOLTAR ]</a></p>
            </div>
            <div class="text-box">
         
            </div>
		</div>
	</div>
</div>

<div class="container-fluid features" id="section2">
			</div>
		</div>
	</div>
</div>


<div class="container-fluid notes">
  	<div class="row">
   		<div class="col-md-12 col-sm-12 col-xs-12 notes-bg">
    		<div class="container">
    			<div class="col-md-8 col-sm-8 col-xs-12">
     				<p>Web Classificados - Sistema aplicado a gestão de vendas Classificados Online.</p>
    			</div>
    			<div class="col-md-offset-1 col-md-2 col-md-offset-1 col-sm-offset-1 col-sm-2 col-sm-offset-1 col-xs-12">
     				<button type="button" class="btn btn-default btneff">Read More</button>
    			</div>
   			</div>
   		</div>
  	</div> 
</div>



<div class="container-fluid footer">
	<div class="row">
		<div class="col-md-12">
			<p>Copyright &copy; Ravalic 2015 By <a href="http://www.html5layouts.com">HTML5 Layouts</a> | <a href="http://vectortoons.com/">Get Vector Graphics</a></p>
		</div>
	</div>
</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/jquery.countTo.js"></script>
    <script type="text/javascript" src="js/jquery.waypoints.min.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js"></script>
    <script src="js/lightbox.min.js"></script>
    <script>
      function initialize() {
        var mapCanvas = document.getElementById('map-canvas');
        var mapOptions = {
          center: new google.maps.LatLng(26.802100, 75.822739),
          zoom: 8,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        }
        var map = new google.maps.Map(mapCanvas, mapOptions)
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
    <script>
	$(document).ready(function () {
		$(document).on("scroll", onScroll);
 
		$('a[href^="#"]').on('click', function (e) {
			e.preventDefault();
			$(document).off("scroll");
 
			$('a').each(function () {
				$(this).removeClass('active');
			})
			$(this).addClass('active');
 
			var target = this.hash;
			$target = $(target);
			$('html, body').stop().animate({
				'scrollTop': $target.offset().top
			}, 500, 'swing', function () {
				window.location.hash = target;
				$(document).on("scroll", onScroll);
			});
		});
	});
 
	function onScroll(event){
		var scrollPosition = $(document).scrollTop();
		$('nav a').each(function () {
			var currentLink = $(this);
			var refElement = $(currentLink.attr("href"));
			if (refElement.position().top <= scrollPosition && refElement.position().top + refElement.height() > scrollPosition) {
				$('nav ul li a').removeClass("active");
				currentLink.addClass("active");
			}
			else{
				currentLink.removeClass("active");
			}
		});
	}
	</script>
	<script type="text/javascript">
    jQuery(function ($) {
      // custom formatting example
      $('.timer').data('countToOptions', {
        formatter: function (value, options) {
          return value.toFixed(options.decimals).replace(/\B(?=(?:\d{3})+(?!\d))/g, ',');
        }
      });
 
      // start all the timers
      $('#starts').waypoint(function() {
    $('.timer').each(count);
	});
 
      function count(options) {
        var $this = $(this);
        options = $.extend({}, options || {}, $this.data('countToOptions') || {});
        $this.countTo(options);
      }
    });
  	</script>
</body>
</html>
