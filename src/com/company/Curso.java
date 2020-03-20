package com.company;

import java.util.List;

public class Curso {

    private String nombre;
    private Integer codigoCurso;
    private ProfesorTitular unProfesorTitular;
    private ProfesorAdjunto unProfesorAdjunto;
    private List<Alumno> listaDeAlumnos;


    public Curso(String nombre, Integer codigoCurso, ProfesorTitular unProfesorTitular, ProfesorAdjunto unProfesorAdjunto, List<Alumno> listaDeAlumnos) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.unProfesorTitular = unProfesorTitular;
        this.unProfesorAdjunto = unProfesorAdjunto;
        this.listaDeAlumnos = listaDeAlumnos;
    }

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

    public ProfesorTitular getUnProfesorTitular() {
        return unProfesorTitular;
    }

    public void setUnProfesorTitular(ProfesorTitular unProfesorTitular) {
        this.unProfesorTitular = unProfesorTitular;
    }

    public ProfesorAdjunto getUnProfesorAdjunto() {
        return unProfesorAdjunto;
    }

    public void setUnProfesorAdjunto(ProfesorAdjunto unProfesorAdjunto) {
        this.unProfesorAdjunto = unProfesorAdjunto;
    }

    public List<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public void setListaDeAlumnos(List<Alumno> listaDeAlumnos) {
        this.listaDeAlumnos = listaDeAlumnos;
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
