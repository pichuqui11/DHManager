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

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso unCurso = new Curso(nombre, codigoCurso, null, null, cupoMaximoDealumnos, listaDeAlumnos);
        listaDeCursos.add(unCurso);
        System.out.println("Curso ingresado exitosamente");
    }


    public void eliminarCruso(Curso unCurso) {
        this.listaDeCursos.remove(unCurso);
    }

    public void bajaCurso(Integer codigoCurso) {
        Curso cursoAEliminar = null;

        for (Curso unCurso : this.listaDeCursos) {
            if (unCurso.getCodigoCurso().equals(codigoCurso)) {
                cursoAEliminar = unCurso;
                break;

            }
        }
        eliminarCruso(cursoAEliminar);


    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras);
        listaDeProfesores.add(profesorAdjunto);
        System.out.println("Profesor Adjunto ingresado exitosamente");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre, apellido, 0, codigoProfesor, especialidad);
        listaDeProfesores.add(profesorTitular);
        System.out.println("Profesor Titular ingresado exitosamente");
    }

    public void eliminarProfesor(Profesor unProfesor) {
        this.listaDeProfesores.remove(unProfesor);
    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesorAEliminar = null;

        for (Profesor unProfesor : this.listaDeProfesores) {
            if (unProfesor.getCodigoProfesor().equals(codigoProfesor)) {
                profesorAEliminar = unProfesor;
                break;

            }
        }
        eliminarProfesor(profesorAEliminar);


    }
    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno alumno = new Alumno(nombre,apellido,codigoAlumno);
        listaDeAlumnos.add(alumno);
        System.out.println("Alumno ingresado exitosamente");
    }

}
