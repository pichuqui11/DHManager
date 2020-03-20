package com.company;

import java.util.List;

public class DigitalHouseManager {

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscripciones;

    public DigitalHouseManager(List<Alumno> listaDeAlumnos, List<Profesor> listaDeProfesores, List<Curso> listaDeCursos, List<Inscripcion> listaDeInscripciones) {
        this.listaDeAlumnos = listaDeAlumnos;
        this.listaDeProfesores = listaDeProfesores;
        this.listaDeCursos = listaDeCursos;
        this.listaDeInscripciones = listaDeInscripciones;
    }
}
