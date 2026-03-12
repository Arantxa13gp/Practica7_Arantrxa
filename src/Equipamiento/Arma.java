package Equipamiento;

import java.util.ArrayList;

public class Arma extends Equipamiento {

    public Arma(String nombre, ArrayList<Integer> estadisticas, String rareza, int valor) {
        super(nombre, estadisticas, rareza, valor);
    }

    public Arma(Equipamiento copia) {
        super(copia);
    }
}
