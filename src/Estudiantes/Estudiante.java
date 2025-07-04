/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiantes;
import Personas.Persona;
import java.time.LocalTime;
/**
 *
 * @author ccore
 */
public class Estudiante extends Persona{
    
    private final LocalTime FechadeIngreso;
    private String correo; 
    private int telefono;
    private String carrera; 

    public Estudiante(LocalTime FechadeIngreso, String correo, int telefono, String carrera, int id, String nombre) {
        super(id, nombre);
        this.FechadeIngreso = FechadeIngreso;
        this.correo = correo;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public LocalTime getFechadeIngreso() {
        return FechadeIngreso;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    @Override
    public String toString() {
        return "Estudiante{" + "FechadeIngreso=" + FechadeIngreso + ", correo=" + correo + ", telefono=" + telefono + ", carrera=" + carrera + '}';
    }
    
    
}
