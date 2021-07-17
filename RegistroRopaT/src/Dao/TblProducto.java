
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Producto;


public class TblProducto 
{
    
     private Conexion conex;
     private Connection conn;
     private PreparedStatement mostrarProducto;
     private PreparedStatement insertarProducto;
     private PreparedStatement editarProducto;
     private PreparedStatement eliminarProducto;
     
     private List<Producto> productos = new ArrayList();

    public TblProducto() 
    {
        this.conex = new Conexion();
        conn = conex.obtenerConexion();
        
        try
        {
             mostrarProducto = conn.prepareStatement("Select * from Producto");
              insertarProducto = conn.prepareStatement("Insert into Producto(producto, marca , talla,  sexo, precio, existencia, codclasificacion)values(?,?,?,?,?,?,?)");
               editarProducto = conn.prepareStatement("Update Producto set producto = ?, marca = ? , talla = ?,  sexo = ?, precio = ?, existencia = ?, codclasificacion = ? where codigo = ?");
              eliminarProducto = conn.prepareStatement("Delete from Producto where Codigo = ? ");
            
            
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        
        
    }
 
    public TblProducto(List<Producto> lista) 
    {
          this.conex = new Conexion();
          this.productos = lista;
          conn = conex.obtenerConexion();
          
          try 
          {
            
              mostrarProducto = conn.prepareStatement("Select * from Producto");
              insertarProducto = conn.prepareStatement("Insert into Producto(producto, marca , talla,  sexo, precio, existencia, codclasificacion)values(?,?,?,?,?,?,?)");
               editarProducto = conn.prepareStatement("Update Producto set producto = ?, marca = ? , talla = ?,  sexo = ?, precio = ?, existencia = ?, codclasificacion = ?  where codigo = ?");
              eliminarProducto = conn.prepareStatement("Delete from Producto where Codigo = ? ");
              
              
              
              
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
            rs = mostrarProducto.executeQuery();
            productos.clear();
            while (rs.next()) 
            {
                productos.add(new Producto(rs.getInt("codigo"),rs.getString("producto"), rs.getString("marca"), rs.getString("talla")  , rs.getString("sexo"), rs.getFloat("precio"), rs.getInt("existencia") ,rs.getInt("codclasificacion"), 1 ));
            }
        
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    
    }
    
    public int insertar(String producto, String marca, String talla, String sexo, float precio,int existencia, int clasificaion)
    {
           int result = 0;
           
           try{
            insertarProducto.setString(1, producto);
            insertarProducto.setString(2, marca);
            insertarProducto.setString(3, talla);
            insertarProducto.setString(4, sexo);
             insertarProducto.setFloat(5, precio);
             insertarProducto.setInt(6, existencia);
             insertarProducto.setInt(7, clasificaion);
            result = insertarProducto.executeUpdate();
       }catch(Exception ex){
           conex.close(conn);
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
           
    
           return result;
    }
    
    public  int editar(String producto, String marca, String talla, String sexo, float precio,int existencia,int clasificaion, int estado, int codigo)
    {
            int result = 0;
       try{
           
           editarProducto.setString(1, producto);
           editarProducto.setString(2, marca);
           editarProducto.setString(3, talla);
           editarProducto.setString(4, sexo);
           editarProducto.setFloat(5, precio);
           editarProducto.setInt(6, existencia);
           editarProducto.setInt(7, estado);
           editarProducto.setInt(8, codigo);
           result = editarProducto.executeUpdate();
       }catch(Exception ex){
           conex.close(conn);
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       return result;
    
    
    }

    public int eliminar(int codigo)
    {
    
            int result = 0;
      
      try{
      
         eliminarProducto.setInt(1, codigo);
         result = eliminarProducto.executeUpdate();
      }
      catch(Exception ex)
      {
      
         JOptionPane.showMessageDialog(null,ex.getMessage());
      
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
            for(Producto producto: productos){
                

                switch(producto.getEstado()){
                    case 0:
                        b = this.insertar(producto.getProducto(),producto.getMarca(), producto.getTalla() , producto.getSexo(), producto.getPrecio(), producto.getExistencias(), producto.getClasificacion());
                        if (b!=0) contIns++;
                        break;
                    case 1:
                        break;
                    case 2:
                        b = this.editar(producto.getProducto(),producto.getMarca(), producto.getTalla() , producto.getSexo(), producto.getPrecio(),producto.getExistencias(),  producto.getClasificacion(),producto.getEstado(), producto.getCodigo());
                        if (b!=0) contEdi++;
                        break;
                    case 3:
                        b = this.eliminar(producto.getCodigo());
                         if (b!=0) contEli++;
                        break;
                    
                    default:
                    System.out.println("El estado actual es invalido");
                                                
        }
           }
            
            msn += "Registros insertados: " + contIns +"\nRegistros Editados: "
                    + contEdi +"\nRegistros Eliminados: "+ contEli+".";
            JOptionPane.showMessageDialog(null, "Operación de actualización terminada...\n"+
                    msn, "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
          
        
        }
        
        catch (Exception ex) 
        {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
         Listar();
    
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
     
    
     
    
     
     
     
     
     
     
    
    
    
    
}
