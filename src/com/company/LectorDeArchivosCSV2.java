package com.company;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderHeaderAware;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorDeArchivosCSV2 {

    public List<Alumno> listaDeAlumnosImportados;

    public LectorDeArchivosCSV2() {
        this.listaDeAlumnosImportados = new ArrayList<>();
    }

    public void importadorDeAlumnos() throws Exception {
        CSVReader reader = new CSVReaderHeaderAware(new FileReader("C:\\listadoDeAlumnos.csv"));
        String[] nextLine;
        String nombre;
        String apellido;
        Integer codigoAlumno;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                nombre = nextLine[1];
                apellido = nextLine[2];
                codigoAlumno = Integer.parseInt(nextLine[0]);
                Alumno unAlumno = new Alumno(nombre, apellido, codigoAlumno);
                listaDeAlumnosImportados.add(unAlumno);
            }
        }
        System.out.println("Lista importada exitosamente");
        System.out.printf("Se ingresaron "+ listaDeAlumnosImportados.size()+" alumnos.");
    }

}