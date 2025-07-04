/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Profesores;

/**
 *
 * @author Student
 */
public enum EnumProfesor {
   licenciatura("licenciatura"),
   Maestria("Maestria"),
   doctorado("doctorado");
   
   private String gradoacademico;

    private EnumProfesor(String gradoacademico) {
        this.gradoacademico = gradoacademico;
    }

    public static EnumProfesor getLicenciatura() {
        return licenciatura;
    }

    public static EnumProfesor getMaestria() {
        return Maestria;
    }

    public static EnumProfesor getDoctorado() {
        return doctorado;
    }

    public String getGradoacademico() {
        return gradoacademico;
    }
}



