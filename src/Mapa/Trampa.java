package Mapa;

public class Trampa {
    private String trampa;
    private int perjuicio;
    private double fracaso;

    public Trampa(){
        trampa = "";
        perjuicio = 0;
        fracaso = 0;
    }

    public String getTrampa(){
        return trampa;
    }

    public int getPerjuicio() {
        return perjuicio;
    }

    public double getFracaso() {
        return fracaso;
    }

    public void setTrampa(String tipoTrampa){
        switch (tipoTrampa){
            case "Pinchos", "Brea", "Serpientes":
                tipoTrampa = trampa;
                break;
            default:
                System.err.println("Selecciona un trampa dentro de las opciones");
        }
    }
    public void setPerjuicio(int valorPerjuicio){

        perjuicio = (int)(Math.random()*20) + 5;
    }
    public void setFracaso(double porcentajeFracaso){
        fracaso = (double) (Math.random()*75);
    }
    public int activaTrampa() {
        double activaTrampa = (double) (Math.random() * 75);
        if (activaTrampa<fracaso){
            return perjuicio;
        }else return 0;
    }

    public String toString(){
        return "La trampa es de tipo " + trampa + "con un valor " + perjuicio + "de perjuicio" + "con un " + fracaso +"%" + "de fracaso";
    }

    public boolean equals(Trampa otro) {
        if (!this.trampa.equals(otro.trampa)){
            return false;
        }
        if (this.perjuicio != otro.perjuicio){
            return false;
        }
        if (this.fracaso != otro.fracaso){
            return false;
        }
        else return true;
    }
    public  Trampa(String trampa){
        this.trampa = trampa;
        getFracaso();
        getPerjuicio();
    }

    public Trampa(String trampa, int perjuicio){
        this.trampa = trampa;
        this.perjuicio = perjuicio;
        getFracaso();
    }

    public Trampa(Trampa copia){
        this.trampa = copia.trampa;
        this.perjuicio = copia.perjuicio;
        this.fracaso = copia.fracaso;
    }


}
