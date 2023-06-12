package com.crio.qcalc;

public class StandardCalculator {
    private int result;
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public void add(int num1, int num2){
        
        this.result =  num1+num2;
    }


    public void subtract(int num1, int num2){
        this.result =  num1-num2;
    }
    
    
    public void multiply(int num1, int num2){
        this.result =  num1*num2;
    }
    
    
    public void divide(int num1, int num2){
        this.result =  num1/num2;
    }
    
    
public int getResult() {
    return result;
}

private void setResult(int value)
{

    this.result = value;

}
public void clearResult(){
    setResult(0);
}

public void printResult()
{
    System.out.println(this.getResult());
}
}
