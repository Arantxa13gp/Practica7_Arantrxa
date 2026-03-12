package Misc;

import Personajes.Personaje;

public class GameTest {

    public Personaje inicializaC1(String nombreC1, int nivelC1, int pvC1, int armC1, int atqC1){
        Personaje c1 = new Personaje();
        c1.setNombre(nombreC1);
        c1.subirAtq();
        c1.subirArm();
        c1.subirPv();
        c1.subirRes();
        c1.subirVel();
        c1.setPv(pvC1);
        c1.setArm(armC1);
        c1.setAtq(atqC1);
        return c1;
    }

    public Personaje iniscializaC2(String nombreC2, int nivelC2){
        Personaje c2 = new Personaje();
        c2.setNombre(nombreC2);
        c2.getNivel();
        c2.getPv();
        c2.getArm();
        c2.getAtq();
        return c2;
    }
}

