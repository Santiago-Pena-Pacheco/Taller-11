public class Push extends Canal {
    public Push(String usuario, String mensaje) {
        super(usuario, mensaje);
    }
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [PUSH al celular de " + usuario + "] " + mensaje);
    }
}
