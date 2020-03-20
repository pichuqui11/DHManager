package com.company;

public class Main {

    public static void main(String[] ar) {
	// write your code here

   Alumno otroAlumno = new Alumno("Esteban","Aristi",32098723);
   Alumno juanCarlos = new Alumno("Juan","Carlos",112);

   if(otroAlumno.equals(juanCarlos)){
       System.out.println("Funciona");;
   }else{
       System.out.println("no funciona");
   }



    }

}
