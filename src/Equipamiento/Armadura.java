package Equipamiento;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase Armadura, representa una pieza de equipo defensivo para el personaje.
 * Define el tipo de pieza (casco, pechera, etc.) y el material de fabricación,
 * restringiendo las estadísticas que puede aportar.
 * @author Arantxa González Pérez
 * @version v1.0
 */
public class Armadura extends Equipamiento {

    private String tipo; /** Atributo tipo String que define la parte del cuerpo que protege la armadura */
    private String material; /** Atributo tipo String que define el material (tela, cuero, metal) de la pieza */

    /**
     * Constructor por parámetros.
     * @param nombre Nombre de la armadura.
     * @param estadisticas Mapa de estadísticas con bonificaciones.
     * @param rareza Calidad de la pieza.
     * @param valor Valor económico.
     * @param tipo Categoría de la armadura (yelmos, pechera, etc.).
     * @param material Material de composición (tela, cuero, metal).
     */
    public Armadura(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor, String tipo, String material) {
        super(nombre, estadisticas, rareza, valor);
        setTipo(tipo);
        setMaterial(material);
    }

    /**
     * Constructor de copia.
     * @param copia Objeto de tipo Equipamiento del cual se clonarán los atributos.
     */
    public Armadura(Equipamiento copia) {
        super(copia);
    }

    /**
     * Getter de tipo.
     * @return El tipo de pieza de armadura.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter de tipo con validación.
     * Solo permite valores específicos: yelmos, pechera, hombreras, guanteletes, grebas o botas.
     * @param tipo El tipo de pieza a asignar.
     */
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

    /**
     * Getter de material.
     * @return El material del que está hecha la armadura.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Recupera el valor de una estadística defensiva específica.
     * Las armaduras solo pueden devolver valores para vida, armadura y resistencia.
     * @param estadistica Nombre de la estadística a consultar.
     * @return El valor entero de la estadística o null si no es una estadística defensiva permitida.
     */
    @Override
    public Integer recuperaEstadisticas(String estadistica) {
        switch (estadistica.toLowerCase()){
            case "vida", "armmadura", "resistencia" :
                return super.recuperaEstadisticas(estadistica);
            default:
                return null;
        }
    }

    /**
     * Setter de material con validación.
     * Restringe el material a: tela, cuero o metal.
     * @param material El material a asignar.
     */
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

    /**
     * Método toString que devuelve una representación en cadena de la armadura.
     * @return Un String indicando el tipo de pieza y su material.
     */
    @Override
    public String toString() {
        return "Esta armadura es un " + tipo + " y es de " + material;
    }


    /**
     * Compara la igualdad lógica entre dos armaduras.
     * @param otro El objeto Armadura a comparar.
     * @return true si coinciden en tipo y material, false en caso contrario.
     */
    public boolean equals(Armadura otro) {
        if (!tipo.equals(otro.tipo)){
            return false;
        }
        if (!material.equals(otro.material)){
            return false;
        }else return true;
    }
}
