import java.util.ArrayList;

public class MapaSillas {
    private final ArrayList<String> ocupadas = new ArrayList<>();
    private static final MapaSillas instancia = new MapaSillas();

    public static MapaSillas getInstancia(){
        return instancia;
    }
    public boolean reservar(String silla) {
        if (ocupadas.contains(silla)) {
            return false;
        }
        ocupadas.add(silla);
        return true;
    }
}
