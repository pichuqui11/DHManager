package com.company;

public class Alumno {

    //Atributos

    private String nombre;
    private String apellido;
    private Integer codigoAlumno;

    //Constructor

    public Alumno(String nombre, String apellido, Integer coidigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = coidigoAlumno;
    }

    //Sobreescribir el metodo Equals

    @Override
    public boolean equals(Object obj) {
        Alumno alumno = (Alumno) obj;
        if (this.codigoAlumno.equals(alumno.codigoAlumno)) {
            return true;
        }else{
            return false;
        }
    }
}