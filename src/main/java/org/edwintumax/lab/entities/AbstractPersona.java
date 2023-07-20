package org.edwintumax.lab.entities;

public abstract class AbstractPersona{

    private String uuid;
    private String apellido;
    private String nombres;
    private String email;
    public abstract void tomarAsistencia();

    public AbstractPersona() {
    }

    public AbstractPersona(String uuid, String apellido, String nombres, String email) {
        this.uuid = uuid;
        this.apellido = apellido;
        this.nombres = nombres;
        this.email = email;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUuid(){
        return uuid;
    }
}
