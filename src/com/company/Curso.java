package com.company;

import java.util.List;

public class Curso {

    private String nombre;
    private Integer codigoCurso;
    private ProfesorTitular unProfesorTitular;
    private ProfesorAdjunto unProfesorAdjunto;
    private Integer cupoMaximo;
    private List<Alumno> listaDeAlumnos;


    public Curso(String nombre, Integer codigoCurso, ProfesorTitular unProfesorTitular, ProfesorAdjunto unProfesorAdjunto, Integer cupoMaximo, List<Alumno> listaDeAlumnos) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.unProfesorTitular = unProfesorTitular;
        this.unProfesorAdjunto = unProfesorAdjunto;
        this.cupoMaximo = cupoMaximo;
        this.listaDeAlumnos = listaDeAlumnos;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
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
        Curso curso = (Curso) obj;
        if (this.getCodigoCurso().equals(curso.getCodigoCurso())) {
            return true;
        } else {
            return false;
        }
    }

    private Boolean hayCupoDisponible() {
        return this.listaDeAlumnos.size() < this.cupoMaximo;
    }

    public Boolean agregarUnAlumno(Alumno unAlumno) {
        if (hayCupoDisponible()) {
            this.listaDeAlumnos.add(unAlumno);
            return true;
        } else {
            return false;
        }

    }

    public void eliminarAlumno(Alumno unAlumno) {
        this.listaDeAlumnos.remove(unAlumno);

    }


}
