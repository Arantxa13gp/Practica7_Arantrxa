package Combate;

import Equipamiento.Equipamiento;
import Personajes.Personaje;
import Equipamiento.Armadura;
import Equipamiento.Arma;
import Equipamiento.Artefacto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;

public class Combate {

    private static ArrayList<Equipamiento> tesoros;

    public static void combatir(Personaje c1, Personaje c2) {
        int daño;

        while (!c1.estaMuerto() && !c2.estaMuerto()) {

            if (c1.getVel() > c2.getVel()) {

                daño = c1.getAtq() - c2.getArm();
                c2.setPv(c2.getPv() - daño);

                if ((c1.getVel() > c2.getVel() * 2) || !c2.estaMuerto()) {

                    daño = c1.getAtq() - c2.getArm();
                    c2.setPv(c2.getPv() - daño);

                    daño = c2.getAtq() - c2.getArm();
                    c1.setPv(c1.getPv() - daño);
                }
            } else if (c2.getVel() > c1.getVel()) {

                daño = c2.getAtq() - c1.getArm();
                c1.setPv(c1.getPv() - daño);

                if ((c2.getVel() > c1.getVel() * 2) || !c1.estaMuerto()) {

                    daño = c2.getAtq() - c1.getArm();
                    c1.setPv(c1.getPv() - daño);

                    daño = c1.getAtq() - c1.getArm();
                    c2.setPv(c2.getPv() - daño);

                }
            }
        }
    }

    public String realizarTurno(String turno) {
        switch (turno.toLowerCase()) {
            case "atacar":
                break;
            case "acción especial":
                break;
            case "defender":
                break;
            case "pasa turno":
                break;
            default:
                return turno = "";
        }
        return turno;
    }


    //FileReader para los 3 ficheros
    //Volcar de cada fichero los tesoros
    //Crear AL de cada tipo de Equipamiento
    //Generar un Equipamiento de cada linea del fichero y añadirlo al AL respectivo
    //Volcar cada AL al de tesoros

    public static ArrayList<Equipamiento> tesoros() throws IOException {
        ArrayList<Equipamiento> tesoros = new ArrayList<>();
        tesoros.addAll(cargarArmadura());
        tesoros.addAll(cargarArma());
        tesoros.addAll(cargarArtefacto());
        return tesoros;
    }

    public static ArrayList<Armadura> cargarArmadura() throws IOException {
        String nombre, rareza, pieza, tipo;
        int valor;
        HashMap<String, Integer> estadisticas = new HashMap<>();
        ArrayList<Armadura> armaduraCombate = new ArrayList<>();
        File fichero = new File("Ficheros/armadura.csv");

        if (!fichero.canRead()){
            System.err.println("Error, fichero no se puede leer");
        } else {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea;
            String [] campos;
            String [] estadistica;
            br.readLine();

            while ((linea = br.readLine()) != null){
                campos = linea.split(",");
                nombre = campos[0];
                rareza = campos [1];
                pieza = campos[2];
                tipo = campos[3];
                estadistica = campos[4].split("-");
                estadisticas.put("Ar", Integer.parseInt(estadistica[0]));
                estadisticas.put("RM", Integer.parseInt(estadistica[1]));
                estadisticas.put("V", Integer.parseInt(estadistica[2]));
                valor = Integer.parseInt(campos[5]);
                Armadura a = new Armadura(nombre, estadisticas, rareza, valor, tipo, pieza);
                armaduraCombate.add(a);
            }
            br.close();
        }
        return armaduraCombate;
    }

    public static ArrayList<Arma> cargarArma() throws IOException{
        String nombre, rareza, pieza, tipo;
        int valor;
        HashMap<String, Integer> estadisticas = new HashMap<>();
        ArrayList<Arma> armaCombate = new ArrayList<>();
        File fichero = new File("Ficheros/arma.csv");

        if (!fichero.canRead()){
            System.err.println("Error, fichero no se puede leer");
        } else {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea;
            String [] campos;
            String [] estadistica;
            br.readLine();

            while ((linea = br.readLine()) != null){
                campos = linea.split(",");
                nombre = campos[0];
                rareza = campos [1];
                tipo = campos[2];
                estadistica = campos[3].split("-");
                estadisticas.put("Fu", Integer.parseInt(estadistica[0]));
                estadisticas.put("Ve", Integer.parseInt(estadistica[1]));
                estadisticas.put("Ma", Integer.parseInt(estadistica[2]));
                estadisticas.put("Fe", Integer.parseInt(estadistica[2]));
                valor = Integer.parseInt(campos[4]);
                String empuñadura = tipo;
                switch (tipo){
                    case "una mano":
                        break;
                    case "dos manos":
                        break;
                    default:
                        return null;
                }
                Arma a = new Arma(nombre,estadisticas,rareza,valor,empuñadura,tipo);
                armaCombate.add(a);
            }
            br.close();
        }
        return armaCombate;
    }

    public static ArrayList<Artefacto> cargarArtefacto() throws IOException{
        String nombre, rareza, pieza, tipo;
        int valor;
        HashMap<String, Integer> estadisticas = new HashMap<>();
        ArrayList<Artefacto> artefactoCombate = new ArrayList<>();
        File fichero = new File("Ficheros/artefacto.csv");

        if (!fichero.canRead()){
            System.err.println("Error, fichero no se puede leer");
        } else {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea;
            String [] campos;
            String [] estadistica;
            br.readLine();

            while ((linea = br.readLine()) != null){
                campos = linea.split(",");
                nombre = campos[0];
                rareza = campos [1];
                tipo = campos[2];
                estadistica = campos[3].split("-");
                estadisticas.put("Fu", Integer.parseInt(estadistica[0]));
                estadisticas.put("Ve", Integer.parseInt(estadistica[1]));
                estadisticas.put("Ma", Integer.parseInt(estadistica[2]));
                estadisticas.put("Fe", Integer.parseInt(estadistica[2]));
                valor = Integer.parseInt(campos[4]);
            }
            br.close();
        }
        return artefactoCombate;
    }

    public static void combateGrupos(ArrayList<Personaje> grupo1, ArrayList<Personaje> grupo2) throws IOException {
        Random r = new Random();
        grupo1.sort(Comparator.comparingInt(Personaje::getNivel).reversed());
        grupo2.sort(Comparator.comparingInt(Personaje::getNivel).reversed());
        int premios = grupo2.size();
        while (!grupo1.isEmpty() && !grupo2.isEmpty()){

            Personaje p1 = grupo1.getFirst();
            Personaje p2 = grupo2.getFirst();
            combatir(p1,p2);

            if (!p1.estaMuerto()){
                System.out.printf(p1.getNombre()+ " ha muerto, el ganador es: " + p2.getNombre());
                grupo1.removeFirst();
                tesoros().get(r.nextInt(tesoros().size()));

            }

            if (!p2.estaMuerto()){
                System.out.printf(p2.getNombre()+ " ha muerto, el ganador es: " + p1.getNombre());
                grupo2.removeFirst();
            }
        }
    }

}
