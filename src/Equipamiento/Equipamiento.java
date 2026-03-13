package Equipamiento;

import java.util.HashMap;

public abstract class Equipamiento {
    private String nombre;
    HashMap<String, Integer> estadisticas = new HashMap();
    private String rareza;
    private int valor;

    public Equipamiento(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor) {
       setNombre(nombre);
       setEstadisticas(estadisticas);
       setRareza(rareza);
       setValor(valor);
    }

    public Equipamiento(Equipamiento copia){
        this.nombre = copia.nombre;
        this.estadisticas = copia.estadisticas;
        this.rareza = copia.rareza;
        this.valor = copia.valor;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Integer> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(HashMap<String, Integer> estadisticas) {
        this.estadisticas = estadisticas;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void recuperaEstadisticas(String estadistica){

        return;
    }

    public String toString(){
        return "El arma " + nombre + " tiene las siguientes estadísticas " + estadisticas
                + " es de rareza " + rareza + " y tiene un valor económico de: " + valor;
    }

    public boolean equals(Equipamiento otro) {
        if (!this.nombre.equals(otro.nombre)) {
            return false;
        }
        if (this.estadisticas != otro.estadisticas) {
            return false;
        }
        if (!this.rareza.equals(otro.rareza)) {
            return false;
        }
        if(this.valor != otro.valor) {
            return false;
        }
        else return true;
    }
}
