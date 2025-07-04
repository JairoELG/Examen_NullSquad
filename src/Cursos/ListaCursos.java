/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cursos;
import Lists.list;
/**
 *
 * @author Student
 */
public class ListaCursos {
    public Curso cursos[];
    
    public ListaCursos(Curso[] listacursos){
        this.cursos=new Curso[50];
    }
   
   public boolean add(Curso cursoadd){
       for(int i=0;i<50;i++){
           if(cursos[i]==null){
               cursos[i]=cursoadd;
               return true;
           }
       }
       return false;
   }
   public boolean remove(Curso cursominus){
       for(int i=0;i<50;i++){
           if(cursos[i]==cursominus){
               cursos[i]=null;
               return true;
           }
       }
       return false;
   }
   public Curso showall(Curso ID){
       for(int i=0;i<50;i++){
           if(cursos[i].getID()==ID){
               return cursos[i];
           }
       }
       return null;
   }
}
