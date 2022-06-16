package Interfaces.Interfaces2;

public class ByTwo implements Series {
    
    int val;

    public ByTwo() {
        val = 0;
    }

    public int getNext() {
        
        if (val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
        }


        return val;
    }
    
}
