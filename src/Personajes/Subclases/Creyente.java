package Personajes.Subclases;

/**
 * Clase abstracta Creyente, representa una especialización de Personaje que introduce
 * el sistema de fe y milagros. Sirve como base para clases como Clérigo o Paladín.
 * @author Arantxa González Pérez
 * @version v1.0
 */
import Personajes.Personaje;

public abstract class Creyente extends Personaje {

    private int fe; /** Atributo tipo int que define la fe del personaje */

    /**
     * Constructor por defecto.
     * Inicializa un creyente con los valores base de Personaje y una fe inicial de -1.
     */
    public Creyente(){
        super();
        fe = -1;
    }

    /**
     * Constructor completo para la clase Creyente.
     * @param nombre Nombre del creyente.
     * @param atq Puntos de ataque iniciales.
     * @param arm Puntos de armadura iniciales.
     * @param pv Puntos de vida iniciales.
     * @param nivel Nivel inicial.
     * @param res Resistencia mágica inicial.
     * @param vel Velocidad inicial.
     * @param raza Raza a la que pertenece el creyente.
     */
    public Creyente(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza){
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
        setFe(fe);
    }

    /**
     * Getter de fe.
     * @return Los puntos de fe actuales del personaje.
     */
    public int getFe() {
        return fe;
    }

    /**
     * Setter de fe que tiene que recibir por parámetros con el tipo de dato incluido int.
     * Establece el nivel de devoción del personaje.
     * @param fe El nuevo valor de fe.
     */
    public void setFe(int fe) {
        this.fe = fe;
    }

    /**
     * Método abstracto que define la plegaria que el creyente realiza.
     * Debe ser implementado por las subclases para definir efectos específicos (ej. Clérigo).
     * @param milagro El nombre del milagro o efecto deseado.
     * @return Un String que representa el resultado o nombre del milagro.
     */
    public abstract String plegaria(String milagro);

    /**
     * Método toString que devuelve una representación en cadena de texto del creyente.
     * Extiende la información de Personaje añadiendo los puntos de fe.
     * @return Un String con el resumen de datos y puntos de fe del creyente.
     */
    public String toString(){
        return super.toString() + " tiene " + fe + " puntos de fe";
    }
}
