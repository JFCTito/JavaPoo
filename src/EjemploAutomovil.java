public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.color = "Blanco";
        subaru.cilindrada = 2.0;

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.color = "Rojo";
        mazda.cilindrada = 3.0;

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometro por litro de gasolina " + subaru.calcularConsumo(300, 0.6f) + " km/lts");

        System.out.println("Kilometro por litro de gasolina " + subaru.calcularConsumo(300, 60) + " km/lts");
    }
}
