package Interfaces.Interfaces2;

public class ByThree implements Series {

    int val;

    public ByThree() {

        val = 0;
    }
    
    @Override
    public int getNext() {
        val += 3;
        return val;
    }
    
}
