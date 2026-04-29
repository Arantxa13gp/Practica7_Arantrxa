package Personajes.Subclases;

/**
 * Clase Cazador, representa una especialización de Personaje que posee una mascota
 * y cuenta con una progresión de velocidad superior.
 *
 * @author Arantxa González Pérez
 * @version v1.0
 */

import Equipamiento.Arma;
import Equipamiento.Armadura;
import Equipamiento.Artefacto;
import Personajes.Personaje;

public class Cazador extends Personaje {

    private mascota mascota; /** Atributo tipo mascota que define la mascota del personaje */

    /**
     * Constructor por defecto.
     * Crea un cazador utilizando el constructor base de la clase superior.
     */
    public Cazador() {
        super();
    }

    /**
     * Método que incrementa el nivel del cazador y actualiza sus estadísticas actuales.
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
     * Método que sube el ataque del cazador.
     * Tiene un 50% de probabilidad de subir 1 punto (n >= 50).
     */
    public void subirAtq() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 50) {
            setAtq(getAtq() + 1);
        }
    }

    /**
     * Método que sube la armadura del cazador.
     * Tiene un 50% de probabilidad de subir 1 punto (n >= 50).
     */
    public void subirArm() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 50) {
            setArm(getArm() + 1);
        }
    }

    /**
     * Método que sube los puntos de vida del cazador.
     * Tiene un 50% de probabilidad de subir 1 punto (n >= 50).
     */
    public void subirPv() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 50) {
            setPv(getPv() + 1);
        }
    }

    /**
     * Método que sube la resistencia mágica del cazador.
     * Tiene un 50% de probabilidad de subir 1 punto (n >= 50).
     */
    public void subirRes() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 50) {
            setRes(getRes() + 1);
        }
    }

    /**
     * Método que sube la velocidad del cazador.
     * Tiene un 70% de probabilidad de subir 1 punto (n >= 30), siendo más eficaz que otras clases.
     */
    public void subirVel() {
        int n = (int) (Math.random() * 100) + 1;
        if (n >= 30) {
            setVel(getVel() + 1);
        }
    }

    /**
     * Clase anidada mascota que extiende de Personaje.
     * Define el comportamiento y crecimiento del compañero animal del cazador.
     */
    public class mascota extends Personaje {

        /**
         * Método que define el tipo de mascota y aplica una subida de estadísticas inmediata según su raza.
         * @param raza Tipo de animal (cánido, felino o rapaz).
         * @return La raza procesada de la mascota.
         */
        public String tipoMascota(String raza) {
            switch (raza.toLowerCase()) {
                case "cánido":
                    subirCánino();
                break;
                case "felino":
                    subirFelino();
                break;
                case "rapaz":
                    subirRapaz();
                break;
                default:
                    raza = "";
            }
            return raza;
        }
    }

    /**public void equipaArtefacto(Artefacto artefacto) {
        if (comprobarArtefacto()) {
            if(artefacto.getTipo().equals("Amuleto"))
                getArtefacto().add(artefacto);
        } else
            System.err.println("Error, el compañero ya tiene un artefacto");
    }

    public boolean comprobarArtefacto() {
        if (getArtefacto().size() > 1)
            return false;
        else
            return true;
    }*/

    public void subirCánino(){

            setNivel(getNivel() + 1);
            setAtq(getAtq());
            setPv(getPv());
            setArm(getArm());
            setVel(getVel());
            setRes(getRes());

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
                setPv(getPv() + 1);
            }
        }
        subirRes(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 50) {
                setRes(getRes() + 1);
            }
        }
        subirVel(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 30) {
                setVel(getVel() + 1);
            }
        }
    }

    public void subirFelino(){
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
            if (n >= 70) {
                setAtq(getAtq() + 1);
            }
        }
        subirArm(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 85) {
                setArm(getArm() + 1);
            }
        }
        subirPv(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 85) {
                setPv(getPv() + 1);
            }
        }
        subirRes(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 85) {
                setRes(getRes() + 1);
            }
        }
        subirVel(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 70) {
                setVel(getVel() + 1);
            }
        }
    }

    public void subirRapaz(){
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
            if (n >= 85) {
                setAtq(getAtq() + 1);
            }
        }
        subirArm(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 95) {
                setArm(getArm() + 1);
            }
        }
        subirPv(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 95) {
                setPv(getPv() + 1);
            }
        }
        subirRes(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 75) {
                setRes(getRes() + 1);
            }
        }
        subirVel(); {
            int n = (int) (Math.random() * 100) + 1;
            if (n >= 65) {
                setVel(getVel() + 1);
            }
        }
    }

    public void equipaArma(Arma arma) {
        if (!getArma().getTipo().equals("espada") || !getArma().getTipo().equals("hacha") || !getArma().getTipo().equals("dagas") ||
                !getArma().getTipo().equals("arco")) {
            System.err.println("Error, el cazador no puede llevar este tipo de armas");
        }
    }

    public void equipaArmadura(Armadura armadura){
        if(comporbarArmadura()) {
            for (Armadura a : getArmadura()) {
                if(a.getTipo().equals(armadura.getTipo()) && a.getMaterial().equals("cuero"))
                    return;
            }
            getArmadura().add(armadura);
        }
    }

    public String toString() {
        return super.toString() + " y tiene un compañero " + mascota;
    }

}
