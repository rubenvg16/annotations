package org.example.Instituto;

import org.example.annotation.Estudiante;
import org.example.annotation.Estudiantes;

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
        @Estudiante(nombre = "jose", fechaNacimiento = "01/01/2001", curso = 2),
        @Estudiante(nombre = "fran", fechaNacimiento = "01/01/2001", curso = 2),
})
public class Clase {
    private String curso;
    private String aula;

    public Clase(String aula, String curso) {
        this.aula = aula;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public String getAula() {
        return aula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }


}
