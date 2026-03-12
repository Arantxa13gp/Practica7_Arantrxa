package Personajes;

/**
 * Clase Personaje, representa a un personaje con un nombre, una raza y estadísticas de ataque, armadura, vida, resistencia mágica, velocidad
 * @author Arantxa González Pérez
 * @version v1.0
 */

public class Personaje {

    private String nombre; /** Atributo tipo String que define el nombre del personaje */
    private int pv, atq, arm, nivel; /** Atributo tipo int que define los puntos de vida, el ataque, la armadura y el nivel del personaje */
    private int res; /** Atributo tipo int que define la resistencia mágica del personaje */
    private int vel; /** Atributo tipo int que define la velocidad del personaje */
    private String raza; /** Atributo tipo String que define la raza del personaje */

    /**
     * Constructor por defecto.
     * Inicializa un personaje con el nommbre y la raza nulo, con estadísticas base de 10 y 100 PV.
     */
    public Personaje(){
        nombre = raza = "";
        pv = 100;
        atq = 10;
        arm = 10;
        vel = 10;
        res = 10;
        nivel = 0;
    }

    /**
     * Constructor con nombre.
     * @param nombre El nombre que se le asignará al personaje.
     */
    public Personaje(String nombre){
        this.nombre = nombre;
        nivel = 1;
        atq = arm = vel = res = 10;
        pv = 100;
    }

    /**
     * Constructor por parámetros de nombre y nivel.
     * Sube las estadísticas de ataque, armadura y vida según el nivel indicado.
     * @param nombre El nombre del personaje.
     * @param nivel El nivel que alcanzará el personaje tras su creación.
     */
    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        nivel = 1;
        atq = arm = vel = res = 10;
        pv = 100;
        for (int i = 0; i <nivel; i++){
            subirAtq();
            subirArm();
            subirPv();
        }
    }

    /**
     * Constructor por parámetros
     * @param nombre Nombre del personaje.
     * @param atq Puntos de ataque iniciales.
     * @param arm Puntos de armadura iniciales.
     * @param pv Puntos de vida iniciales.
     * @param nivel Nivel inicial.
     * @param res Resistencia mágica inicial.
     * @param vel Velocidad inicial.
     * @param raza Raza a la que pertenece el personaje.
     */
    public Personaje(String nombre, int atq, int arm, int pv,int nivel, int res, int vel, String raza){
        setNombre(nombre);
        setPv(pv);
        setAtq(atq);
        setArm(arm);
        setRes(res);
        setVel(vel);
        setNivel(nivel);
        setRaza(raza);
    }

    /**
     * Constructor de copia.
     * @param copia Objeto de tipo Personaje del cual se copiarán todos los atributos.
     */
    public Personaje(Personaje copia){
        this.nombre = copia.nombre;
        this.nivel = copia.nivel;
        this.atq = copia.atq;
        this.arm = copia.arm;
        this.pv = copia.pv;
        this.res = copia.res;
        this.vel = copia.vel;
        this.raza = copia.raza;
    }

    /**
     * Getter de nombre.
     * @return El nombre del personaje.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Getter de pv.
     * @return Los puntos de vida actuales.
     */
    public int getPv(){
        return pv;
    }

    /**
     * Getter de atq.
     * @return Los puntos de ataque actuales.
     */
    public int getAtq(){
        return atq;
    }

    /**
     * Getter de arm.
     * @return Los puntos de armadura actuales.
     */
    public int getArm(){
        return arm;
    }

    /**
     * Getter de nivel.
     * @return El nivel actual del personaje.
     */
    public int getNivel(){
        return nivel;
    }

    /**
     * Getter de res.
     * @return Los puntos de resistencia mágica actuales.
     */
    public int getRes() {
        return res;
    }

    /**
     * Getter de vel.
     * @return Los puntos de velocidad actuales.
     */
    public int getVel() {
        return vel;
    }

    /**
     * Getter de raza.
     * @return La raza del personaje.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Setter de nombre que tiene que recibir por parametros una cadena no vacía.
     * @param n Nuevo nombre del personaje.
     */
    public void setNombre(String n){
        if (n.equals("")){
            System.err.println("Error, el nombre no puede estar vacio");
        }else nombre = n;
    }

    /**
     * Setter de pv que tiene que recibir por parámetros con el tipo de dato incluido int.
     * Si la vida recibida es menor a cero, el valor se ajusta automáticamente a cero.
     * @param vida La nueva cantidad de puntos de vida.
     */
    public void setPv(int vida){
        if (vida<0){
            pv=0;
        }else pv = vida;
    }

    /**
     * Setter de atq que tiene que recibir por parámetros con el tipo de dato incluido int.
     * El valor de ataque no puede ser menor a cero; de lo contrario, muestra un mensaje de error.
     * @param ataque El nuevo valor de ataque.
     */
    public void setAtq(int ataque){
        if (ataque<0){
            System.err.println("Error, el valor de atq no puede ser menor a 0");
        }else atq = ataque;
    }

    /**
     * Setter de arm que tiene que recibir por parámetros con el tipo de dato incluido int.
     * El valor de armadura no puede ser menor a cero; de lo contrario, muestra un mensaje de error.
     * @param armadura El nuevo valor de armadura.
     */
    public void setArm(int armadura) {
        if (armadura < 0) {
            System.err.println("Error, el valor de arm no puede ser menor a 0");
        } else arm = armadura;
    }

    /**
     * Setter de raza que tiene que recibir por parámetros con el tipo de dato incluido String.
     * @param raza La nueva raza del personaje.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Setter de res que tiene que recibir por parámetros con el tipo de dato incluido int.
     * @param res El nuevo valor de resistencia mágica.
     */
    public void setRes(int res) {
        this.res = res;
    }

    /**
     * Setter de vel que tiene que recibir por parámetros con el tipo de dato incluido int.
     * @param vel El nuevo valor de velocidad.
     */
    public void setVel(int vel) {
        this.vel = vel;
    }

    /**
     * Setter de nivel que tiene que recibir por parámetros con el tipo de dato incluido int.
     * @param nivel El nuevo nivel del personaje.
     */
    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    /**
     * Simula el consumo de una poción si la vida es baja (menor o igual a 30).
     * @param vida Valor de vida actual del personaje.
     */
    public void beberPocion(int vida){
        if (vida<=30){
            System.out.println("Tomando poción");
        }
    }

    /**
     * Incrementa un stat (ataque o armadura) según la elección.
     * @param cantidad Valor a incrementar.
     * @param tipo Tipo de atributo a modificar.
     */
    public void inspirar(int cantidad, String tipo){
        System.out.println("Escribe que valor quieres aumentar: ataque o armadura");
        switch (tipo.toLowerCase()){
            case "ataque":
                System.out.println("Aumentando el ataque");
                atq+=cantidad;
                break;
            case "armadura":
                System.out.println("Aumentando la armadura");
                arm+=cantidad;
                break;
            default:
                System.err.println("Elige una opción válida");
        }
    }

    /** Sube el nivel y aplica mejoras aleatorias. */
    public void subirNivel(){
        nivel++;
        setAtq(atq);
        setArm(arm);
        setPv(pv);
        setRes(res);
        setVel(vel);
    }

    /** Mejora el ataque con 50% de probabilidad. */
    public void subirAtq(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            atq++;
        }
    }

    /** Mejora la armadura con 50% de probabilidad. */
    public void subirArm(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            arm++;
        }
    }

    /** Mejora la vida con 50% de probabilidad. */
    public void subirPv(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            pv++;
        }
    }

    /** Mejora la resistencia con 50% de probabilidad. */
    public void subirRes(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            res++;
        }
    }

    /** Mejora la velocidad con 50% de probabilidad. */
    public void subirVel(){
        int n = (int)(Math.random() * 100) +1;
        if (n >= 50){
            vel++;
        }
    }

    /**
     * Verifica el estado vital del personaje.
     * @return true si la vida es menor o igual a cero.
     */
    public boolean estaMuerto(){
        boolean muerto;
        if (pv<=0){
            muerto = true;
        }else muerto = false;
        return muerto;
    }

    /**
     * Método toString que devuelve una representación en cadena de texto del personaje.
     * Muestra el nombre, raza, nivel y todas las estadísticas actuales del personaje.
     * @return Un String con el resumen de los datos del personaje.
     */
    public String toString(){
        return "El personaje" + nombre + "tiene unas estadśiticas de " + pv + " puntos de vida" + atq + " puntos de ataque" + arm + " puntos de armadura " +vel+ "puntos de velocidad " + res + " puntos de resistencia mágica" + "se encuentra el nivel " + nivel;
    }

    /**
     * Método que crea un clon exacto del personaje.
     * @return Una nueva instancia de Personaje idéntica a la actual.
     */
    public Personaje clone (){
        Personaje clon = new Personaje(this);
        return clon;
    }

    /**
     * Compara igualdad lógica entre dos personajes.
     * @param otro El personaje a comparar.
     * @return true si coinciden en sus atributos básicos.
     */
    public boolean equals(Personaje otro) {
        if (!this.nombre.equals(otro.nombre)){
            return false;
        }
        if (this.pv != otro.pv){
            return false;
        }
        if (this.atq != otro.atq) {
            return false;
        }
        if (this.arm != otro.arm) {
            return false;
        }
        if (this.nivel != otro.nivel) {
            return false;
        }
        else return true;
    }

    public void defender(int daño, String tipoDaño){

    }



}