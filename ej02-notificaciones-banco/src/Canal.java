public abstract class Canal {
    protected  String usuario;
    protected String mensaje;

    public Canal(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }
    public abstract void enviar(String usuario, String mensaje);
}
