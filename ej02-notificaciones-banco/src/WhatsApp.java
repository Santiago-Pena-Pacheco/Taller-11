public class WhatsApp extends Canal {
    public WhatsApp(String usuario, String mensaje) {
        super(usuario, mensaje);
    }
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [WHATSAPP a " + usuario + "] " + mensaje);
    }
}
