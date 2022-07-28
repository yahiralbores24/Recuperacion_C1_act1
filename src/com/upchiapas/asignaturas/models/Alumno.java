package com.upchiapas.asignaturas.models;

public class Alumno {
    private String nombre;
    private String matricula;
    public Alumno() {

    }
    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }




    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "ALUMNOS\n\n" + "Nombre: " + nombre + "\nmatricula: " + matricula;
    }
}
