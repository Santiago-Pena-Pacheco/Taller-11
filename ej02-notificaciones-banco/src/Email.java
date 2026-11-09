public class Email extends Canal {
    public Email(String usuario, String mensaje) {
        super(usuario, mensaje);
    }
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [EMAIL a " + usuario + "@correo.com] " + mensaje);
    }
}
