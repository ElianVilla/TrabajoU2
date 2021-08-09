
package multilistas;

import javax.swing.JOptionPane;


public class Multilistas {

    private NodoPadre CAB;
    private NodoPadre FINAL;

    public Multilistas() {
    }

    public void agregarNodoPadre(String info) {
        NodoPadre nodoPadre = new NodoPadre(info);

        try {
            if (CAB == null) {
                CAB = nodoPadre;
                FINAL = nodoPadre;
            } else {
                FINAL.setSig(nodoPadre);
                FINAL = nodoPadre;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public NodoPadre buscarNodoPadre(String info) {
        NodoPadre nodoPadre = CAB;
        try {
            while (nodoPadre != null) {
                if (nodoPadre.getInfo().equalsIgnoreCase(info)) {
                    return nodoPadre;
                }
                nodoPadre = nodoPadre.getSig();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void agregarNodoHijo(String infoPadre, String infoHijo) {

        try {
            NodoPadre np = buscarNodoPadre(infoPadre);
            
            if (np != null) {
                NodoHijo nodoHijo = np.getAbajo();
                
                NodoHijo nodoHijoNuevo = new NodoHijo(infoHijo);

                if (np.getAbajo() == null)//Lo utilizamos para el caso de que no tenga nodos hijos
                {
                    np.setAbajo(nodoHijoNuevo);
                } else //como hay hijos, lo debemos agregar al final
                {
                    //nodoHijo = np.getAbajo();
                    while (nodoHijo.getAbajo() != null) {
                        nodoHijo = nodoHijo.getAbajo();
                    }
                    nodoHijo.setAbajo(nodoHijoNuevo);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el nodo Padre.");
            }
        } catch (Exception e) {
        }
    }

    public void mostrarMultiLista() {

        try {
            NodoPadre np = CAB;
            while (np != null) {
                System.out.println(np.getInfo());

                NodoHijo nodoHijo = np.getAbajo();

                if (nodoHijo != null)//Lo utilizamos para el caso de que no tenga nodos hijos
                {
                    while (nodoHijo != null) {
                        System.out.println(" - " + nodoHijo.getInfo());
                        nodoHijo = nodoHijo.getAbajo();
                    }
                }
                np = np.getSig();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public void mostrarPacientes(String info) {
        NodoPadre ej = buscarNodoPadre(info);
         System.out.println(ej.getInfo());

                NodoHijo nodoHijo = ej.getAbajo();

                if (nodoHijo != null)//Lo utilizamos para el caso de que no tenga nodos hijos
                {
                    while (nodoHijo != null) {
                        System.out.println(" - " + nodoHijo.getInfo());
                        nodoHijo = nodoHijo.getAbajo();
                    }
                }
                ej = ej.getSig();
            }
    }

