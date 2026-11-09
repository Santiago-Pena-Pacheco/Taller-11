public class Juego {

    // Cerrado a modificacion: agregar un nivel nuevo no obliga a tocar este metodo.
    public void jugarNivel(Nivel nivel, int cantidadEnemigos) {
        System.out.println(">> Entrando a: " + nivel.getNombre());
        for (int i = 0; i < cantidadEnemigos; i++) {
            Enemigo enemigo = nivel.crearEnemigo();
            enemigo.atacar();
        }
    }
}
