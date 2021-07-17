
package modelo;


public class Producto 
{
     private int codigo;
     private String producto;
     private String marca;
     private String talla;
     private String sexo;
      private float precio;
      private int existencias;
      private int Clasificacion;
      private int estado;

    public Producto() {
    }

    public Producto(int codigo, String producto, String marca, String talla, String sexo, float precio, int existencias, int Clasificacion, int estado) {
        this.codigo = codigo;
        this.producto = producto;
        this.marca = marca;
        this.talla = talla;
        this.sexo = sexo;
        this.precio = precio;
        this.existencias = existencias;
        this.Clasificacion = Clasificacion;
        this.estado = estado;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(int Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", producto=" + producto + ", marca=" + marca + ", talla=" + talla + ", sexo=" + sexo + ", precio=" + precio + ", existencias=" + existencias + ", Clasificacion=" + Clasificacion + ", estado=" + estado + '}';
    }
      
       
    
}
