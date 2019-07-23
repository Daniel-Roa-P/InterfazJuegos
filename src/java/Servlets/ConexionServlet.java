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
            ResultSet res = conDb.getCuenta();
                    
            request.getSession().setAttribute("cuentas", res);
            
            String usuarioIngresado=request.getParameter("usuario");
            String contraIn = request.getParameter("password");
                        
            int i=0; 
            
            while(res.next()){
                
                String usuBase = res.getString("idUsuario");
                String ContaseñaBase=res.getString("contraseña");
                
                System.out.print("U ingresado;" + usuarioIngresado);
                System.out.print("U base: "+usuBase);
                System.out.print("contra ingre: "+ contraIn);
                System.out.print("contra base: "+ ContaseñaBase);
                
                if(usuBase.equals(usuarioIngresado) && ContaseñaBase.equals(contraIn)){
                
                    u = new Usuario();
                    u.setNombre(request.getParameter("usuario"));
                    
                    response.sendRedirect("tabla_juegos.jsp");
                    break;
                    
                } 
             
            
                
            }
            
            response.sendRedirect("Invalido.jsp");
            
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
