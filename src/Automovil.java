public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;
    int capacidadGasolina = 40;

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
}
