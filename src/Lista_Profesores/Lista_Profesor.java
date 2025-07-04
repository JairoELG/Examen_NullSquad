/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Profesores;


import Profesores.profesor;

/**
 *
 * @author Student
 * 
 */
public class Lista_Profesor {
    public profesor listprofesores[];
    
   
   public boolean add(profesor profe){
       
       for (int i = 0; i < 100; i++) {
           if (listprofesores[i]== null) {
               listprofesores[i]= profe;
               return true;
           }
           
       }
       return false;
   }
   
   public boolean remove(profesor profe){
        for (int i = 0; i < 100; i++) {
           if (listprofesores[i]== profe) {
               listprofesores[i]= null;
               return true;
           }
           
       }
       return false;
   }
        
   public profesor find(profesor id){
       for (int i = 0; i < 100; i++) {
           if (listprofesores[i].getId()== id) {
               return listprofesores[i];
           }
       }
       return null;
   }

    public Lista_Profesor(profesor[] listprofesores) {
        this.listprofesores = new profesor[100];
    }


public profesor[] listaespecifica(){
    public profesor lists[100];
        for (int i = 0; i < 100; i++) {
             if (listprofesores[i].getGradoacademico()=="licenciatura") {
                    lists[i]=listprofesores;
                }
        }
    return lists[];
}
   
  

    
    
}
