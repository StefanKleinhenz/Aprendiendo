package Interfaces;

public class Flughafen {

    public static void main(String[] args) {
        Flieger flieger = new Flugzeug();
        flieger.landen();

        Flieger ente = new Ente();
        ente.starten();
        ((Ente) ente).eierLegen();
        Flieger superman = Superman.getInstance();
        superman.starten();
        superman.landen();
    }
    
}
