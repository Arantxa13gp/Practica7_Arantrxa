package Equipamiento;

import java.util.ArrayList;
import java.util.HashMap;

public class Artefacto extends Equipamiento{

    private String tipo;

    public Artefacto(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor) {
        super(nombre, estadisticas, rareza, valor);
        setTipo(tipo);
    }

    public Artefacto(Equipamiento copia) {
        super(copia);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        switch (tipo.toLowerCase()){
            case "anillo":
                break;
            case "amuleto":
                break;
            default:
                return;
        }
    }

    @Override
    public Integer recuperaEstadisticas(String estadistica) {
        switch (estadistica.toLowerCase()){
            case "vida", "ataque", "armadura", "resistencia", "velocidad", "fe", "magia":
                return super.recuperaEstadisticas(estadistica);
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "Este artefato es un " + tipo;
    }
}
