
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
        multiLista.agregarNodoHijo("Ingeniería de sistemas", "   | Valeria Burgos       |     5        | 15387826");
        multiLista.agregarNodoHijo("Ingeniería de sistemas", "   | Elian Villa          |     6        | 1007729255");
        
        multiLista.agregarNodoHijo("Medicina", " | Sandra Villa | 4 | 25112292");
        multiLista.agregarNodoHijo("Medicina", " | Flappy       | 8 | 15940220");
        
        multiLista.agregarNodoHijo("Agronomía", " | Gold | 6 | 5236412");
        
        // muestra toda la lista
        multiLista.mostrarMultiLista();
        
        //Mostrar los alumnos de una carrera especifica.
        multiLista.mostrarPacientes("Medicina");
        
    }
    
    
}
