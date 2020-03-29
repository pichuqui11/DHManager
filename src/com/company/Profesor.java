package com.company;

abstract class Profesor {


    // PARTE D
    // La clase Profesor no se debe modificar, se deben crear nos nuevas clases, "Profesor titular"  y "Profesor Adjunto" que van a heredar los atributos y metodos
    // de la clase Profesor.

    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoProfesor;

    public Profesor(String nombre, String apellido, Integer codigoProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        antiguedad = 0;
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
        Profesor  profesor = (Profesor) obj;
        if (this.getCodigoProfesor().equals(profesor.getCodigoProfesor())) {
            return true;
        }else{
            return false;
        }
    }

}
