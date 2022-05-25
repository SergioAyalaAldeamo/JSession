package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.DAO;
import model.User;
import model.Error;

@WebServlet(name = "ValidateServlet", urlPatterns = {"/validate.do"})
public class ValidateServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            DAO dao = new DAO();
            String mail, pass, identi;
            mail = request.getParameter("txtMail");
            pass = request.getParameter("txtPass");
            identi= request.getParameter("doc");
            User u = new User(mail, pass,identi);
            User user2 = dao.exist(u);
            HttpSession session = request.getSession();
            if(user2.errorExist()){
                /*Enviar a error.view (Lista errores)*/
                List<Error> errors = user2.getErrors();
                session.setAttribute("errors", errors);
                request.getRequestDispatcher("error.view").forward(request, response);
            }else{
                /*Menu*/
                session.setAttribute("user", user2);
                request.getRequestDispatcher("menu.view").forward(request, response);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ValidateServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ValidateServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
