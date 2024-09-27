package org.example.Instituto;


import org.example.annotation.Estudiante;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CargadorContexto {
    public  static List<Clase> cargaContextoInstituso() {

         Estudiante[] estudiantesAnnotation = Clase.class.getAnnotationsByType(Estudiante.class);

         Map<Integer, Clase> integerClaseMap = new HashMap<>();

         for (Estudiante estudianteAnnotation : estudiantesAnnotation) {
//          System.out.println(estudianteAnnotation);
             System.out.println(integerClaseMap.get(estudianteAnnotation.curso()));

             int curso = estudianteAnnotation.curso();
             Clase claseBuscada = integerClaseMap.get(estudianteAnnotation.curso());

             if ( claseBuscada== null) {
                 claseBuscada = new Clase(curso);
                 integerClaseMap.put(curso, claseBuscada);
             }
             claseBuscada.getEstudiantes().add(new org.example.Instituto.Estudiante(
                     estudianteAnnotation.nombre(),
                     LocalDate.now(),
                     100,
                     estudianteAnnotation.direccion()
             ));
         }



        return new ArrayList<>(integerClaseMap.values());
    }
}
