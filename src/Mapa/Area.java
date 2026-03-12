package Mapa;

import java.util.Random;

public class Area {
    private String nombre, bioma;
    private int nivel;

    private Area(){
        nombre = "???";
        bioma= "Pradera";
        nivel = 1;
    }

    public String getNombre(){
        return nombre;
    }
    public String getBioma(){
        return bioma;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNombre(String n){
        if (n.equals("")) {
            System.err.println("Error el nombre no puede estar vacio");
        }else nombre = n;
    }
    public void setBioma (String b){
        switch (b) {
            case "Pradera":
                System.out.println("Has elegido el bioma Pradera");
                break;
            case "Jungla":
                System.out.println("Has elegido el bioma Jungla");
                break;
            case "Desierto":
                System.out.println("Has elegido el bioma Desierto");
                break;
            case "Montaña":
                System.out.println("Has elegido el bioma Montaña");
                break;
            case "Mazmorra":
                System.out.println("Has elegido el bioma Mazmorra");
                break;
        }
        bioma = b;
    }
    public void asignarNivel() {
        Random r = new Random();
        switch (bioma) {
            case "Pradera":
                nivel = r.nextInt(1 ,10);
                break;
            case "Jungla":
                nivel = r.nextInt(11, 30);
                break;
            case "Desierto":
                nivel = r.nextInt(31, 60);
                break;
            case "Montaña":
                nivel = r.nextInt(61, 90);
                break;
            case "Mazmorra":
                nivel = r.nextInt(91, 105);
                break;
        }
    }
    public void generarPociones(){
        int pocion = 0;
        Random r = new Random();
        switch (bioma){
            case "Pradera":
                pocion = 15;
                break;
            case "Jungla":
                pocion = r.nextInt(15,25);
                break;
            case "Desierto":
                pocion = r.nextInt(1, 30);
                break;
            case "Montaña":
                pocion = 30;
                break;
            case "Mazmorra":
        }
    }
    public String toString() {
        return "El area " + nombre + "tiene un nivel " + nivel + "en el bioma " + bioma;
    }

    public Area clon(){
        Area clon = new Area(this);
        return clon;
    }

    public Area(String nombre, String bioma){
        Random r = new Random();
        this.nombre = nombre;
        this.bioma = bioma;
        asignarNivel();
    }

    public Area(Area copia){
        this.nombre = copia.nombre;
        this.nivel= copia.nivel;
        this.bioma = copia.bioma;
    }

}
