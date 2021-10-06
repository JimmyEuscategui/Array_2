
package array2;

import java.util.ArrayList;

public class Persona {
    

    
    ArrayList Nombre;
    ArrayList Edad;
    ArrayList profesion;

    public Persona(ArrayList Nombre, ArrayList Edad, ArrayList profesion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.profesion = profesion;
    }

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getEdad() {
        return Edad;
    }

    public void setEdad(ArrayList Edad) {
        this.Edad = Edad;
    }

    public ArrayList getProfesion() {
        return profesion;
    }

    public void setProfesion(ArrayList profesion) {
        this.profesion = profesion;
    }
    
}
