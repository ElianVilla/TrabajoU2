
package multilistas;


public class Principal 
{
    
    public static void main(String [] args)
    {
        Multilistas multiLista = new Multilistas();
        //agregar carrera
        multiLista.agregarNodoPadre("Ingeniería de sistemas");
        multiLista.agregarNodoPadre("Medicina");
        multiLista.agregarNodoPadre("Agronomía");
        //agregar alumno
        System.out.println("Carrera | Nombre     | Semestre     | Número de carnet");
        multiLista.agregarNodoHijo("Ingeniería de sistemas", "   | Valeria       |     2        | 15387826");
        multiLista.agregarNodoHijo("Ingeniería de sistemas", "   | Elian Villa   |     3        |  5877123");
        
        multiLista.agregarNodoHijo("Medicina", " | Sandra | 4 | 10400505");
        multiLista.agregarNodoHijo("Medicina", " | Flappy | 6 | 8740124");
        
        multiLista.agregarNodoHijo("Agronomía", " | Gold | 6 | 5236412");
        
        // muestra toda la lista
        multiLista.mostrarMultiLista();
        
        //Mostrar los alumnos de una carrera especifica.
        multiLista.mostrarPacientes("Ingeniería de sistemas");
        
    }
    
    
}
