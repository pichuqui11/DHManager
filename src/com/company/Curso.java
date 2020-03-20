package com.company;

public class Curso {

    private String nombre;
    private Integer codigoCurso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    @Override
    public boolean equals(Object obj) {
        Curso unCurso = (Curso) obj;
        if (this.getCodigoCurso().equals(unCurso.getCodigoCurso())) {
            return true;
        }else{
            return false;
        }
    }

}
