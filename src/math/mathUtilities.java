package math;


import java.util.*;

public class mathUtilities {

    Deque<Double> memQueue = new ArrayDeque<>();

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

    /// This is a division operator
    public double division(double numerator, double denominator) throws ArithmeticException{
        double div;
        if (denominator==0.00){
            throw new ArithmeticException("Divide by zero error");
        }

        div = numerator/denominator;

        return div;
    }

    /*Memory operations*/
    /// Store the value to the top of the memory stack
    public double memoryStore(double value){
        memQueue.push(value);
        return memQueue.peek();
    }

    public double addToMemory(double value){
        if (memQueue.isEmpty()) {
            memoryStore(value);
            return memQueue.peek();
        }

        double lastEl = memQueue.pop();
        memQueue.push(lastEl+value);
        return memQueue.peek();
    }

    public double subtractFormMemory(double value){
        if (memQueue.isEmpty()) {
            memoryStore(value);
            return memQueue.peek();
        }
        memQueue.push(memQueue.pop()-value);
        return memQueue.peek();
    }

    public void clearMemory(){
        memQueue.clear();
    }

    public double[] viewMemory(){
        Iterator<Double> memoryItr = memQueue.iterator();
        List<Double> values = new ArrayList<>();
        while(memoryItr.hasNext()){
            values.add(memoryItr.next());
        }
        return values.stream().mapToDouble(i -> i).toArray();
    }
}