
package registroropat;

import Dao.TblUsuario;
import formulario.FrmSesion;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;


public class Principal {

    public static void main(String[] args) 
    {
        List<Usuario> ListU = new ArrayList();
        TblUsuario tbl = new TblUsuario(ListU);
         FrmSesion frm = new FrmSesion();
          frm.setVisible(true);
    }
    
}
