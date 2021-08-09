
package multilistas;


public class NodoHijo 
{
    private String info;
    private NodoHijo abajo;

    public NodoHijo() {
        abajo=null;
    }

    public NodoHijo(String info) {
        this.info = info;
        this.abajo = null;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public NodoHijo getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoHijo abajo) {
        this.abajo = abajo;
    }
    
    
}
