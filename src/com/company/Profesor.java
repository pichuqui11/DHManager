package com.company;

public class Profesor {

    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoProfesor;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoProfesor = codigoProfesor;
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

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(Integer codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    @Override
    public boolean equals(Object obj) {
        Profesor  unProfesor = (Profesor) obj;
        if (this.getCodigoProfesor().equals(unProfesor.getCodigoProfesor())) {
            return true;
        }else{
            return false;
        }
    }

}
