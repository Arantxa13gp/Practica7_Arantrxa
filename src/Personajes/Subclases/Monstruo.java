package Personajes.Subclases;

/**
 * Clase Monstruo, representa una especialización de Personaje que define enemigos
 * con diferentes tipos de crecimiento según su raza (Bestia, No-muerto o Gigante).
 *
 * @author Arantxa González Pérez
 * @version v1.0
 */

import Personajes.Personaje;

public class Monstruo extends Personaje {

    /**
     * Constructor por defecto.
     * Crea un monstruo utilizando el constructor base de la clase superior.
     */
    public Monstruo() {
        super();
    }

    /**
     * Constructor completo para la clase Monstruo.
     * @param nombre Nombre del monstruo.
     * @param atq Puntos de ataque.
     * @param arm Puntos de armadura.
     * @param pv Puntos de vida.
     * @param nivel Nivel actual.
     * @param res Resistencia mágica.
     * @param vel Velocidad.
     * @param raza Raza del monstruo.
     */
    public Monstruo(String nombre, int atq, int arm, int pv, int nivel, int res, int vel, String raza) {
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
    }
    
    /**
     * Método que define la especialización del monstruo según su raza y aplica una mejora
     * inmediata de estadísticas mediante bloques de probabilidad específicos.
     * @param raza El tipo de monstruo ("bestia", "no-muerto" o "gigante").
     * @return La raza procesada del monstruo en formato String.
     */
    public String tipoMostruo(String raza) {
        switch (raza.toLowerCase()) {
            case "bestia":
                subirBestia();
            break;
            case "no-muerto":
                subirNoMuerto();
            break;
            case "gigante":
                subirGigante();
            break;
            default:
                raza = "";
        }
        return raza;
    }

    public void subirBestia(){
        subirNivel();{
            setNivel(getNivel() + 1);
            setAtq(getAtq());
            setPv(getPv());
            setArm(getArm());
            setVel(getVel());
            setRes(getRes());
        }

        subirAtq(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 20) {
                setAtq(getAtq() + 2);
            } else setAtq(getAtq() + 1);
        }
        subirArm(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 50) {
                setArm(getArm() + 1);
            }
        }
        subirPv(); {
            int n = (int) (Math.random() * 100) + 1;
            setPv(getPv() + 1);
            if (n >= 50) {
                setPv(getPv() + 1);
            }
        }
        subirRes();{
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 85) {
                setRes(getRes() + 2);
            } else setRes(getRes() + 1);
        }
        subirVel();{
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 20) {
                setVel(getVel() + 2);
            } else setVel(getVel() + 1);
        }
    }

    public void subirNoMuerto(){
        subirNivel(); {
            setNivel(getNivel() + 1);
            setAtq(getAtq());
            setPv(getPv());
            setArm(getArm());
            setVel(getVel());
            setRes(getRes());
        }
        subirAtq(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 50) {
                setAtq(getAtq() + 1);
            }
        }
        subirArm(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 70) {
                setArm(getArm() + 1);
            }
        }
        subirPv(); {
            int n = (int) (Math.random() * 100) + 1;
            setPv(getPv() + 1);
            if (n >= 70) {
                setPv(getPv() + 1);
            }
        }
        subirRes(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 30) {
                setRes(getRes() + 4);
            } else setRes(getRes() + 1);
        }
        subirVel(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 95) {
                setVel(getVel() + 1);
            }
        }
    }
    public void subirGigante(){
        subirNivel(); {
            setNivel(getNivel() + 1);
            setAtq(getAtq());
            setPv(getPv());
            setArm(getArm());
            setVel(getVel());
            setRes(getRes());
        }
        subirAtq(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 50) {
                setAtq(getAtq() + 1);
            }
        }
        subirArm(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 50) {
                setArm(getArm() + 1);
            }
        }
        subirPv(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 50) {
                setPv((int) (getPv() + 2));
            } else setPv((int) (getPv() + 3));
        }
        subirRes(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 90) {
                setRes(getRes() + 1);
            }
        }
        subirVel(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 90) {
                setVel(getVel() + 1);
            }
        }
    }
    public String toString() {
        return "El enemigo es un " + tipoMostruo("");
    }
}
