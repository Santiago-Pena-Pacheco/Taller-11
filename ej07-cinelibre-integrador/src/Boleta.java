public class Boleta {

    private final String pelicula;
    private final String silla;
    private final boolean es3D;
    private final boolean sillaVip;
    private final String combo;
    private final boolean estudiante;

    private Boleta(Builder b) {
        this.pelicula = b.pelicula;
        this.silla = b.silla;
        this.es3D = b.es3D;
        this.sillaVip = b.sillaVip;
        this.combo = b.combo;
        this.estudiante = b.estudiante;
    }

    public String getSilla() { return silla; }

    public static class Builder {
        private String pelicula;
        private String silla;
        private boolean es3D;
        private boolean sillaVip;
        private String combo;
        private boolean estudiante;

        public Builder pelicula(String pelicula) { this.pelicula = pelicula; return this; }
        public Builder silla(String silla)       { this.silla = silla; return this; }
        public Builder en3D()                    { this.es3D = true; return this; }
        public Builder vip()                     { this.sillaVip = true; return this; }
        public Builder combo(String combo)       { this.combo = combo; return this; }
        public Builder estudiante()              { this.estudiante = true; return this; }

        public Boleta build() {
            if (pelicula == null || pelicula.isBlank()) {
                throw new IllegalStateException("La boleta requiere pelicula");
            }
            if (silla == null || silla.isBlank()) {
                throw new IllegalStateException("La boleta requiere silla");
            }
            return new Boleta(this);
        }
    }

    @Override
    public String toString() {
        return pelicula + " | silla " + silla
             + (es3D ? " | 3D" : "")
             + (sillaVip ? " | VIP" : "")
             + (combo != null ? " | combo " + combo : "")
             + (estudiante ? " | tarifa estudiante" : "");
    }
}
