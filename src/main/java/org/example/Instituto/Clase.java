package org.example.Instituto;

import org.example.annotation.Estudiante;
import org.example.annotation.Estudiantes;

import java.util.ArrayList;
import java.util.List;

/*@Estudiante(
       nombre = "jose",
       fechaNacimiento = "01/01/2001",
       curso = 2
)
@Estudiante(
       nombre = "fran",
       fechaNacimiento = "01/01/2001",
       curso = 2
)*/
@Estudiantes({
        @Estudiante(nombre = "jose", fechaNacimiento = "01/01/2001", curso = 1),
        @Estudiante(nombre = "fran", fechaNacimiento = "01/01/2001", curso = 2),
})
public class Clase {
    private String aula;
    private int curso;
    private List<org.example.Instituto.Estudiante> estudiantes = new ArrayList<>();

     public Clase() {
     }

     public Clase(int curso) {
         this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public String getAula() {
        return aula;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }


    public List<org.example.Instituto.Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
