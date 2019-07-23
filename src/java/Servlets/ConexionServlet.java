package Servlets;

/**
 *
 * @author danbr
 */
import Datos.DBusuarios;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danbr
 */
@WebServlet(name = "ConexionServlet", urlPatterns = {"/ConexionServlet"})
public class ConexionServlet extends HttpServlet {

    public static Usuario u;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        DBusuarios conDb = new DBusuarios();
        try {
            ResultSet res = conDb.getUsuario();
                    
            request.getSession().setAttribute("personajes", res);
            
            while(res.next()){
                
//                if(res.getString("idUsuario").equals(request.getParameter("usuario")) && res.getString("contraseña").equals(request.getParameter("password"))){
                
                    u = new Usuario();
                    u.setNombre(request.getParameter("usuario"));
                    
                    response.sendRedirect("tabla_juegos.jsp");
                    break;
                    
//                } else {
//                    
//                    response.sendRedirect("Invalido.jsp");
//                    
//                }
                
            }
            
            
        }catch(Exception e){
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inicio</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<p>seguimiento: "+conDb.getMensaje()+"</p>");
            out.println("<h1>Error at " + e.toString() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        }finally {            
            out.close();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
