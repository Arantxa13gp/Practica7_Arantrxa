package Equipamiento;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase Artefacto, representa un tipo de equipamiento especial que puede ser un anillo o un amuleto.
 * Extiende la clase Equipamiento para heredar la gestión de estadísticas y valores.
 * @author Arantxa González Pérez
 * @version v1.0
 */

public class Artefacto extends Equipamiento{

    private String tipo; /** Atributo tipo String que define la categoría del artefacto (anillo o amuleto) */

    /**
     * Constructor por parámetros.
     * Inicializa un artefacto con sus datos básicos y define su tipo específico.
     * @param nombre Nombre del artefacto.
     * @param estadisticas Mapa con las bonificaciones de estadísticas.
     * @param rareza Calidad del objeto.
     * @param valor Precio o valor económico.
     */
    public Artefacto(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor) {
        super(nombre, estadisticas, rareza, valor);
        setTipo(tipo);
    }

    /**
     * Constructor de copia.
     * @param copia Objeto de tipo Equipamiento del cual se clonarán los atributos.
     */
    public Artefacto(Equipamiento copia) {
        super(copia);
    }

    /**
     * Getter de tipo.
     * @return El tipo de artefacto (anillo o amuleto).
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter de tipo con validación.
     * Solo permite asignar "anillo" o "amuleto" como valores válidos.
     * @param tipo La categoría a asignar al artefacto.
     */
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

    /**
     * Recupera el valor de una estadística específica llamando a la implementación superior.
     * @param estadistica Nombre de la estadística a consultar.
     * @return El valor entero de la estadística o null si no existe.
     */
    @Override
    public Integer recuperaEstadisticas(String estadistica) {
        switch (estadistica.toLowerCase()){
            case "vida", "ataque", "armadura", "resistencia", "velocidad", "fe", "magia":
                return super.recuperaEstadisticas(estadistica);
            default:
                return null;
        }
    }

    /**
     * Método toString que devuelve una representación sencilla del tipo de artefacto.
     * @return Un String indicando si es anillo o amuleto.
     */
    @Override
    public String toString() {
        return "Este artefato es un " + tipo;
    }
}
