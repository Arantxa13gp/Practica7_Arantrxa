package Equipamiento;

import java.util.ArrayList;
import java.util.HashMap;

public class Artefacto extends Equipamiento{



    public Artefacto(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor) {
        super(nombre, estadisticas, rareza, valor);
    }

    public Artefacto(Equipamiento copia) {
        super(copia);
    }
}
