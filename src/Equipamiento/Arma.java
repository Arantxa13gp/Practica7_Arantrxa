package Equipamiento;

import java.awt.*;
import java.util.ArrayList;

public class Arma extends Equipamiento {

    private String empuñadura;
    private String tipo;

    public Arma(String nombre, ArrayList<Integer> estadisticas, String rareza, int valor, String empuñadura, String tipo) {
        super(nombre, estadisticas, rareza, valor);
        setEmpuñadura(empuñadura);
        setTipo(tipo);
    }
    public Arma(Equipamiento copia) {
        super(copia);

    }

    public String getEmpuñadura() {
        return empuñadura;
    }

    public void setEmpuñadura(String empuñadura) {
        this.empuñadura = empuñadura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        switch (tipo.toLowerCase()){
            case "una mano":
                break;
            case "dos manos":
                break;
            default:
                return;
        }
    }
}
