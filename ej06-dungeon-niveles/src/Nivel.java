public abstract class Nivel {
    private final String nombre;
    protected Nivel(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() { return nombre; }

    public abstract Enemigo crearEnemigo();
}
