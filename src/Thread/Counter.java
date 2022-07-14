package Thread;

public class Counter {

    private boolean sincronizado;

    public Counter(boolean sincronizado) {
        this.sincronizado = sincronizado;
    }

    public boolean isSincronizado() {

        return sincronizado;
    }

    public synchronized void mostrarNumerosSincronizados(int id, int n) {
        System.out.println("Inicio Hilo" + id);
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("Fin Hilo" + id);

    }
    
    public void mostrarNumerosNoSincronizados(int id, int n) {
        System.out.println("Inicio Hilo" + id);
        for (int i = 0; i <= n; i++) {

            System.out.println(i);
        }

        System.out.println("Fin Hilo" + id);

    }
}
