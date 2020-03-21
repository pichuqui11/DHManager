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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(Integer codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }
}