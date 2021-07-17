
package modelo;


public class Clasificacion
{
     private int codigo;
     private String tipo;
     private int estado;

    public Clasificacion() {
    }

    public Clasificacion(int codigo, String tipo, int estado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "codigo=" + codigo + ", tipo=" + tipo + ", estado=" + estado + '}';
    }

   
     
     
}
