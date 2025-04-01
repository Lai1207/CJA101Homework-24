package Hw6;

public class Calculator {
    

    private int x;
    private int y;

    public Calculator() {
    }

    
    public Calculator(int x, int y) throws CalException {
        setXY(x, y);
    }

    public void setXY(int x, int y) throws CalException {
        if (x == 0 || y == 0) {
            throw new CalException("0的0次方沒意義");  
        } else if (y < 0) {
            throw new CalException("次方為負，回傳不為整數");  
        } else {
            System.out.println(Math.pow(x, y));  
        }
    }
}

