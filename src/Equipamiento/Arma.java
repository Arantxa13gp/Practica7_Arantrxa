package Equipamiento;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Arma extends Equipamiento {

    private String empuñadura;
    private String tipo;


    public Arma(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor, String empuñadura, String tipo) {
        super(nombre, estadisticas, rareza, valor);
        setEmpuñadura(empuñadura);
        setTipo(tipo);
    }

    public Arma(Arma copia) {
        super(copia);
        this.empuñadura = copia.empuñadura;
        this.tipo = copia.tipo;
    }

    public String getEmpuñadura() {
        return empuñadura;
    }

    public void setEmpuñadura(String empuñadura) {
        switch (empuñadura.toLowerCase()) {
            case "una mano":
                break;
            case "dos manos":
                break;
            default:
                return;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (empuñadura.equals("una mano")) {
            switch (tipo.toLowerCase()) {
                case "espada","maza", "hacha", "cetro", "daga":
            }
        }else{
            if (empuñadura.equals("dos manos")){
                switch (tipo.toLowerCase()) {
                    case "espadon", "martillo", "arco", "baston":
                }
            }
        }
    }

    @Override
    public Integer recuperaEstadisticas(String estadistica) {
        switch (estadistica.toLowerCase()){
            case "ataque", "velocidad" , "fe", "magia":
                return super.recuperaEstadisticas(estadistica);
            default:
                return null;
        }
    }

    public String toString() {
        return "Este arma se empuña con " + empuñadura + " y el arma es: " + tipo;
    }

    public boolean equals(Arma otro) {
        if (!empuñadura.equals(otro.empuñadura)) {
            return false;
        }
        if (!tipo.equals(otro.tipo)) {
            return false;
        } else return true;
    }
}
