public class GeneradorTurnos {
    private int consecutivo = 0;
    private static GeneradorTurnos instancia;

    public static GeneradorTurnos getInstancia() {
        if (instancia == null){
            instancia = new GeneradorTurnos();
        }
        return instancia;
    }
    
    public String siguienteTurno() {
        consecutivo++;
        return "T-" + String.format("%03d", consecutivo);
    }
}

