package Datos;

/**
 *
 * @author danbr
 */
import Logica.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBusuarios {
    
    DBconexion con;
    
    public DBusuarios(){
        
        con = new DBconexion();
        
    }
    
    
    public ResultSet getPuntajes() throws SQLException{
        PreparedStatement pstm = con.getConexion().prepareStatement("SELECT idUsuario, "
                + " puntajeArkanoid, "
                + " puntajeCoches, "
                + " puntajePinguinos, "
                + " puntajeGallina, "
                + " puntajeAtari, "
                + " puntajeLlorona, "
                + " puntajeSnake "
                + " FROM puntajes "
                + " ORDER BY idUsuario, puntajeSnake ");
        ResultSet res = pstm.executeQuery();
        
        return res;
    }
    
    public ResultSet getCuenta() throws SQLException{
        PreparedStatement pstm = con.getConexion().prepareStatement("SELECT idUsuario, "
                + " contraseña "
                + " FROM usuarios.cuentas "
                + " ORDER BY idUsuario, contraseña ");
        ResultSet res = pstm.executeQuery();
        
        return res;
    }
    
    public void getPuntajes(Usuario p, String Juego) {

        try {
            PreparedStatement pstm = con.getConexion().prepareStatement("update puntajes set "+ Juego +" = ? "
                    + " where idUsuario = ?");

            pstm.setInt(1,p.getPuntuacionTemporal());
            pstm.setString(2,p.getNombre());
            
            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }
//    
//    public void actualizarCoches(Usuario p) {
//
//        try {
//            PreparedStatement pstm = con.getConexion().prepareStatement("update personas set puntajeCoches = ? "
//                    + " where idUsuario = ?");
//            
//            pstm.setString(1, p.getNombre());
//            pstm.setString(2, Integer.toString(p.getPununacionArkanoid()));
//
//            pstm.executeUpdate();
//
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//    }
//    
//    public void actualizarPinguinos(Usuario p) {
//
//        try {
//            PreparedStatement pstm = con.getConexion().prepareStatement("update personas set puntajePinguinos = ? "
//                    + " where idUsuario = ?");
//            
//            pstm.setString(1, p.getNombre());
//            pstm.setString(2, Integer.toString(p.getPununacionArkanoid()));
//
//            pstm.executeUpdate();
//
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//    }
//    
//    public void actualizarGallina(Usuario p) {
//
//        try {
//            PreparedStatement pstm = con.getConexion().prepareStatement("update personas set puntajeGallina = ? "
//                    + " where idUsuario = ?");
//            
//            pstm.setString(1, p.getNombre());
//            pstm.setString(2, Integer.toString(p.getPununacionArkanoid()));
//
//            pstm.executeUpdate();
//
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//    }
//    
//    public void actualizarAtari(Usuario p) {
//
//        try {
//            PreparedStatement pstm = con.getConexion().prepareStatement("update personas set puntajeAtari = ? "
//                    + " where idUsuario = ?");
//            
//            pstm.setString(1, p.getNombre());
//            pstm.setString(2, Integer.toString(p.getPununacionArkanoid()));
//
//            pstm.executeUpdate();
//
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//    }
//    
//    public void actualizarLlorona(Usuario p) {
//
//        try {
//            PreparedStatement pstm = con.getConexion().prepareStatement("update personas set puntajeLlorona = ? "
//                    + " where idUsuario = ?");
//            
//            pstm.setString(1, p.getNombre());
//            pstm.setString(2, Integer.toString(p.getPununacionArkanoid()));
//
//            pstm.executeUpdate();
//
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//    }
//    
//    public void actualizarSnake(Usuario p) {
//
//        try {
//            PreparedStatement pstm = con.getConexion().prepareStatement("update personas set puntajeSnake = ? "
//                    + " where idUsuario = ?");
//            
//            pstm.setString(1, p.getNombre());
//            pstm.setString(2, Integer.toString(p.getPununacionArkanoid()));
//
//            pstm.executeUpdate();
//
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//    }
//    
////    public void borrarContacto(Usuario p) {
////
////        try {
////            PreparedStatement pstm = con.getConexion().prepareStatement("delete from personajes "
////                    + " where idpersonajes = ?");
////
////            pstm.setString(1, p.getNombre());
////
////            pstm.executeUpdate();
////
////        } catch (SQLException e) {
////            System.out.println(e);
////        }
////
////
////    }
//    
//    public void insertarUsuario(Usuario p) {
//        try {
//            PreparedStatement pstm = con.getConexion().prepareStatement("insert into personajes (idUsuario, "
//                + " contraseña, "
//                + " puntajeArkanoid, "
//                + " puntajeCoches, "
//                + " puntajePinguinos, "
//                + " puntajeGallina, "
//                + " puntajeAtari, "
//                + " puntajeLlorona, "
//                + " puntajeSnake "
//                + " FROM personas) "
//                    + " values(?,?,?,?,?,?,?,?,?)");
//            
//            pstm.setString(1, p.getNombre());
//            pstm.setString(2, Integer.toString(p.getPununacionArkanoid()));
//
//            pstm.executeUpdate();
//
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//    }
    
    public String getMensaje() {
        return con.getMensaje();
    }
    
}
