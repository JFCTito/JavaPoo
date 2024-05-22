public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor("Blanco");
        subaru.setCilindrada(2.0);

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);

        Automovil nissan = new Automovil("Nissan", "Navarra", "Gris", 3.5, 50);


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometro por litro de gasolina " + subaru.calcularConsumo(300, 0.6f) + " km/lts");

        System.out.println("Kilometro por litro de gasolina " + subaru.calcularConsumo(300, 60) + " km/lts");
    }
}
