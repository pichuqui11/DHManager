package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] ar) {

        DigitalHouseManager manager = new DigitalHouseManager();
        manager.altaProfesorTitular("Juan", "Perez", 001, "Matemática");
        manager.altaProfesorTitular("Abel", "Pintos", 002, "Música");
        manager.altaProfesorAdjunto("Carlos", "Menem", 003, 10);
        manager.altaProfesorAdjunto("Max", "Power", 004, 20);

        manager.altaCurso("Full Stack",20001,3);
        manager.altaCurso("Android",20002,2);

        manager.asignarProfesores(20001,001,003);
        manager.asignarProfesores(20002,002,004);

        manager.altaAlumno("Homero","Thompson",1);
        manager.altaAlumno("Esteban", "Aristi",2);
        manager.altaAlumno("Tito","Del Bajon",3);

        manager.inscribirAlumno(1,20001);
        manager.inscribirAlumno(2,20001);
        manager.inscribirAlumno(1,20002);
        manager.inscribirAlumno(2,20002);
        manager.inscribirAlumno(3,20002);

        manager.bajaProfesor(1);
        manager.bajaCurso(20001);

    }
}