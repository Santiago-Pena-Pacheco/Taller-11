public class Sms extends Canal {
    public Sms(String usuario, String mensaje) {
        super(usuario, mensaje);
    }

    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [SMS a " + usuario + "] " + mensaje);
    }
}
