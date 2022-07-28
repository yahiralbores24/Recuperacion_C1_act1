package com.upchiapas.asignaturas.models;
import java.util.Scanner;
public class Operacionmenu extends Alumnosmaterias{


    private static Scanner teclado = new Scanner(System.in);
    byte op;
    public void menu() {

        do {

            System.out.printf("ASIGNATURAS\n");
            System.out.println("1. ALTA ASIGNATURAS");
            System.out.println("2. ALTA DE ALUMNO EN CADA ASIGNATURA");
            System.out.println("3. REGISTRO DE CALIFICACION POR ALUMNO");
            System.out.println("4. IMPRIMIR LISTA DE ALUMNOS POR ASIGNATURA");
            System.out.println("5. IMPRIMIR EL PROMEDIO DE CADA ASIGNATURA");
            System.out.print("CLIK UNA OPCION: ");
            op = teclado.nextByte();
            teclado.nextLine();
            switch (op) {
                case 1:
                    addAsig();
                    break;
                case 2:
                    altaAlumnos();
                    break;
                case 3:
                    regCalif();
                    break;
                case 4:
                    listaAlumnos();
                break;
                case 5:promedio(); break;
            }
        } while (op < 5);
    }






























   /* public static void addasignatura(){
        String materia,materia2,materia3,materia4;
        System.out.println("Ingrese el nombre de la primera materia");
        materia = teclado.nextLine();

        Asignatura = new Asignatura();

        Asignatura.setMateria(materia);
        byte indice = 0;
        while (listaasignatura[indice]!=null){
            indice ++;
        }
        listaasignatura [indice] = Asignatura;
        int i=0;
        while (listaasignatura[i]!=null){
            System.out.println("\n"+ listaasignatura[i]);
            i++;
        }
    }

    public static void addalumnos() {
        String matricula;
        String nombre;
        System.out.println("Ingrese su matricula: ");
        matricula=teclado.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        Alumno = new Alumno(nombre, matricula);
        byte indice = 0;

        while (listaAlumno[indice]!=null){
            indice++;
        }
        listaAlumno[indice]= Alumno;
        int i =0;
                while (listaAlumno[i]!=null){
                    System.out.println("\n"+ listaAlumno[i]);
                    i++;
                }
int b= 0, r=0;
                int mate=0, alum = 0;
                while (listaasignatura[b]!=null){
                    r++;
                    System.out.println(""+r+" "+listaasignatura[b]);
                    b++;
                }
        System.out.println("\nSelecciona la materia\n: ");
                mate = teclado.nextByte();
                mate=mate-1;
                int s=0,c=0;
                while (listaAlumno[c]!=null){
                    s++;
                    System.out.println(""+s+" "+ listaAlumno[c]);
                    c++;

                }
        System.out.println("\nSeleccione el Alumno\n: ");
        alum = teclado.nextByte();
        alum=alum-1;
        System.out.println("");
        System.out.println(""+listaAlumno[alum] +" lleva la materia "+listaasignatura[mate]);
        if (alum==0){

           listapromedio[0]=listapromedio[0]=100+alum;
            System.out.println("promedio \n"+listapromedio[0]);
        }else{
            if(alum==1){
                listapromedio[1]=listapromedio[1]+90;
                System.out.println(""+listapromedio[1]);
            }
            else{
                if(alum==2){
                    listapromedio[2]=listapromedio[2]+80;
                    System.out.println(""+listapromedio[2]);
                }
                else{
                    if(alum==3){
                        listapromedio[3]=listapromedio[3]+60;
                        System.out.println(""+listapromedio[3]);
                    }
                    else{
                        if(alum==4){
                          listapromedio[4]=listapromedio[4]+95;
                            System.out.println(""+listapromedio[4]);
                        }else{System.out.println("");}
                    }
                }
            }
        }


    }
    public void suma(){

        float sum=0, prom=0;

        sum = listapromedio[0]+listapromedio[1]+listapromedio[2]+listapromedio[3]+listapromedio[4];
        prom=sum/listapromedio[0]+listapromedio[1]+listapromedio[2]+listapromedio[3]+listapromedio[4];
        System.out.println(prom);
}*/
}
