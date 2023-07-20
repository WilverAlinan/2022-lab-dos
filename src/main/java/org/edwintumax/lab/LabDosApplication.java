package org.edwintumax.lab;

import org.edwintumax.lab.entities.AbstractPersona;
import org.edwintumax.lab.entities.Alumno;
import org.edwintumax.lab.entities.Profesor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
//List es una clase abstracta y no se puede instanciar / ArrayList si se puede instanciar
@SpringBootApplication
public class LabDosApplication implements CommandLineRunner  {

    private List<AbstractPersona> listaGeneral = new ArrayList<AbstractPersona>();

    public static void main(String[] args) {
        SpringApplication.run(LabDosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Alumno nuevoAlumno = new Alumno("123","Garcia","Raul","rgarcia@gmail.com","202201",120);

        Profesor nuevoProfesor = new Profesor("123","Mancilla","Juan","jmancilla@kalum.edu","2489","Profesor de informatica");

        operarRegistro(nuevoAlumno);
        operarRegistro(nuevoProfesor);
        registrarAsistencia(nuevoAlumno);
        verMisDatos(nuevoAlumno);
        quitarAsignatura(nuevoProfesor);
        quitarAsignatura(nuevoAlumno);


    }

    public void operarRegistro(AbstractPersona elemento){
        this.listaGeneral.add(elemento);
    }

    public void registrarAsistencia(AbstractPersona elemento){
        for (AbstractPersona registro : listaGeneral){
            if (registro instanceof Alumno){
                if(((Alumno)registro).getCarne() == (((Alumno)elemento).getCarne())){
                    elemento.tomarAsistencia();
                    break;
                }
            }else if (registro instanceof Profesor){
                if(((Profesor) registro).getCui() == ((Profesor)elemento).getCui()){
                    elemento.tomarAsistencia();
                    break;
                }
            }
        }
//

        if(elemento instanceof Alumno){
            for(AbstractPersona registro: listaGeneral){
                if(((Alumno)registro).getCarne() == ((Alumno)elemento).getCarne()){
                    elemento.tomarAsistencia();
                    break;
                }
            }

        }else if(elemento instanceof Profesor){
            for (AbstractPersona registro: listaGeneral){
                if(registro.getUuid() == elemento.getUuid()){
                    elemento.tomarAsistencia();
                    break;
                }

            }

        }

    }

    public void verMisDatos(AbstractPersona elemento){
        if (elemento instanceof Alumno){
            Alumno registro = ((Alumno)elemento);
            registro.listarMisDatos(registro.getCarne());
        }else if(elemento instanceof Profesor){
            Profesor registro = (Profesor) elemento;
            registro.listarMisDatos(registro.getCui());
        }

    }

    public void quitarAsignatura(AbstractPersona elemento){
        if (elemento instanceof Alumno){
            Alumno registro = (Alumno) elemento;
            registro.elimiarAsignatura("Computacion");

        }else if (elemento instanceof Profesor){
            Profesor registro = (Profesor) elemento;
            registro.elimiarAsignatura("Matematicas");
        }
    }

}
