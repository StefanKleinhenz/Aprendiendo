package Thread;

public class Sincro extends Thread {
    
    public static void main(String[] args) {

        Emisor emisor = new Emisor();


        Sincro s = new Sincro(emisor, "Hola");
        Sincro s1 = new Sincro(emisor, "Adios");
        s.start();
        s1.start();

    }

    private String mensaje;
    private Emisor emisor;

    public Sincro(Emisor emisor, String mensaje) {
        this.mensaje = mensaje;
        this.emisor = emisor;
    }


    @Override
    public void run() {
        synchronized (emisor) {
            emisor.enviar(mensaje);
        }
    }

}

class Emisor {
    public void enviar(String mensaje) {

        System.out.println("Enviando " + mensaje);
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            //TODO: handle exception
        }

        System.out.println("El mensaje se ha enviado.");
    }
}
