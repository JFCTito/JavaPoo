public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadGasolina = 40;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo){
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

    public String verDetalle(){
        return "auto.fabricante = " + this.fabricante + "\nauto.modelo = " + this.modelo + "\nauto.colo = " + this.color + "\naunto.cilindrada = " + this.cilindrada;
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
}
