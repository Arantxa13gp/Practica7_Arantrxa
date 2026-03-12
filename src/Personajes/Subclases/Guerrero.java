package Personajes.Subclases;

/**
 * Clase Guerrero, representa una especialización de Personaje enfocada en el combate físico,
 * con altas probabilidades de mejora en ataque, armadura y puntos de vida.
 * @author Arantxa González Pérez
 * @version v1.0
 */
import Personajes.Personaje;

public class Guerrero extends Personaje {

    private boolean furia; /** Atributo tipo boolean que define la furia del personaje */

    /**
     * Constructor por defecto.
     * Inicializa un guerrero con los valores base de Personaje y la furia desactivada.
     */
    public Guerrero(){
        super();
        furia = false;
    }

    /**
     * Constructor completo para la clase Guerrero.
     * @param nombre Nombre del guerrero.
     * @param atq Puntos de ataque iniciales.
     * @param arm Puntos de armadura iniciales.
     * @param pv Puntos de vida iniciales.
     * @param nivel Nivel inicial.
     * @param res Resistencia mágica inicial.
     * @param vel Velocidad inicial.
     * @param raza Raza a la que pertenece el guerrero.
     */
    public Guerrero(String nombre, int atq, int arm, int pv, int nivel, int res, int vel, String raza){
        super(nombre, atq, arm, pv,nivel,res, vel, raza);
        setFuria(false);
    }

    /**
     * Setter de furia que tiene que recibir por parámetros con el tipo de dato incluido boolean.
     * Define si el guerrero entra o sale del estado de furia.
     * @param furia Estado de la furia (true para activada, false para desactivada).
     */
    public void setFuria(boolean furia) {
        this.furia = furia;
    }


    public void modificarFuria(){

    }

    /**
     * Método que incrementa el nivel del guerrero y actualiza sus estadísticas actuales.
     * Sincroniza el nivel sumando una unidad al valor actual.
     */
    public void subirNivel(){
       setNivel(getNivel()+1);
       setAtq(getAtq());
       setPv(getPv());
       setArm(getArm());
       setVel(getVel());
       setRes(getRes());
    }

    /**
     * Método que sube el ataque del guerrero.
     * Tiene un 20% de probabilidad de subir 2 puntos (n >= 80) y un 80% de subir 1 punto.
     */
    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 80){
            setAtq(getAtq() +2);
        }else setAtq(getAtq()+1);
    }

    /**
     * Método que sube la armadura del guerrero.
     * Tiene un 25% de probabilidad de subir 2 puntos (n >= 75) y un 75% de subir 1 punto.
     */
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 75){
            setArm(getArm() +2);
        }else setArm(getArm() +1);
    }

    /**
     * Método que sube los puntos de vida del guerrero.
     * Tiene un 25% de probabilidad de subir 2 puntos (n >= 75) y un 75% de subir 1 punto.
     */
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 75){
            setPv(getPv()+2);
        }else setPv(getPv() +1);
    }

    /**
     * Método que sube la resistencia mágica del guerrero.
     * Tiene un 80% de probabilidad de subir 1 punto (n >= 20).
     */
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 20){
           setRes(getRes() +1);
        }
    }

    /**
     * Método que sube la velocidad del guerrero.
     * Tiene un 50% de probabilidad de subir 1 punto (n >= 50).
     */
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setVel(getVel()+1);
        }
    }

    /**
     * Método toString que devuelve una representación en cadena de texto del guerrero.
     * Utiliza la implementación de la clase superior Personaje para el resumen de datos.
     * @return Un String con la información del guerrero.
     */
    public String toString(){
        return super.toString();
    }
}
