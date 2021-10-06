/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array2;

import java.util.ArrayList;

/**
 *
 * @author Sena
 */
public class Profesion extends Persona {

    
    public Profesion(ArrayList Nombre, ArrayList Edad, ArrayList profesion) {
        super(Nombre, Edad, profesion);
    }
    
   // @Override 
    
    public int CalcularEdadM(){
        
        int EdadMayor=0;
        for (int i = 0; i < this.getEdad().size(); i++) {
    
            if (Integer.parseInt(this.getEdad().get(i).toString())>EdadMayor) {
                
                EdadMayor=Integer.parseInt(this.getEdad().get(i).toString());
            }
            
        }
        return EdadMayor;
        
    }
    
    public String RetornarNombre(int i){
        
      String nombreCompleto=this.getNombre().get(i).toString();
        
        return nombreCompleto; 
    }
    
    public boolean EliminarIndex(int indexEliminar){
        
        boolean Eliminar=Boolean.parseBoolean(this.getNombre().remove(indexEliminar).toString());
        
        return Eliminar;
        
    }
    
    public int NumerodeIndixes(String Narray){
        
        int Numero=0;

        if(Narray == "Nombre"){
            
             Numero=this.getNombre().size();
            
        }else if(Narray == "Edad"){
            Numero=this.getEdad().size();
           
        }else if(Narray == "Profesion"){
            Numero=this.getProfesion().size();
            
        }
          
        return Numero;
        
    }
    
    public boolean Contiene(String NombreArray, String contiene){
        
        boolean respuesta=false;
        
        if(NombreArray == "Nombre"){
            
            respuesta=this.getNombre().contains(contiene);
            
        }else if(NombreArray == "Edad"){
            respuesta=this.getEdad().contains(contiene);
            
            
        }else if(NombreArray == "Profesion"){
            respuesta=this.getProfesion().contains(contiene);
            
        }
        
        return respuesta;
           
    }
    
    public int BuscarIndex(String NombreArray, String Buscar){
        
        int respuesta=0;
        
        if(NombreArray == "Nombre"){
            
            respuesta=this.getNombre().indexOf(Buscar);
            
        }else if(NombreArray == "Edad"){
            
            int Edad=Integer.parseInt(Buscar);
            respuesta=this.getEdad().indexOf(Edad);
                 
        }else if(NombreArray == "Profesion"){
            respuesta=this.getProfesion().indexOf(Buscar);
                
        }

        return respuesta;
    }   
    
}
