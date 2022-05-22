package Interfaces;

public class Superman implements Flieger {
    private static final Superman obj = new Superman();

    @Override
    public void starten() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void landen() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fliegen() {
        // TODO Auto-generated method stub
        
    }
    public void weltretten(){

    }
    public static Superman getInstance() {
        return obj;
      }
    
}
