
package modelo;




public class Usuario 
{
    private int id;
    private String usuario;
    private String contraseña;
    private int estado;

    public Usuario() {
    }

    public Usuario(int id, String usuario, String contraseña, int estado) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean autenticar(String usuario, String contraseña)
    {
    
        return((this.usuario.equals(usuario)) && (this.contraseña.equals(contraseña)));
    
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", estado=" + estado + '}';
    }
    
    
    
  
}

