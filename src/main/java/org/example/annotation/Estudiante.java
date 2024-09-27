package org.example.annotation;

import java.lang.annotation.*;
import java.util.Locale;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Estudiantes.class)
public @interface Estudiante {
    String nombre();
    String fechaNacimiento();
    int curso();
    String direccion() default "";
}



