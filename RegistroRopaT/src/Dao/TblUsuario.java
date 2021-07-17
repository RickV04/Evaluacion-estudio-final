
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import modelo.Usuario;


public class TblUsuario 
{
     private Conexion conex;
     private Connection conn;
     private PreparedStatement comparar;
     private PreparedStatement insertarUsuario;
     private PreparedStatement editarUsuario;
     private PreparedStatement eliminarUsuario;
     List<Usuario> ListU = new ArrayList();

    public TblUsuario()
    {
        this.conex = new Conexion();
        conn = conex.obtenerConexion();
        try
        {
             comparar = conn.prepareStatement("Select * from Usuario"); 
             insertarUsuario = conn.prepareStatement("Insert into Usuario(username, pwd)values(?,?)");
             editarUsuario = conn.prepareStatement("Update Usuario set pwd = ?, username = ?, estado = ? where id = ?");
             eliminarUsuario = conn.prepareStatement("Delete from Usuario where id = ?");
             
        
        }
        catch(SQLException ex)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        {
           
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        
        }
            
    }
     
    public TblUsuario(List<Usuario> lista) 
    {
        
        this.conex = new Conexion();
        conn = conex.obtenerConexion();
         this.ListU = lista;
        try
        {
             comparar = conn.prepareStatement("Select * from Usuario");
             insertarUsuario = conn.prepareStatement("Insert int Usuario(pwd, username)values(?,?)");
             editarUsuario = conn.prepareStatement("Update Usuario set pwd = ?, username = ?, estado = ? where id = ?");
             eliminarUsuario = conn.prepareStatement("Delete from Librero where id = ?");
              
     
            
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        
        Listar();
        
    }
    
     public final void Listar()
    {
    
         ResultSet rs = null;
         
         try 
        {
            rs = comparar.executeQuery();
            ListU.clear();
            while (rs.next()) 
            {
                ListU.add(new Usuario(rs.getInt("id"),rs.getString("username"), rs.getString("pwd"),1 ));
            }
        
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    }
     
    public int insertar(String nombre, String contraseña)
    {
        int result = 0;
        
        try
        {
        
           insertarUsuario.setString(1, contraseña);
           insertarUsuario.setString(2, nombre);
           result = insertarUsuario.executeUpdate();
        }
        catch(SQLException ex)
        {
             conex.close(conn);
             JOptionPane.showMessageDialog(null, ex.getMessage());       
        }
    
        return result;
    }
    
    public int editar(String contraseña, String nombre, int estado, int codigo)
    {
         int result = 0;
    
          try 
          {
             editarUsuario.setString(1, contraseña);
             editarUsuario.setString(2, nombre);
             editarUsuario.setInt(3, estado);
             editarUsuario.setInt(4, codigo);
             result = editarUsuario.executeUpdate();
             
              
              
        }
          catch (Exception ex)
        {
        
            conex.close(conn);
            JOptionPane.showMessageDialog(null, ex.getMessage());
       
        }
    
       return result;
    }
    
    public int eliminar(int codigo)
    {
       
        int result = 0;
        
        try 
        {
            
            eliminarUsuario.setInt(1, codigo);
            result = eliminarUsuario.executeUpdate();
            
        }
        catch (SQLException ex)
        {
            
            conex.close(conn);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        
        return result;
    
    
    }
    
    public void Actualizar()
    {
      try
      {
         int b = 0;
          String msn="Operaciones realizadas en esta sesion: \n";
         int contIns = 0, contEdi = 0, contEli = 0, contErr = 0;
          for (Usuario usuario : ListU) {
              
             
              
              switch(usuario.getEstado())
              {
                  case 0:
                  b = this.insertar(usuario.getContraseña(), usuario.getUsuario());
                  if (b != 0)contIns++;
                      break;
                  case 1:
                  break;
                  
                  case 2:
                  b = this.editar(usuario.getContraseña(), usuario.getUsuario(), usuario.getEstado(), usuario.getId());
                  if (b!=0) contEdi++;
                      break;
                      
                  case 3:
                  b = this.eliminar(usuario.getId());
                  if (b!=0) contEli++;       
                  break;
                  default:
                  System.out.println("Estado invalido");

              }
              
          }
           msn += "Registros insertados: " + contIns +"\nRegistros Editados: "
                    + contEdi +"\nRegistros Eliminados: "+ contEli+".";
            JOptionPane.showMessageDialog(null, "Operación de actualización terminada...\n"+
                    msn, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
      }
      catch(Exception ex)
      {
              JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 
                    JOptionPane.ERROR_MESSAGE);
      
      }
      
      Listar();
    
    }
    
     
    public boolean auUsuario(String nombre, String contraseña)
    {
    
         boolean b = false;
         
         for (Usuario u : ListU) 
         {
             if(u.autenticar(nombre, contraseña))
             {
                b = true;
                return b;
             
             }
        }
    
       return b;
    }

    public List<Usuario> getListU() {
        return ListU;
    }

    public void setListU(List<Usuario> ListU) {
        this.ListU = ListU;
    }
    
    
    
    
    
}
