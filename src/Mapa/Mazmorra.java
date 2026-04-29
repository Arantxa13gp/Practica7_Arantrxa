package Mapa;

import Personajes.Subclases.Monstruo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Clase Mazmorra, representa un entorno de juego que contiene una colección de monstruos
 * y un nivel de dificultad determinado.
 * @author Arantxa González Pérez
 * @version v1.0
 */
public class Mazmorra {

    private String nombre; /** Atributo tipo String que define el nombre de la mazmorra */
    private ArrayList<Monstruo> monstruos; /** Lista de monstruos que habitan en la mazmorra */
    private int nivel; /** Atributo tipo int que define el nivel de dificultad de la mazmorra */

    /**
     * Constructor por defecto.
     * Inicializa una mazmorra con valores nulos o por defecto.
     */
    public Mazmorra(){
        nombre = "";
        monstruos = null;
        nivel = -1;
    }

    /**
     * Constructor por parámetros.
     * @param nombre El nombre identificativo de la mazmorra.
     * @param monstruos Lista de monstruos disponibles para poblar la mazmorra.
     * @param nivel Nivel de dificultad sugerido para la mazmorra.
     */
    public Mazmorra(String nombre, ArrayList<Monstruo> monstruos, int nivel){
        setNombre(nombre);
        setMonstruos(monstruos);
        setNivel(nivel);
    }

    /**
     * Constructor de copia.
     * @param copia Objeto de tipo Mazmorra del cual se clonarán los atributos.
     */
    public Mazmorra(Mazmorra copia){
        this.nombre = copia.nombre;
        this.monstruos = copia.monstruos;
        this.nivel = copia.nivel;
    }

    /**
     * Getter de nombre.
     * @return El nombre de la mazmorra.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de nombre.
     * @param nombre El nuevo nombre de la mazmorra.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la lista de monstruos.
     * @return El ArrayList de monstruos habitantes.
     */
    public ArrayList<Monstruo> getMonstruos() {
        return monstruos;
    }

    /**
     * Setter de la lista de monstruos.
     * @param monstruos El nuevo ArrayList de monstruos para la mazmorra.
     */
    public void setMonstruos(ArrayList<Monstruo> monstruos) {
        this.monstruos = monstruos;
    }

    /**
     * Getter de nivel.
     * @return El nivel de dificultad de la mazmorra.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Setter de nivel.
     * @param nivel El nuevo valor de nivel de dificultad.
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Genera un encuentro de combate aleatorio.
     * Selecciona entre 1 y 3 monstruos de la lista disponible y escala su nivel
     * en función del nivel de la mazmorra (rango +/- 3 niveles).
     * @return Un ArrayList con los monstruos generados para el combate.
     */
    public ArrayList<Monstruo> combateAleatorio(){
        ArrayList<Monstruo> resultado = new ArrayList<>();
        Random r = new Random();
        for(int io = 0; io < r.nextInt(1,4); io ++) {
            Monstruo unidad = new Monstruo(monstruos.get(r.nextInt(0, monstruos.size())));
            for (int i = 0; i < r.nextInt(nivel - 3, nivel + 3); i++) {
                unidad.subirNivel();
            }
            resultado.add(unidad);
        }
        return resultado;
    }

    /**
     * Método toString que devuelve una representación en cadena de la mazmorra.
     * Incluye el nombre y la descripción de todos los monstruos que contiene.
     * @return Un String con la información detallada de la mazmorra.
     */
    public String toString(){
        String mazmorra = "La mazmorra se llama " + nombre + " y tiene los siguientes monstruos: ";

        for (Monstruo m : monstruos){
            mazmorra += m.toString();
        }
        return mazmorra;
    }
}