public class KioscoDigital {

    public void pedirTurno(String paciente) {
        GeneradorTurnos instancia = GeneradorTurnos.getInstancia();
        System.out.println("  [Kiosco] " + paciente + " -> " + instancia.siguienteTurno());
    }
}
