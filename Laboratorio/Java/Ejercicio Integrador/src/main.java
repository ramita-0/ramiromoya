public class main {
    public static void main(String[] args){
        TarjetaEquis sube0 = new TarjetaEquis(1, -20);
        TarjetaEquis sube1 = new TarjetaEquis(2, -20);
        TarjetaEquis sube2 = new TarjetaEquis(3, -20);

        Pasajero pasajero0 = new Pasajero("Ramiro", "Moya", sube0);
        Pasajero pasajero1 = new Pasajero("Guadalupe", "Rincon", sube1);
        Pasajero pasajero2 = new Pasajero("Sol", "Goiburu", sube2);
        Sistema linea11 = new Sistema(11);
        Viaje viaje = new Viaje("25-7", "12:05", 50);
        Viaje viaje2 = new Viaje("25-7", "12:05", 20);

        System.out.println(pasajero0.getSaldoTarjeta());
        System.out.println(pasajero1.getSaldoTarjeta());
        System.out.println(pasajero2.getSaldoTarjeta());

        System.out.println("pasajeros presentes: " + linea11.getPasajerosPresentes());

        linea11.subePasajero(pasajero0, viaje, linea11);
        linea11.subePasajero(pasajero1, viaje, linea11);
        linea11.subePasajero(pasajero2, viaje, linea11);

        System.out.println("pasajeros presentes: " + linea11.getPasajerosPresentes());

        pasajero0.cargarTarjeta(0);
        System.out.println(pasajero0.getSaldoTarjeta());
        pasajero1.cargarTarjeta(200);
        System.out.println(pasajero1.getSaldoTarjeta());
        pasajero2.cargarTarjeta(400);
        System.out.println(pasajero2.getSaldoTarjeta());

        System.out.println("---------------------------");
        linea11.subePasajero(pasajero0, viaje, linea11);
        linea11.subePasajero(pasajero1, viaje, linea11);
        linea11.subePasajero(pasajero2, viaje, linea11);
        System.out.println("pasajeros presentes: " + linea11.getPasajerosPresentes());
        linea11.bajaPasajero(pasajero1);
        System.out.println("pasajeros presentes: " + linea11.getPasajerosPresentes());
        linea11.subePasajero(pasajero2, viaje2, linea11);
        linea11.printHistorial();
        System.out.println(pasajero2.ultimoMontoAbonadoPorPasajero());
    }
}
