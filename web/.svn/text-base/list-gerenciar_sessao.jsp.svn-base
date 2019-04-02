<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
	Design by Free CSS Templates
	http://www.freecsstemplates.org
	Released for free under a Creative Commons Attribution 2.5 License
-->
<%@ page import ="java.util.*" %>
<%@ page import ="java.io.*" %>
<%@ page import ="DAO.*" %>
<%@ page import ="Bean.*" %>
<%@ page import ="Conexao.*" %>
<%@ page import ="Controlador.*" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=ISO-8859-1" />
<title>Classificados WEB</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />
<%
	Sessao[] vbSessao = (Sessao[]) request.getSession().getAttribute("listagemgeral");
%>

</head>
<body>
<div id="outer">
	
  <div id="header"> 
    <h1><a href="#">Classificados WEB</a></h1>
    <h2>Gestão de Classificados pela Internet</h2>
  </div>
   <div id="menu"> 
    <ul>
      <li class="first"><a href="index.html" accesskey="1" title="">Início</a></li>
	  <li class="first"><a href="cad-gerenciar_cliente.jsp" accesskey="2" title="">Clientes</a></li>
	  <li class="first"><a href="cad-gerenciar_tipoanuncio.jsp" accesskey="3" title="">Tipo de Anúncio</a></li>
	  <li class="first"><a href="cad-gerenciar_funcionario.jsp" accesskey="4" title="">Funcionários</a></li>
	  <li class="first"><a href="cad-gerenciar_sessao.jsp" accesskey="1" title="">Sessão</a></li>
      <li></li>
    </ul>
  </div>

<div id="content">
		<div id="primaryContentContainer">
			<div id="primaryContent">
				
        <h2>Gerenciar Sess&atilde;o</h2>
        <font color="#FF0000" size="3"><strong><em>Listagem das Sess&otilde;es:</em></strong></font><br />
        <br />
        <strong><font color="#000000"></font></strong>
        <table border="0">
          <tr bgcolor="#666666"> 
            <td width="157"><strong><font color="#FFFFFF">C&oacute;digo da Sess&atilde;o</font></strong></td>
            <td width="530"><strong><font color="#FFFFFF">Nome da Sess&atilde;o</font></strong></td>
            <td width="21"><strong></strong></td>
            <td width="141"><strong><font color="#FFFFFF">Detalhes</font></strong></td>
          </tr>
          <tr> 
            <td colspan="4">    <% if (vbSessao != null) {
	                            for (int i=0; i < vbSessao.length; i++) { %></td>
          </tr>
          <tr> 
            <td><%=vbSessao[i].getIdsessao()%></td>
            <td><%=vbSessao[i].getNome()%></td>
            <td>&nbsp;</td>
            <td><a href="#">Editar</a></td>
          </tr>
          <tr> 
            <td colspan="4"><% } %> <% } %></td>
          </tr>
          <tr> 
            <td colspan="4"><div align="center"><font size="2">Copyright &copy; 
                2011 Sitename.com. Designed by <a href="http://www.freecsstemplates.org">Free 
                CSS Templates</a> - Desenvolvido por: Ricardo Roberto de Lima 
                em 2011.</font></div></td>
          </tr>
        </table>
        <br />
        <br />

        <p><a href="javascript:history.back()">[ VOLTAR ]</a></p>
        </div>
		</div>
		<div id="secondaryContent">
			
      <h3><a href="index.html" accesskey="1" title="">Início</a></h3>
	  <h3><a href="cad-gerenciar_cliente.jsp" accesskey="2" title="">Clientes</a></h3>
	  <h3><a href="cad-gerenciar_tipoanuncio.jsp" accesskey="3" title="">Tipo de Anúncio</a></h3>
	  <h3><a href="cad-gerenciar_funcionario.jsp" accesskey="4" title="">Funcionários</a></h3>
	  <h3><a href="cad-gerenciar_sessao.jsp" accesskey="1" title="">Sessão</a></h3>
    </div>
  </div>
	<div id="footer">
		
    <p>&nbsp;</p>
	</div>
</div>
</body>
</html>
