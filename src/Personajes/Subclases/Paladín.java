package Personajes.Subclases;

/**
 * Clase Paladín, subclase de Creyente que representa a un guerrero sagrado.
 * Posee métodos especializados para la progresión de estadísticas y el uso de milagros.
 * @author Arantxa González Pérez
 * @version v1.0
 */

import Equipamiento.Arma;
import Equipamiento.Armadura;

public class Paladín extends Creyente{


    /**
     * Constructor por defecto.
     * Crea un paladín utilizando el constructor de la superclase.
     */
    public Paladín(){
        super();
    }

    /**
     * Constructor por parámetros.
     * @param nombre Nombre del paladín.
     * @param atq Puntos de ataque iniciales.
     * @param arm Puntos de armadura iniciales.
     * @param pv Puntos de vida iniciales.
     * @param nivel Nivel inicial.
     * @param res Resistencia mágica inicial.
     * @param vel Velocidad inicial.
     * @param raza Raza a la que pertenece el paladín.
     * @param fe Puntos de fe iniciales.
     */
    public Paladín(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza, int fe){
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
        this.setFe(fe);
    }


    /**
     * Sube el nivel del paladín e incrementa sus estadísticas base.
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
     * Mejora el ataque con un 50% de probabilidad.
     */
    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setAtq(getAtq()+1);
        }
    }

    /**
     * Mejora la armadura del paladín.
     * Tiene un 70% de probabilidad de subir 2 puntos y un 30% de subir 1 punto.
     */
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 30){
            setArm(getArm() +2);
        }else setArm(getArm() +1);
    }

    /**
     * Mejora los puntos de vida.
     * Sube siempre 1 punto y tiene un 50% de probabilidad de aumentar un 5% adicional.
     */
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        setPv(getPv()+1);
        if (n >= 50){
            setPv((int)(getPv()*1.05));
        }
    }

    /**
     * Mejora la resistencia mágica con un 50% de probabilidad.
     */
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setRes(getRes() +1);
        }
    }

    /**
     * Mejora la velocidad con un 15% de probabilidad.
     */
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 85){
            setVel(getVel()+1);
        }
    }

    /**
     * Mejora la fe del paladín con un 30% de probabilidad.
     */
    public void subirFe(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 70){
            setVel(getFe()+1);
        }
    }

    /**
     * Realiza una plegaria que activa un milagro, alterando las estadísticas del paladín.
     * @param milagros Nombre del milagro a ejecutar (imbuir arma, baluarte de fe, fogonazo sagrado).
     * @return El nombre del milagro ejecutado o una cadena vacía si no es válido.
     */
    public String plegaria(String milagros){
        switch (milagros.toLowerCase()){
            case "imbuir arma":
                setAtq((int) (getAtq()*0.8));
                break;
            case "baluarte de fe":
                setArm((int) (getArm()*0.3));
                break;
            case "fogonazo sagrado":
                setVel((int) (getVel()/0.4));
                setRes((int) (getRes()/0.4));
                break;
            default:
                milagros = "";
        }
        return milagros;
    }

    /**
     * Intenta equipar un arma al paladín.
     * Restringe el uso de arcos y bastones.
     * @param arma El arma que se intenta equipar.
     */
    public void equipaArma(Arma arma) {
        if (getArma().getTipo().equals("arco") || getArma().getTipo().equals("baston")) {
            System.err.println("Error, el paladín no puede llevar este tipo de armas");
        }
    }

    /**
     * Intenta equipar una pieza de armadura.
     * Solo permite equipar piezas de material metálico y que no estén repetidas por tipo.
     * @param armadura La pieza de armadura a equipar.
     */
    public void equipaArmadura(Armadura armadura){
        if(comporbarArmadura()) {
            for (Armadura a : getArmadura()) {
                if(a.getTipo().equals(armadura.getTipo()) && a.getMaterial().equals("metal"))
                    return;
            }
            getArmadura().add(armadura);
        }
    }

    /**
     * Devuelve una representación en cadena del paladín, incluyendo su estado de milagro actual.
     * @return Un String con la información del paladín.
     */
    public String toString(){
        return super.toString() + " está usando el milagro" + plegaria("");
    }

}
