
package array2;

import java.util.ArrayList;


public class Array2 {

    public static void main(String[] args) {
        
        ArrayList nombre = new ArrayList();
        ArrayList edad = new ArrayList();
        ArrayList profesion = new ArrayList();
        
        Profesion p = new Profesion(nombre,edad,profesion);
        
        profesion.add("Enfermera");
        profesion.add("Conductor");
        profesion.add("Ingeniero");
        
        edad.add(23);
        edad.add(25);
        edad.add(32);
        
        nombre.add("Pedro");
        nombre.add("Antonio");
        nombre.add("Carlos");
        
        
        p.setProfesion(profesion);
        p.setEdad(edad);
        p.setNombre(nombre);
        
        System.out.println("Elementos: "+p.getProfesion()); 
        System.out.println("Indice "+p.CalcularEdadM()); 
        System.out.println("Buscar Nombre "+p.RetornarNombre(2));
        System.out.println("Eliminar Nombre "+p.EliminarIndex(1));
        System.out.println("Elementos: "+p.getNombre());
        System.out.println("Contar cuantos elementos contiene por array: "+p.NumerodeIndixes("Profesion"));
        System.out.println("Verificar si contiene en una array un elemento: "+p.Contiene("Nombre", "Marcos"));
        
        System.out.println("Sacar index segun el array y contenido: "+p.BuscarIndex("Profesion", "Ingeniero"));
        

    }
    
}
