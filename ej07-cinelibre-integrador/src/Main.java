public class Main {
    public static void main(String[] args) {
        TaquillaFisica taquilla = new TaquillaFisica();
        AppWeb app = new AppWeb();
        System.out.println("=== CineLibre: estreno, funcion 7:00 p.m., sala 1 ===");

        // Boleta 3D, silla VIP, combo nachos, sin descuento
        taquilla.vender(new Boleta.Builder()
                .pelicula("Amazonas Perdido").silla("F7")
                .en3D().vip().combo("nachos")
                .build());

        // Boleta 2D, silla normal, sin combo, CON descuento estudiante
        app.comprar(new Boleta.Builder()
                .pelicula("Amazonas Perdido").silla("F8")
                .estudiante()
                .build());

        // Alguien compra por la app la misma silla que ya vendio la taquilla
        app.comprar(new Boleta.Builder()
                .pelicula("Amazonas Perdido").silla("F7")
                .combo("crispetas")
                .build());

        // Caso c): una boleta sin silla no se puede construir
        try {
            app.comprar(new Boleta.Builder().pelicula("Amazonas Perdido").build());
        } catch (IllegalStateException e) {
            System.out.println("  BOLETA RECHAZADA al construirse: " + e.getMessage());
        }

        // Caso b) en sentido inverso: F8 vendida por la app, la taquilla la rechaza
        taquilla.vender(new Boleta.Builder()
                .pelicula("Amazonas Perdido").silla("F8")
                .build());

        System.out.println();
        System.out.println("ESPERADO -> la boleta F8 sale con tarifa estudiante y sin VIP,");
        System.out.println("            y la segunda venta de F7 debe ser RECHAZADA");
    }
}
