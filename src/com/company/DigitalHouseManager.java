package com.company;

import java.util.List;

public class DigitalHouseManager{

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

    //METODO PARA BUSCAR CURSO POR CODIGO.

    public Curso buscarCurso(Integer codigoCurso) {
        Curso cursoAEncontrar = null;
        for (Curso unCurso : this.listaDeCursos) {
            if (unCurso.getCodigoCurso().equals(codigoCurso)) {
                cursoAEncontrar = unCurso;
                break;
            }
        } return cursoAEncontrar;
    }

    //METODO PARA BUSCAR ALUMNO POR CODIGO.

    public Alumno buscarAlumno(Integer codigoAlumno) {
        Alumno alumnoAEncontrar = null;
        for (Alumno alumno : this.listaDeAlumnos) {
            if (alumno.getCodigoAlumno().equals(codigoAlumno)) {
                alumnoAEncontrar = alumno;
                break;
            }
        } return alumnoAEncontrar;
    }

    //METODO PARA BUSCAR PROFESOR POR CODIGO.

    public Profesor buscarProfesor(Integer codigoProfesor) {
        Profesor profesorAEncontrar = null;
        for (Profesor unProfesor : this.listaDeProfesores) {
            if (unProfesor.getCodigoProfesor().equals(codigoProfesor)) {
                profesorAEncontrar = unProfesor;
                break;
            }
        } return profesorAEncontrar;
    }





    // METODO PARA ELIMINAR CURSO POR CODIGO

    public void eliminarCruso(Curso unCurso) {
        this.listaDeCursos.remove(unCurso);
    }

    public void bajaCurso(Integer codigoCurso) {
      eliminarCruso(buscarCurso(codigoCurso));


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
        eliminarProfesor(buscarProfesor(codigoProfesor));

    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno alumno = new Alumno(nombre, apellido, codigoAlumno);
        listaDeAlumnos.add(alumno);
        System.out.println("Alumno ingresado exitosamente");
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        buscarCurso(codigoCurso);
        buscarAlumno(codigoAlumno);

    }


}
