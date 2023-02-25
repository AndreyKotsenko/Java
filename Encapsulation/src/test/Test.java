package test;

public class Test {

    public int a = 5;
    private int b = 10;
    protected int c = 15;
    int d = 20;

}

class SecondTest extends Test {

    public int getC(){
        return c;     // we have access because it protected
    }
}
