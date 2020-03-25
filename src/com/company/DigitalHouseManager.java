package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscripciones;

    public DigitalHouseManager() {
        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscripciones = new ArrayList<>();
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso unCurso = new Curso(nombre, codigoCurso, cupoMaximoDealumnos);
        listaDeCursos.add(unCurso);
        System.out.println("Curso ingresado exitosamente");
    }

    //METODO PARA BUSCAR CURSO POR CODIGO.

    public Curso buscarCurso(Integer codigoCurso) {
        Curso cursoAEncontrar = null;
        for (Curso unCurso : this.listaDeCursos) {
            if (unCurso.getCodigoCurso().equals(codigoCurso)) {
                cursoAEncontrar = unCurso;
                break;
            }
        }
        return cursoAEncontrar;
    }

    //METODO PARA BUSCAR ALUMNO POR CODIGO.

    public Alumno buscarAlumno(Integer codigoAlumno) {
        Alumno alumnoAEncontrar = null;
        for (Alumno alumno : this.listaDeAlumnos) {
            if (alumno.getCodigoAlumno().equals(codigoAlumno)) {
                alumnoAEncontrar = alumno;
                break;
            }
        }
        return alumnoAEncontrar;
    }

    //METODO PARA BUSCAR PROFESOR POR CODIGO.

    public Profesor buscarProfesor(Integer codigoProfesor) {
        Profesor profesorAEncontrar = null;
        for (Profesor unProfesor : this.listaDeProfesores) {
            if (unProfesor.getCodigoProfesor().equals(codigoProfesor)) {
                profesorAEncontrar = unProfesor;
                break;
            }
        }
        return profesorAEncontrar;
    }


    // METODO PARA ELIMINAR CURSO POR CODIGO

    public void eliminarCruso(Curso unCurso) {
        this.listaDeCursos.remove(unCurso);
    }

    public void bajaCurso(Integer codigoCurso) {
        eliminarCruso(buscarCurso(codigoCurso));
        System.out.println("Curso dado de baja");


    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre, apellido, codigoProfesor, cantidadDeHoras);
        this.listaDeProfesores.add(profesorAdjunto);
        System.out.println("Profesor Adjunto ingresado exitosamente");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        this.listaDeProfesores.add(profesorTitular);
        System.out.println("Profesor Titular ingresado exitosamente");
    }

    public void eliminarProfesor(Profesor unProfesor) {
        this.listaDeProfesores.remove(unProfesor);
    }

    public void bajaProfesor(Integer codigoProfesor) {
        eliminarProfesor(buscarProfesor(codigoProfesor));
        System.out.println("Profesor dado de baja");
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno alumno = new Alumno(nombre, apellido, codigoAlumno);
        listaDeAlumnos.add(alumno);
        System.out.println("Alumno ingresado exitosamente");
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        Curso cursoAInscribir = buscarCurso(codigoCurso);
        Alumno alumnoAInscribir = buscarAlumno(codigoAlumno);
        if (cursoAInscribir.hayCupoDisponible()) {
            Inscripcion unaInscripcion = new Inscripcion(alumnoAInscribir, cursoAInscribir);
            cursoAInscribir.getListaDeAlumnos().add(alumnoAInscribir);
            this.listaDeInscripciones.add(unaInscripcion);

            System.out.println("Inscripcion realizada");
        } else {
            System.out.println("No hay cupo disponible para la inscripción solicitada");
        }

    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        Curso cursoACompletar = buscarCurso(codigoCurso);
        Profesor profesorTitularAIncluir = buscarProfesor(codigoProfesorTitular);
        Profesor profesorAdjuntoAIncluir = buscarProfesor(codigoProfesorAdjunto);
        cursoACompletar.setUnProfesorAdjunto((ProfesorAdjunto) profesorAdjuntoAIncluir);
        System.out.println("Profesor Adjunto asignado");
        cursoACompletar.setUnProfesorTitular((ProfesorTitular) profesorTitularAIncluir);
        System.out.println("Profesor Titular asignado");
    }


    public void inscribirAlumnoImportado(Integer codigoCurso) throws Exception {
        LectorDeArchivosCSV2 lector = new LectorDeArchivosCSV2();
        lector.importadorDeAlumnos();
        Curso cursoAInscribir = buscarCurso(codigoCurso);
        for (Alumno alumno : lector.listaDeAlumnosImportados) {
            if (cursoAInscribir.hayCupoDisponible()) {
                Inscripcion unaInscripcion = new Inscripcion(alumno, cursoAInscribir);
                cursoAInscribir.getListaDeAlumnos().add(alumno);
                this.listaDeInscripciones.add(unaInscripcion);

                System.out.println("Inscripcion realizada");
            } else {
                System.out.println("No hay cupo disponible para la inscripción solicitada");
            }
        }
    }
}