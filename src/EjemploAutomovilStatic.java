public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Automovil.COLOR_BLANCO);
        subaru.setCilindrada(2.0);

        Automovil mazda = new Automovil("Mazda", "BT-50", Automovil.COLOR_ROJO, 3.0);

        Automovil nissan = new Automovil("Nissan", "Navarra", Automovil.COLOR_GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navarra", Automovil.COLOR_GRIS, 3.5, 50);

        Automovil.setColorPatente(Automovil.COLOR_AZUL);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

        System.out.println("VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA + " km/h");
        System.out.println("VELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD + " km/h");
    }
}