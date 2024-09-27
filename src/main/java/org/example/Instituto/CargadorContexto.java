package org.example.Instituto;


import org.example.annotation.Estudiante;
import org.example.annotation.Estudiantes;

import java.lang.annotation.Annotation;
import java.util.List;

public class CargadorContexto {
    public  static List<Clase> cargaContextoInstituso() {

         Estudiante[] estudiantesAnnotation = Clase.class.getAnnotationsByType(Estudiante.class);

         for (Estudiante estudianteAnnotation : estudiantesAnnotation) {
             System.out.println(estudianteAnnotation);
         }

        return List.of();
    }
}
