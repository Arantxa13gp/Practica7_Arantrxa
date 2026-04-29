package Mapa;

import Personajes.Subclases.Monstruo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Mazmorra {

    private String nombre;
    private ArrayList<Monstruo> monstruos;
    private int nivel;

    public Mazmorra(){
        nombre = "";
        monstruos = null;
        nivel = -1;
    }
    public Mazmorra(String nombre, ArrayList<Monstruo> monstruos, int nivel){
        setNombre(nombre);
        setMonstruos(monstruos);
        setNivel(nivel);
    }

    public Mazmorra(Mazmorra copia){
        this.nombre = copia.nombre;
        this.monstruos = copia.monstruos;
        this.nivel = copia.nivel;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Monstruo> getMonstruos() {
        return monstruos;
    }

    public void setMonstruos(ArrayList<Monstruo> monstruos) {
        this.monstruos = monstruos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

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

    public String toString(){
        String mazmorra = "La mazmorra se llama " + nombre + "y tiene los siguintes monstruos";

        for (Monstruo m : monstruos){
            mazmorra+= m.toString();
        }
        return mazmorra;
    }
}