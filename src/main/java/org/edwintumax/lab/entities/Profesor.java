package org.edwintumax.lab.entities;

import org.edwintumax.lab.interfaces.IOperaciones;

public class Profesor extends AbstractPersona implements IOperaciones {

    private String cui;
    private String cargo;

    public Profesor() {
        super();
    }

    public Profesor(String uuid, String apellido, String nombres, String email, String cui, String cargo) {
        super(uuid, apellido, nombres, email);
        this.cui = cui;
        this.cargo = cargo;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void tomarAsistencia() {
        System.out.println("Tomando Asistencia del Profesor: " + this.getApellido() + " "+ this.getNombres());
    }


    @Override
    public void listarMisDatos(String identificador) {
        System.out.println("Identificador: "+ identificador);
        System.out.println(this.getUuid() + " " + this.getApellido() + " "+ this.getNombres()+ " " + this.getCargo());

    }

    @Override
    public void elimiarAsignatura(String asignatura) {
        System.out.println("Se ha Eliminado " + asignatura + " del Profesor " + this.getApellido() + " " + this.getNombres());

    }
}
