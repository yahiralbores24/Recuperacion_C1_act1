package com.upchiapas.asignaturas.models;

import java.util.ArrayList;
import java.util.Scanner;
public class Alumnosmaterias
{
    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList listaMateria = new ArrayList();
    private static ArrayList listaAlumno = new ArrayList();
    private static ArrayList listaAlumno2 = new ArrayList();
    private static ArrayList listaAlumno3 = new ArrayList();
    private static String alumno1,alumno2,alumno3,
            alumno4,alumno5,alumno6,
            alumno7,alumno8,alumno9;
    private static String materia1,
            materia2,materia3;
        public static void addAsig () {
            String materia;
            System.out.println("MATERIA 1");
            materia1 = teclado.nextLine();
            listaMateria.add(materia1);
            System.out.println("MATERIA 2");
            materia2 = teclado.nextLine();
            listaMateria.add(materia2);
            System.out.println("MATERIA 3");
            materia3 = teclado.nextLine();
            listaMateria.add(materia3);
            System.out.println("\nMATERIAS\n" + listaMateria + "\n");


        }
        public static void altaAlumnos () {
            System.out.println("\nASIGNAR MATERIA A ALUMNOS\n");
            System.out.println("1. " + materia1);
            System.out.println("2. " + materia2);
            System.out.println("3. " + materia3);
            System.out.println("4. salir");
            System.out.print("\nSELECCIONA MATERIA ASIGNAR:  ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    asigAl();
                    break;
                case 2:
                    asigAl2();
                    break;
                case 3:
                    asigAl3();
                    break;
                case 4:
                    break;
            }
        }
        public static void asigAl () {
            System.out.println("\nALUMNOS ASIGNAR\n");
            String alr = teclado.nextLine();
            System.out.println("ALUMNO 1");
            alumno1 = teclado.nextLine();
            listaAlumno.add(alumno1);
            System.out.println("ALUMNO 2");
            alumno2 = teclado.nextLine();
            listaAlumno.add(alumno2);
            System.out.println("ALUMNO 3");
            alumno3 = teclado.nextLine();
            listaAlumno.add(alumno3);
            System.out.println("\nALUMNOS ASIGNADOS\n" +listaAlumno + "\n");
        }
        public static void asigAl2 () {
            System.out.println("\nALUMNO ASIGNAR\n");
            String alr = teclado.nextLine();
            System.out.println("ALUMNO 1");
            alumno4 = teclado.nextLine();
            listaAlumno2.add(alumno4);
            System.out.println("ALUMNO 2");
            alumno5 = teclado.nextLine();
            listaAlumno2.add(alumno5);
            System.out.println("ALUMNO 3");
            alumno6 = teclado.nextLine();
            listaAlumno2.add(alumno6);
            System.out.println("\nALUMNOS ASIGNADOS\n" + listaAlumno2 + "\n");
        }
        public static void asigAl3 () {
            System.out.println("\nALUMNO ASIGNAR\n");
            String alr = teclado.nextLine();
            System.out.println("ALUMNO 1");
            alumno7 = teclado.nextLine();
            listaAlumno3.add(alumno7);
            System.out.println("ALUMNO 2");
            alumno8 = teclado.nextLine();
            listaAlumno3.add(alumno8);
            System.out.println("ALUMNO 3");
            alumno9 = teclado.nextLine();
            listaAlumno3.add(alumno9);
            System.out.println("\nALUMNOS ASIGNADOS\n" + listaAlumno3 + "\n");
        }
        private static int cali1, cali2, cali3, cali4, cali5, cali6, cali7, cali8, cali9;
        public static void regCalif () {
            System.out.println("\nDAR CALIFICACION DE MATERIA\n");
            System.out.println("1. CALIFICACION DE:  " + materia1);
            System.out.println("2. CALIFICACION DE:  " + materia2);
            System.out.println("3. CALIFICACION DE:  " + materia3 + "\n");
            System.out.print("CLIK UNA OPCION: ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nIDIQUE LA CALIFICACION PARA:  " + alumno1);
                    cali1 = teclado.nextInt();
                    System.out.println("IDIQUE LA CALIFICACION PARA:  " + alumno2);
                    cali2 = teclado.nextInt();
                    System.out.println("IDIQUE LA CALIFICACION PARA:  " + alumno3);
                    cali3 = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("\nIDIQUE LA CALIFICACION PARA:  " + alumno4);
                    cali4 = teclado.nextInt();
                    System.out.println("IDIQUE LA CALIFICACION PARA:  " + alumno5);
                    cali5 = teclado.nextInt();
                    System.out.println("IDIQUE LA CALIFICACION PARA:  " + alumno6);
                    cali6 = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("\nIDIQUE LA CALIFICACION PARA:  " + alumno7);
                    cali7 = teclado.nextInt();
                    System.out.println("IDIQUE LA CALIFICACION PARA:  " + alumno8);
                    cali8 = teclado.nextInt();
                    System.out.println("IDIQUE LA CALIFICACION PARA:  " + alumno8);
                    cali9 = teclado.nextInt();
                    break;
            }
        }
        public static void promedio () {
            System.out.println("\nPROMEDIOS\n");
            System.out.println("\nPROMEDIO DE LA ASIGNATURA:  " + materia1 + " : \n");
            int prome = 0;
            prome = cali1 + cali2 + cali3;
            int promedio1 = prome / 3;
            System.out.println(promedio1);

            System.out.println("\nPROMEDIO DE LA ASIGNATURA:  " + materia2 + " : \n");
            int prome2 = 0;
            prome2 = cali4 + cali5 + cali6;
            int promedio2 = prome2 / 3;
            System.out.println(promedio2);

            System.out.println("\nPROMEDIO DE LA ASIGNATURA:  " + materia3 + " : \n");
            int prome3 = 0;
            prome3 = cali7 + cali8 + cali9;
            int promedio3 = prome3 / 3;
            System.out.println(promedio3);
        }
        public static void listaAlumnos () {
            System.out.println("\nRELACION DE MATERIAS\n");
            System.out.println("\nALUMNOS QUE CURSAN:  " + materia1 + "\n" + listaAlumno);
            System.out.println("\nALUMNOS QUE CURSAN:  " + materia2 + "\n" + listaAlumno2);
            System.out.println("\nALUMNOS QUE CURSAN:  " + materia3 + "\n" + listaAlumno3);
        }


}
