package com.company;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


public class LectorDeArchivoCSV {

    public static List<Alumno> listaDeAlumnosImportados = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReaderBuilder(new FileReader("C:\\listadoDeAlumnos.csv")).withSkipLines(1).build();
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
