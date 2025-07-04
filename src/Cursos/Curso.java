/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cursos;

/**
 *
 * @author Student
 */
public class Curso {
    public int ID;
    public String nombre;
    public int Cantidadcreditos;
    public String profesor;
    
    public int getID(){
        return ID;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCreditos(){
        return Cantidadcreditos;
    }
    
    public void setCreditos(int Cantidadcreditos){
        this.Cantidadcreditos=Cantidadcreditos;
    }

    public Curso(int ID, String nombre, int Cantidadcreditos, String profesor) {
        this.ID=ID;
        this.nombre=nombre;
        this.Cantidadcreditos=0;
        this.profesor=profesor;
    }

    @Override
    public String toString() {
        return "Curso{" + "ID=" + ID + ", nombre=" + nombre + ", Cantidadcreditos=" + Cantidadcreditos + ", profesor=" + profesor + '}';
    }    
}
