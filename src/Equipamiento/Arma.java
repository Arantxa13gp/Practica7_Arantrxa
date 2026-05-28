package Equipamiento;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/**
 * Clase Arma, representa un tipo de equipamiento ofensivo para los personajes.
 * Define la forma de empuñarla y el tipo de arma, lo que condiciona las estadísticas
 * que puede aportar (ataque, velocidad, fe o magia).
 * @author Arantxa González Pérez
 * @version v1.0
 */
public class Arma extends Equipamiento {

    private String empuñadura; /** Atributo tipo String que define si el arma es de una o dos manos */
    private String tipo; /** Atributo tipo String que define la categoría específica del arma */


    /**
     * Constructor por parámetros.
     * @param nombre Nombre descriptivo del arma.
     * @param estadisticas Mapa de bonificaciones de estadísticas.
     * @param rareza Calidad del arma (comun, raro, etc.).
     * @param valor Valor económico del objeto.
     * @param empuñadura Tipo de agarre ("una mano" o "dos manos").
     * @param tipo Categoría del arma según su empuñadura (espada, arco, baston, etc.).
     */
    public Arma(String nombre, HashMap<String, Integer> estadisticas, String rareza, int valor, String empuñadura, String tipo) {
        super(nombre, estadisticas, rareza, valor);
        setEmpuñadura(empuñadura);
        setTipo(tipo);
    }

    /**
     * Constructor de copia.
     * Crea una nueva instancia de Arma a partir de otra existente.
     * @param copia El objeto Arma que se desea copiar.
     */
    public Arma(Arma copia) {
        super(copia);
        this.empuñadura = copia.empuñadura;
        this.tipo = copia.tipo;
    }

    /**
     * Getter de empuñadura.
     * @return El tipo de empuñadura del arma.
     */
    public String getEmpuñadura() {
        return empuñadura;
    }

    /**
     * Setter de empuñadura con validación.
     * Solo permite los valores "una mano" o "dos manos".
     * @param empuñadura La cadena que define el agarre del arma.
     */
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

    /**
     * Getter de tipo.
     * @return El tipo específico de arma.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter de tipo con validación basada en la empuñadura.
     * Si es de una mano, permite: espada, maza, hacha, cetro o daga.
     * Si es de dos manos, permite: espadon, martillo, arco o baston.
     * @param tipo El nombre del tipo de arma a asignar.
     */
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

    /**
     * Recupera el valor de una estadística ofensiva o de utilidad mágica.
     * Las armas solo devuelven valores para ataque, velocidad, fe y magia.
     * @param estadistica Nombre de la estadística a consultar.
     * @return El valor entero de la estadística o null si no pertenece a las permitidas para armas.
     */
    @Override
    public Integer recuperaEstadisticas(String estadistica) {
        switch (estadistica.toLowerCase()){
            case "ataque", "velocidad" , "fe", "magia":
                return super.recuperaEstadisticas(estadistica);
            default:
                return null;
        }
    }

    /**
     * Método toString que devuelve una representación textual del arma.
     * @return Un String con la empuñadura y el tipo de arma.
     */
    public String toString() {
        return "Este arma se empuña con " + empuñadura + " y el arma es: " + tipo;
    }

    /**
     * Compara la igualdad lógica entre dos armas.
     * @param otro El objeto Arma a comparar.
     * @return true si la empuñadura y el tipo coinciden, false en caso contrario.
     */
    public boolean equals(Arma otro) {
        if (!empuñadura.equals(otro.empuñadura)) {
            return false;
        }
        if (!tipo.equals(otro.tipo)) {
            return false;
        } else return true;
    }

}
