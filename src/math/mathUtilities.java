package math;

import java.util.Arrays;

public class mathUtilities {
    public double addition(double[] data){
        double sum = 0;
        for(double d : data){
            sum += d;
        }
        return sum;
    }
    public double subtraction(double[] data){
        double diff = data[0];
        for(double d : Arrays.copyOfRange(data,1,data.length)){
            diff -= d;
        }
        return diff;
    }
    public double multiplication(double[] data){

        double mul = 1;
        for (double d : data){
            mul *= d;
        }
        return mul;
    }
    public double division(double numerator, double denominator) throws ArithmeticException{
        double div;
        if (denominator==0.00){
            throw new ArithmeticException("Divide by zero error");
        }

        div = numerator/denominator;

        return div;
    }
}
