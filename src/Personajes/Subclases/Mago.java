package Personajes.Subclases;

/**
 * Clase Mago, representa una especialización de Personaje centrada en el uso de magia y conjuros.
 * @author Arantxa González Pérez
 * @version v1.0
 */
import Personajes.Personaje;

public class Mago extends Personaje {

    private int mag; /** Atributo tipo int que define la mag del personaje */

    /**
     * Constructor por defecto.
     * Inicializa un mago con las estadísticas base de Personaje y una magia inicial de 10.
     */
    public Mago() {
        super();
        mag = 10;
    }

    /**
     * Constructor completo para la subclase Mago.
     * @param nombre Nombre del mago.
     * @param atq Puntos de ataque.
     * @param arm Puntos de armadura.
     * @param pv Puntos de vida.
     * @param nivel Nivel actual.
     * @param res Resistencia mágica.
     * @param vel Velocidad.
     * @param raza Raza del personaje.
     */
    public Mago(String nombre, int atq, int arm, int pv, int nivel, int res, int vel, String raza) {
        //super(nombre, atq, arm, pv, nivel, res, vel, raza);
        setMag(mag);
    }

    /**
     * Método que incrementa el nivel del mago y actualiza sus estadísticas actuales.
     */
    public void subirNivel() {
        setNivel(getNivel() + 1);
        setAtq(getAtq());
        setPv(getPv());
        setArm(getArm());
        setVel(getVel());
        setRes(getRes());
    }

    /**
     * Getter de mag.
     * @return El valor de magia del personaje.
     */
    public int getMag() {
        return mag;
    }

    /**
     * Setter de mag que tiene que recibir por parámetros con el tipo de dato incluido int.
     * @param mag El nuevo valor de magia.
     */
    public void setMag(int mag) {
        this.mag = mag;
    }

    /**
     * Método que sube el ataque.
     * Tiene un 20% de probabilidad de subir 2 puntos (n >= 80) y un 80% de subir 1 punto.
     */
    public void subirAtq() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 80) {
            setAtq(getAtq() + 2);
        } else setAtq(getAtq() + 1);
    }

    /**
     * Método que sube la armadura.
     * Tiene un 25% de probabilidad de subir 2 puntos (n >= 75) y un 75% de subir 1 punto.
     */
    public void subirArm() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 75) {
            setArm(getArm() + 2);
        } else setArm(getArm() + 1);
    }

    /**
     * Método que sube los puntos de vida.
     * Tiene un 25% de probabilidad de subir 2 puntos (n >= 75) y un 75% de subir 1 punto.
     */
    public void subirPv() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 75) {
            setPv(getPv() + 2);
        } else setPv(getPv() + 1);
    }

    /**
     * Método que sube la resistencia mágica.
     * Solo sube 1 punto si el número aleatorio es mayor o igual a 20 (80% de probabilidad).
     */
    public void subirRes() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 20) {
            setRes(getRes() + 1);
        }
    }

    /**
     * Método que sube la velocidad.
     * Tiene un 50% de probabilidad de subir 1 punto (n >= 50).
     */
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setVel(getVel()+1);
        }
    }

    /**
     * Método que ejecuta un conjuro modificando las estadísticas del mago temporal o permanentemente.
     * @param conjuro El nombre del conjuro a lanzar (bola de fuego, escudo arcano, céfiro o presteza mental).
     */
    public void lanzarConjuro(String conjuro) {
        switch (conjuro.toLowerCase()) {
            case "bola de fuego":
                setAtq((int) (getAtq() * 0.7));
                break;
            case "escudo arcano":
                setArm((int) (getArm() * 0.5));
                setRes((int) (getRes() * 0.5));
                break;
            case "céfiro":
                setAtq((int) (getAtq() * 0.3));
                break;
            case "presteza mental":
                break;
        }
    }

    /**
     * Método toString que devuelve una representación en cadena de texto del personaje.
     * Utiliza la implementación de la clase madre Personaje para mostrar los datos.
     * @return Un String con el resumen de los datos del mago.
     */
    public String toString() {
        return super.toString();
    }
}
