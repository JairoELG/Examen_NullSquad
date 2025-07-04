/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profesores;
import Personas.Persona;
/**
 *
 * @author Student
 */
public class profesor extends Persona {
   private String departamento;
   private EnumProfesor gradoacademico;

    public EnumProfesor getGradoacademico() {
        return gradoacademico;
    }
   
 
   public String getdepartamento(){
       return departamento;
   }
    public String setdepartamento(String departamento){
        this.departamento = departamento;
       return null;
    }

    public profesor(String departamento, int id, String nombre) {
        super(id, nombre);
        this.departamento = departamento;
        this.gradoacademico = gradoacademico;
    }

    
    @Override
    public String toString() {
        return "profesor{" + "departamento=" + departamento + '}';
    }
}

