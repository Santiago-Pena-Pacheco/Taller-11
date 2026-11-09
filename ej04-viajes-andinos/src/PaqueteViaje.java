public class PaqueteViaje {

    private final String destino;
    private final int noches;
    private final boolean vuelo;
    private final String hotel;
    private final boolean desayuno;
    private final String tour;
    private final boolean seguroViaje;

    private PaqueteViaje(Builder b) {
        this.destino = b.destino;
        this.noches = b.noches;
        this.vuelo = b.vuelo;
        this.hotel = b.hotel;
        this.desayuno = b.desayuno;
        this.tour = b.tour;
        this.seguroViaje = b.seguroViaje;
    }

    public static class Builder {
        private String destino;
        private int noches;
        private boolean vuelo;
        private String hotel;
        private boolean desayuno;
        private String tour;
        private boolean seguroViaje;

        public Builder destino(String destino){
            this.destino = destino; return this;
        }
        public Builder noches(int noches){
            this.noches = noches; return this;
        }
        public Builder conVuelo(){
            this.vuelo = true; return this;
        }
        public Builder hotel(String hotel){
            this.hotel = hotel; return this;
        }
        public Builder conDesayuno(){
            this.desayuno = true; return this;
        }
        public Builder tour(String tour){
            this.tour = tour; return this;
        }
        public Builder conSeguro(){
            this.seguroViaje = true; return this;
        }
        public PaqueteViaje build() {
            if (destino == null) {
                throw new IllegalStateException("El destino es obligatorio");
            }
            if (noches < 1) {
                throw new IllegalStateException("El paquete a " + destino + " requiere minimo 1 noche (recibio " + noches + ")");
            }
            return new PaqueteViaje(this);
        }
    }

    @Override
    public String toString() {
        return destino + " (" + noches + " noches)"
             + (vuelo ? " + vuelo" : "")
             + (hotel != null ? " + hotel " + hotel : "")
             + (desayuno ? " + desayuno" : "")
             + (tour != null ? " + tour " + tour : "")
             + (seguroViaje ? " + seguro" : "");
    }
}
