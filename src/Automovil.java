public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadGasolina = 40;

    private static String colorPatente = Automovil.COLOR_AMARILLO;

    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadGasolina) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadGasolina = capacidadGasolina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public void setCapacidadGasolina(int capacidadGasolina) {
        this.capacidadGasolina = capacidadGasolina;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getColor(){
        return this.color;
    }

    public double getCilindrada(){
        return this.cilindrada;
    }

    public int getCapacidadGasolina(){
        return this.capacidadGasolina;
    }

    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public String verDetalle(){
        return "auto.id = " + this.id + "\nauto.fabricante = " + this.fabricante + "\nauto.modelo = " + this.modelo + "\nauto.colo = " + this.color + "\nauto.patenteColor = " + Automovil.colorPatente + "\naunto.cilindrada = " + this.cilindrada;
    }

    public String acelerar (int rpm){
        return "el auto " + this.modelo + " acelerando a " + rpm + " RPM";
    }

    public String frenar (){
        return "el auto " + this.modelo + " frenando";
    }

    public String acelerarFrenar(int rpm){
        return this.acelerar(rpm) + " " + this.frenar();
    }

    public float calcularConsumo(int km, float procentajeGasolina){
        return km/(capacidadGasolina*procentajeGasolina);
    }

    public float calcularConsumo(int km, int procentajeGasolina){
        return km/(capacidadGasolina*(procentajeGasolina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil)obj;
        return (this.fabricante !=null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" + "Id= " + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadGasolina=" + capacidadGasolina +
                '}';
    }
}
