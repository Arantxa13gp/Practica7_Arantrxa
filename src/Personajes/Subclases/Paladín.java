package Personajes.Subclases;

public class Paladín extends Creyente{

    public Paladín(){
        super();
    }

    public Paladín(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza, int fe){
        super(nombre, atq, arm, pv, nivel, res, vel, raza);
        this.setFe(fe);
    }

    public void subirNivel(){
        setNivel(getNivel()+1);
        setAtq(getAtq());
        setPv(getPv());
        setArm(getArm());
        setVel(getVel());
        setRes(getRes());
    }

    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setAtq(getAtq()+1);
        }
    }
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 30){
            setArm(getArm() +2);
        }else setArm(getArm() +1);
    }
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        setPv(getPv()+1);
        if (n >= 50){
            setPv((int)(getPv()*1.05));
        }
    }
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            setRes(getRes() +1);
        }
    }
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 85){
            setVel(getVel()+1);
        }
    }

    public void subirFe(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 70){
            setVel(getFe()+1);
        }
    }

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
    
    public String toString(){
        return super.toString() + " está usando el milagro" + plegaria("");
    }

}
