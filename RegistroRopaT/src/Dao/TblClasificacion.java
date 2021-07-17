
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Clasificacion;


public class TblClasificacion 
{
    
     private Conexion conex;
     private Connection conn;
     private PreparedStatement mostrarClasificacion;
     private PreparedStatement insertarClasificacion;
     private PreparedStatement editarClasificacion;
     private PreparedStatement eliminarClasificacion;
     
     private List<Clasificacion> clasificacion = new ArrayList();

    public TblClasificacion() 
    {
        
        this.conex = new Conexion();
        conn = conex.obtenerConexion();
        
        try 
        {
            
             mostrarClasificacion = conn.prepareStatement("Select * from Clasificacion");
             insertarClasificacion = conn.prepareStatement("Insert into Clasificacion (Tipo) values (?)" );
             editarClasificacion = conn.prepareStatement("Update Clasificacion set Tipo = ?, estado = ? where codigo = ?");
             eliminarClasificacion = conn.prepareStatement("Delete from Clasificacion where codigo = ?");
             
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
               
    }
    
    public TblClasificacion(List<Clasificacion> lista)
    {
          this.conex = new Conexion();
          this.clasificacion = lista;
          conn = conex.obtenerConexion();
          
          try
          {
             mostrarClasificacion = conn.prepareStatement("Select * from Clasificacion");
             insertarClasificacion = conn.prepareStatement("Insert into Clasificacion (Tipo) values (?)" );
             editarClasificacion = conn.prepareStatement("Update Clasificacion set Tipo = ?, estado = ? where codigo = ?");
             eliminarClasificacion = conn.prepareStatement("Delete from Clasificacion where codigo = ?");
             
          
          }
          catch(SQLException ex)
          {
          
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
           
          }
          listar();
    }
    
    public final void listar()
    {
         ResultSet rs = null;
         
         try
         {
            
             rs = mostrarClasificacion.executeQuery();
           clasificacion.clear();
           while (rs.next()){
               clasificacion.add(new Clasificacion(rs.getInt("codigo"), 
                       rs.getString("Tipo"), 
                       1));
        }
           
         }
         catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
      
    
    public int insertar(String Tipo)
    {
        int result = 0;
        
        try{
            insertarClasificacion.setString(1, Tipo);
            result = insertarClasificacion.executeUpdate();
       }catch(SQLException ex)
       {
           conex.close(conn);
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       return result;
    
    
    }
    
    public int editar(String Tipo, int estado, int codigo)
    {
    
       int result = 0;
       try{
           editarClasificacion.setString(1, Tipo);
           editarClasificacion.setInt(2, estado);
           editarClasificacion.setInt(3, codigo);
           result = editarClasificacion.executeUpdate();
       }catch(SQLException ex){
           conex.close(conn);
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       return result;
    
    
    }
    
    public int eliminar(int codigo)
    {
         
         int result = 0;
       try{
           eliminarClasificacion.setInt(1, codigo);
           result = eliminarClasificacion.executeUpdate();
       }catch(SQLException ex){
           conex.close(conn);
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       return result;
    
    }
    
     public void actualizar()
     {
         try 
         {
             int b;
              String msn="Operaciones realizadas en esta sesion: \n";
              int contIns = 0, contEdi = 0, contEli = 0, contErr = 0;
             
             for (Clasificacion cla : clasificacion) 
             {
                  
                 
                  switch(cla.getEstado())
                  {
                    case 0:
                        b = this.insertar(cla.getTipo());
                        if (b!=0) contIns++;
                        break;
                    case 1:
                        break;
                    
                    case 2:
                        b = this.editar(cla.getTipo(), cla.getEstado(), cla.getCodigo());
                        if (b!=0) contEdi++;
                        break;
                    
                    case 3:
                        b = this.eliminar(cla.getCodigo());
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
         catch (Exception ex)
         {
              JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 
                    JOptionPane.ERROR_MESSAGE);
     
         }
         
         listar();
          
     }

    public List<Clasificacion> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(List<Clasificacion> clasificacion) {
        this.clasificacion = clasificacion;
    }

   
    
    
    
}
