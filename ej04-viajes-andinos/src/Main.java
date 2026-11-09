public class Main {
    public static void main(String[] args) {
        System.out.println("=== Viajes Andinos: paquetes vendidos ===");

        PaqueteViaje p1 = new PaqueteViaje.Builder()
                .destino("Cartagena").noches(4)
                .conVuelo().hotel("Decameron").conDesayuno()
                .tour("Islas del Rosario")
                .build();

        // Solo hotel + seguro: ahora se lee claramente que incluye
        PaqueteViaje p2 = new PaqueteViaje.Builder()
                .destino("Villa de Leyva").noches(2)
                .hotel("Posada del Sol").conSeguro()
                .build();

        System.out.println(p1);
        System.out.println(p2);

        // El asesor olvido el destino
        try {
            PaqueteViaje p3 = new PaqueteViaje.Builder()
                    .noches(3).tour("Cafe en Salento")
                    .build();
            System.out.println(p3);
        } catch (IllegalStateException e) {
            System.out.println("PAQUETE 3 RECHAZADO: " + e.getMessage());
        }

        // Otro asesor digito 0 noches
        try {
            PaqueteViaje p4 = new PaqueteViaje.Builder()
                    .destino("San Andres").noches(0)
                    .build();
            System.out.println(p4);
        } catch (IllegalStateException e) {
            System.out.println("PAQUETE 4 RECHAZADO: " + e.getMessage());
        }

        System.out.println();
        System.out.println("ESPERADO -> p1 y p2 se construyen leyendo claramente que incluyen,");
        System.out.println("            p3 y p4 se RECHAZAN al construirse (sin destino / 0 noches)");
    }
}
