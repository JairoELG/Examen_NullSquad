/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List_Estudiante;

import Estudiantes.Estudiante;

/**
 *
 * @author Student
 */
public class Lista_estudiante {
    public Estudiante listEstudiantes[];

    public Lista_estudiante(Estudiante[] listestudiantes) {
        this.listEstudiantes = new Estudiante[100];
    }

   
    public boolean add(Estudiante estudia){
        for (int i = 0; i < 100; i++) {
           if (listEstudiantes[i]== null) {
               listEstudiantes[i]= estudia;
               return true;
           }
           
       }
       return false;
        
    }
    
 public boolean remove(Estudiante estudia){
        for (int i = 0; i < 100; i++) {
           if (listEstudiantes[i]== estudia) {
               listEstudiantes[i]= null;
               return true;
           }
           
       }
       return false;
        
    }
    
  public Estudiante find(Estudiante id){
       for (int i = 0; i < 100; i++) {
           if (listEstudiantes[i].getId() == id) {
               return listEstudiantes[i];
           }
       }
       return null;
   }
}
