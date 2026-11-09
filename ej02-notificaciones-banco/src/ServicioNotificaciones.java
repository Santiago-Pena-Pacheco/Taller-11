public class ServicioNotificaciones {

    public void notificarTransferencia(String canal, String usuario, double monto) {
        String mensaje = "Recibiste $" + monto + " en tu cuenta BancoPlata";
        FabricaCanal.crear(canal, usuario, mensaje).enviar(usuario, mensaje);
    }

    public void notificarCodigoSeguridad(String canal, String usuario, String codigo) {
        String mensaje = "Tu codigo de seguridad es " + codigo + ". No lo compartas.";
        FabricaCanal.crear(canal, usuario, mensaje).enviar(usuario, mensaje);
    }
}
