package Personajes.Subclases;

/**
 * Clase Clérigo, representa una especialización de Creyente que enfoca su poder
 * en la fe, la sanación y la resistencia mágica.
 * @author Arantxa González Pérez
 * @version v1.0
 */
public class Clérigo extends Creyente{

    /**
     * Constructor por defecto.
     * Crea un clérigo utilizando el constructor base de la clase superior.
     */
    public Clérigo(){
        super();
    }

    /**
     * Constructor completo para la subclase Clérigo.
     * @param nombre Nombre del clérigo.
     * @param atq Puntos de ataque.
     * @param arm Puntos de armadura.
     * @param pv Puntos de vida.
     * @param nivel Nivel actual.
     * @param res Resistencia mágica.
     * @param vel Velocidad.
     * @param raza Raza del personaje.
     * @param fe Puntos de fe del clérigo.
     */
    public Clérigo(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza, int fe){
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
        this.setFe(fe);
    }

    /**
     * Método que incrementa el nivel del clérigo y actualiza sus estadísticas actuales.
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
     * Método que sube el ataque del clérigo.
     * Tiene un 10% de probabilidad de subir 1 punto (n >= 90).
     */
    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 90){
            setAtq(getAtq()+1);
        }
    }

    /**
     * Método que sube la armadura del clérigo.
     * Tiene un 20% de probabilidad de subir 1 punto (n >= 80).
     */
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 80){
            setArm(getArm() +1);
        }
    }

    /**
     * Método que sube los puntos de vida del clérigo.
     * Tiene un 20% de probabilidad de subir 1 punto (n >= 80).
     */
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 80){
            setPv((int)(getPv()+1));
        }
    }

    /**
     * Método que sube la resistencia mágica del clérigo.
     * Tiene un 80% de probabilidad de subir 2 puntos (n >= 20) y un 20% de subir 1 punto.
     */
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 20){
            setRes(getRes() +2);
        }else setRes(getRes() +1);
    }

    /**
     * Método que sube la velocidad del clérigo.
     * Tiene un 50% de probabilidad de subir 1 punto (n >= 50).
     */
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setVel(getVel()+1);
        }
    }

    /**
     * Método que sube la fe del clérigo.
     * Tiene un 80% de probabilidad de subir 2 puntos (n >= 20) y un 20% de subir 1 punto.
     */
    public void subirFe(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 20){
            setFe(getFe()+2);
        }else setFe(getFe()+1);
    }

    /**
     * Método que ejecuta un milagro mediante una plegaria, modificando las estadísticas del clérigo.
     * @param milagros El tipo de milagro a realizar (sanación, rezo sagrado o cólera divina).
     * @return El nombre del milagro realizado, o una cadena vacía si no es válido.
     */
    public String plegaria(String milagros){
        switch (milagros.toLowerCase()){
            case "sanación":
                setPv((int)(getPv()*0.7));
                break;
            case "rezo sagrado":
                setPv((int)(getPv()*0.35));
                break;
            case "cólera divina":
                setAtq((int)(getAtq()*0.55));
                break;
            default:
                milagros = "";
        }
        return milagros;
    }

    /**
     * Método toString que devuelve una representación en cadena de texto del clérigo.
     * Incluye la información base de la clase superior y el estado de su plegaria actual.
     * @return Un String con el resumen de los datos y la plegaria del clérigo.
     */
    public String toString(){
        return super.toString() + " está usando la plegaria" + plegaria("");
    }
}
