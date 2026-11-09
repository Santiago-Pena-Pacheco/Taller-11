public class Ventanilla {

    private String nombre;
    private GeneradorTurnos instancia = GeneradorTurnos.getInstancia();

    public Ventanilla(String nombre) {
        this.nombre = nombre;
    }

    public void asignarTurno(String paciente) {
        System.out.println("  [" + nombre + "] " + paciente + " -> " + instancia.siguienteTurno());
    }
}
