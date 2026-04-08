package Equipamiento;

import java.util.ArrayList;
import java.util.HashMap;

public class Armadura extends Equipamiento {

    private String tipo;
    private String material;

    public Armadura(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor, String tipo, String material) {
        super(nombre, estadisticas, rareza, valor);
        setTipo(tipo);
        setMaterial(material);
    }

    public Armadura(Equipamiento copia) {
        super(copia);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        switch (tipo.toLowerCase()){
            case "yelmos":
                break;
            case "pechera":
                break;
            case "hombreras":
                break;
            case "guanteletes":
                break;
            case "grebas":
                break;
            case "botas":
                break;
            default:
                return;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        switch (material.toLowerCase()){
            case "tela":
                break;
            case "cuero":
                break;
            case "metal":
                break;
            default:
                return;
        }
    }

    @Override
    public String toString() {
        return "Esta armadura es un " + tipo + " y es de " + material;
    }

    public boolean equals(Armadura otro) {
        if (!tipo.equals(otro.tipo)){
            return false;
        }
        if (!material.equals(otro.material)){
            return false;
        }else return true;
    }
}
