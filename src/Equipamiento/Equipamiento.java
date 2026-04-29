package Equipamiento;

import java.util.HashMap;

/**
 * Clase abstracta Equipamiento, representa la base para cualquier objeto equipable
 * (Armas, Armaduras, Artefactos) en el sistema.
 * Gestiona atributos comunes como nombre, estadísticas dinámicas, rareza y valor.
 * @author Arantxa González Pérez
 * @version v1.0
 */
public abstract class Equipamiento {
    private String nombre; /** Atributo tipo String que define el nombre del equipamiento */
    HashMap<String, Integer> estadisticas = new HashMap(); /** Mapa que almacena las bonificaciones de estadísticas del objeto */
    private String rareza; /** Atributo tipo String que define la rareza (común, raro, épico, legendario) */
    private int valor; /** Atributo tipo int que define el valor económico del objeto */


    /**
     * Constructor por parámetros.
     * @param nombre Nombre descriptivo del equipo.
     * @param estadisticas Mapa de pares estadística-valor.
     * @param rareza Calidad del objeto.
     * @param valor Precio o valor comercial.
     */
    public Equipamiento(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor) {
        setNombre(nombre);
        setEstadisticas(estadisticas);
        setRareza(rareza);
        setValor(valor);
    }

    /**
     * Constructor de copia.
     * @param copia Objeto de tipo Equipamiento del cual se clonarán los atributos.
     */
    public Equipamiento(Equipamiento copia){
        this.nombre = copia.nombre;
        this.estadisticas = copia.estadisticas;
        this.rareza = copia.rareza;
        this.valor = copia.valor;

    }

    /**
     * Getter de nombre.
     * @return El nombre del equipamiento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de nombre con validación de longitud.
     * El nombre no puede estar vacío ni superar los 20 caracteres.
     * @param nombre El nombre a asignar.
     */
    public void setNombre(String nombre) {
        if(nombre.length() > 20 || nombre.isEmpty())
            this.nombre = "";
        else this.nombre = nombre;
    }

    /**
     * Getter de estadisticas.
     * @return El mapa de estadísticas actual.
     */
    public HashMap<String, Integer> getEstadisticas() {
        return estadisticas;
    }

    /**
     * Setter de estadisticas.
     * @param estadisticas El nuevo mapa de estadísticas.
     */
    public void setEstadisticas(HashMap<String, Integer> estadisticas) {
        this.estadisticas = estadisticas;
    }

    /**
     * Getter de rareza.
     * @return La rareza del objeto.
     */
    public String getRareza() {
        return rareza;
    }

    /**
     * Setter de rareza con validación de valores permitidos.
     * Solo acepta: comun, raro, epico o legendario.
     * @param rareza La calidad a asignar.
     */
    public void setRareza(String rareza) {
        switch (rareza.toLowerCase()){
            case "comun", "raro"," epico", "legendario":
                break;
            default:
                this.rareza = "";
        }
    }

    /**
     * Getter de valor.
     * @return El valor económico.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Setter de valor.
     * No permite valores menores a 1.
     * @param valor El precio del objeto.
     */
    public void setValor(int valor) {
        if (valor < 1)
            this.valor = -1;
        else this.valor = valor;
    }

    /**
     * Recupera el valor de una estadística específica del mapa.
     * Valida que la estadística solicitada sea una de las permitidas por el sistema.
     * @param estadistica Nombre de la estadística (vida, ataque, armadura, etc.).
     * @return El valor asociado o null si no es válida o no existe.
     */
    public Integer recuperaEstadisticas(String estadistica){
        switch (estadistica.toLowerCase()) {
            case "vida", "ataque", "armadura", "resistencia", "velocidad" , "fe", "magia" :
                return estadisticas.get(estadistica);
            default:
                return null;
        }
    }

    /**
     * Método toString que devuelve una representación en cadena del equipamiento.
     * @return Un String detallando nombre, estadísticas, rareza y valor.
     */
    public String toString(){
        return "El arma " + nombre + " tiene las siguientes estadísticas " + estadisticas
                + " es de rareza " + rareza + " y tiene un valor económico de: " + valor;
    }

    /**
     * Compara igualdad lógica entre dos objetos de equipamiento.
     * @param otro El objeto a comparar.
     * @return true si nombre, estadísticas, rareza y valor coinciden.
     */
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