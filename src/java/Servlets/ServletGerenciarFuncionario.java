/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Bean.*;
import Conexao.*;
import Controlador.*;
import DAO.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author ricardoricrob
 */
public class ServletGerenciarFuncionario extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      
    } 

    // <editor-fold defaultstate="collapsed" desc="Métodos HttpServlet. Clique no sinal de + à esquerda para editar o código.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       //        processRequest(request, response);

        Fachada myFacade = new Fachada();
        Funcionario myObj = new Funcionario();
	int status = 0;

            List<Funcionario> listagemgeral = new ArrayList<Funcionario>();
            listagemgeral  = myFacade.listagemGeralFuncionario();
            if (listagemgeral!=null){
                for (Iterator<Funcionario> it = listagemgeral.iterator(); it.hasNext();) {
                    Funcionario municipio = it.next();
                    System.out.println("Listar Funcionarios: " + municipio.getNomefunc() );
                }

                request.getSession().setAttribute("listagemgeral",(Funcionario[]) listagemgeral.toArray(new Funcionario[0]));
                request.setAttribute("listagemgeral2",listagemgeral);

                RequestDispatcher rd = getServletContext().getRequestDispatcher("/list-gerenciar_funcionario.jsp");
                rd.forward(request,response);
            }


    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       // processRequest(request, response);
        String pagDestino = "/OK.jsp";

        int codigofunc = Integer.parseInt(request.getParameter("idfunc"));
        String nomefunc = request.getParameter("nomefunc");
        String emailfunc = request.getParameter("emailfunc");
        String fonefunc = request.getParameter("fonefunc");

        try {
                Fachada myFacade = new Fachada();
              //  List<Funcionario> lista = new ArrayList<Funcionario>();
                Funcionario func = new Funcionario();
                 // func.setIdfunc(codigofunc);
                  func.setNomefunc(nomefunc);
                  func.setFone(fonefunc);
                  func.setEmail(emailfunc);

               int comando = myFacade.inserirFuncionario(func);

               if (comando > 0){
                  System.out.println("Dados Gravados com Sucesso!!!");
                  request.setAttribute("lista","Dados Gravados com Sucesso!!!");

               } else {
                  System.out.println("Não foi Possivel Incluir o Funcionário!!!");
                  request.setAttribute("lista","Não foi Possivel Incluir o Funcionário!!!");
               }


              }
               catch (Exception e) {
                         System.out.println("Erro ao Inserir no Banco de Dados.");
                }
               finally{
                   RequestDispatcher rd = getServletContext().getRequestDispatcher(pagDestino);
                   rd.forward(request, response);
                 
                }
  
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
