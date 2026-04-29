package Personajes.Subclases;

/**
 * Clase Guerrero, representa una especialización de Personaje enfocada en el combate físico,
 * con altas probabilidades de mejora en ataque, armadura y puntos de vida.
 * @author Arantxa González Pérez
 * @version v1.0
 */
import Equipamiento.Arma;
import Equipamiento.Armadura;
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
     * Intenta equipar un arma al guerrero validando el tipo y la empuñadura.
     * Restringe el uso de cetros, arcos y bastones. Además, gestiona la lógica
     * para armas de una o dos manos.
     * @param arma El objeto de tipo Arma que se intenta equipar.
     */
    public void equipaArma(Arma arma) {
        if(getArma().getTipo().equals("cetro") || getArma().getTipo().equals("arco")
                || getArma().getTipo().equals("baston")){
            System.err.println("Error, el guerrero no puede llevar este tipo de armas");
        }
        if(getArma().getEmpuñadura().equals("una mano")) {
            if (getArma() == null) {
                setArma(arma);
            }

            if (getArma().getEmpuñadura().equals("dos manos")) {
                if (getArma() == null) {
                    setArma(arma);
                }
            }
        }
    }

    /**
     * Intenta equipar una pieza de armadura al guerrero.
     * Solo permite equipar piezas de material metálico ("metal") y verifica que
     * no se repita el tipo de pieza (casco, peto, etc.) en el equipo actual.
     * @param armadura El objeto de tipo Armadura que se desea añadir.
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
     * Método toString que devuelve una representación en cadena de texto del guerrero.
     * Utiliza la implementación de la clase superior Personaje para el resumen de datos.
     * @return Un String con la información del guerrero.
     */

    public String toString(){
        return super.toString();
    }
}