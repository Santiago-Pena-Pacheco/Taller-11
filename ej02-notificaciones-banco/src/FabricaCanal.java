class FabricaCanal{
    public FabricaCanal(){}
    
    public static Canal crear(String canal, String usuario, String mensaje) {
        if (canal.equals("EMAIL")) {
            return new Email(usuario, mensaje);
        } else if (canal.equals("SMS")) {
            return new Sms(usuario, mensaje);
        } else if(canal.equals("PUSH")) {   
            return new Push(usuario, mensaje);
        } else if(canal.equals("WHATSAPP")) {
            return new WhatsApp(usuario, mensaje);
        }
        return null;
    }
}
