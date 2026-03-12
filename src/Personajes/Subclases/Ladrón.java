package Personajes.Subclases;

/**
 * Clase Ladrón, representa una especialización de Personaje enfocada en la agilidad,
 * la velocidad y el sigilo, con altas probabilidades de mejora en evasión y rapidez.
 * @author Arantxa González Pérez
 * @version v1.0
 */
import Personajes.Personaje;

public class Ladrón extends Personaje {

    /**
     * Constructor por defecto.
     * Crea un ladrón utilizando el constructor base de la clase superior.
     */
    public Ladrón(){
        super();
    }

    /**
     * Constructor completo para la clase Ladrón.
     * @param nombre Nombre del ladrón.
     * @param atq Puntos de ataque iniciales.
     * @param arm Puntos de armadura iniciales.
     * @param pv Puntos de vida iniciales.
     * @param nivel Nivel inicial.
     * @param res Resistencia mágica inicial.
     * @param vel Velocidad inicial.
     * @param raza Raza a la que pertenece el ladrón.
     */
    public Ladrón(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza){
        super(nombre, atq, arm, pv,nivel,res, vel, raza);
    }

    /**
     * Método que incrementa el nivel del ladrón y actualiza sus estadísticas actuales.
     * Sincroniza el nivel del personaje sumando una unidad al valor actual.
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
     * Método que sube el ataque del ladrón.
     * Tiene un 60% de probabilidad de subir 2 puntos (n >= 40) y un 40% de subir 1 punto.
     */
    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 40){
            setAtq(getAtq() +2);
        }else setAtq(getAtq()+1);
    }

    /**
     * Método que sube la armadura del ladrón.
     * Tiene un 40% de probabilidad de subir 2 puntos (n >= 60) y un 60% de subir 1 punto.
     */
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 60){
            setArm(getArm() +2);
        }else setArm(getArm() +1);
    }

    /**
     * Método que sube los puntos de vida del ladrón.
     * Tiene un 40% de probabilidad de subir 2 puntos (n >= 60) y un 60% de subir 1 punto.
     */
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 60){
            setPv(getPv()+2);
        }else setPv(getPv() +1);
    }

    /**
     * Método que sube la resistencia mágica del ladrón.
     * Tiene un 80% de probabilidad de subir 2 puntos (n >= 20).
     */
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 20){
            setRes(getRes() +2);
        }
    }

    /**
     * Método que sube la velocidad del ladrón (su estadística principal).
     * Tiene un 85% de probabilidad de subir 2 puntos (n >= 15) y un 15% de subir 1 punto.
     */
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 15){
            setVel(getVel()+2);
        } else setVel(getVel()+1);
    }

    /**
     * Método que permite al ladrón atacar con su estadística de velocidad
     * */
    public void robar(){
    }

    /**
     * Método toString que devuelve una representación en cadena de texto del ladrón.
     * Utiliza la implementación de la clase superior Personaje para el resumen de datos.
     * @return Un String con la información detallada del ladrón.
     */
    public String toString(){
        return super.toString();
    }

}
