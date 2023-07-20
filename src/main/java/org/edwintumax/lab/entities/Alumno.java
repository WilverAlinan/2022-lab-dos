package org.edwintumax.lab.entities;

import org.edwintumax.lab.interfaces.IOperaciones;

public class Alumno extends AbstractPersona implements IOperaciones {


    private String carne;
    private int numeroCreditos;

    @Override
    public void tomarAsistencia() {
        System.out.println("Tomando Asistencia del Alumno con Carne: " + this.carne);

    }

    public Alumno() {
        super();
    }

    public Alumno(String uuid, String apellido, String nombres, String email, String carne, int numeroCreditos) {
        super(uuid, apellido, nombres, email);
        this.carne = carne;
        this.numeroCreditos = numeroCreditos;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    @Override
    public void listarMisDatos(String identificador) {
        System.out.println("Identificador: "+ identificador);
        System.out.println(this.getUuid() + " " + this.getApellido() + " "+ this.getNombres()+ " " + this.getNumeroCreditos());

    }

    @Override
    public void elimiarAsignatura(String asignatura) {
        System.out.println("Se ha Eliminado la Asignatura: "+ asignatura + " " + this.getApellido() + " " + this.getNombres() + ", Perdera el numero de Creditos: " + this.getNumeroCreditos());

    }
}

