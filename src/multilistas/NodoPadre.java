
package multilistas;


public class NodoPadre 
{
    private String info;
    private NodoPadre sig;
    private NodoHijo abajo;

    public NodoPadre() {
        sig=null;
        abajo=null;
    }

    public NodoPadre(String info) {
        this.info = info;
        this.sig = null;
        this.abajo = null;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public NodoPadre getSig() {
        return sig;
    }

    public void setSig(NodoPadre sig) {
        this.sig = sig;
    }

    public NodoHijo getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoHijo abajo) {
        this.abajo = abajo;
    }
        
}
