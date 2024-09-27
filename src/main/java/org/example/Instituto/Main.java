package org.example.Instituto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al gestor de instituto");
        System.out.println("Cargando contexro de aplicación...");

        List<Clase> clases = CargadorContexto.cargaContextoInstituso();

        System.out.println("Clases cargadas: ");

        for (Clase clase : clases) {
            System.out.println(clase);
        }
    }
}
