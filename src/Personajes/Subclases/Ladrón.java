package Personajes.Subclases;

/**
 * Clase Ladrón, representa una especialización de Personaje enfocada en la agilidad,
 * la velocidad y el sigilo, con altas probabilidades de mejora en evasión y rapidez.
 * @author Arantxa González Pérez
 * @version v1.0
 */
import Equipamiento.Arma;
import Equipamiento.Armadura;
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

    public void equipaArma(Arma arma) {
        if (!getArma().getTipo().equals("espada") || !getArma().getTipo().equals("dagas")) {
            System.err.println("Error, el ladrón no puede llevar este tipo de armas");
        }
    }

    public void equipaArmadura(Armadura armadura){
        if(comporbarArmadura()) {
            for (Armadura a : getArmadura()) {
                if(a.getTipo().equals(armadura.getTipo()) && a.getMaterial().equals("tela") ||
                        a.getTipo().equals(armadura.getTipo()) && a.getMaterial().equals("cuero"))
                    return;
            }
            getArmadura().add(armadura);
        }
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
