package math;
import java.util.*;


public class Main {
    static Scanner input = new Scanner(System.in);
    static mathUtilities mathOps = new mathUtilities();
    public static void main(String[] args) {

        StringBuilder options = new StringBuilder();
        System.out.print("Choose the options below to work with the simple calculator\n");
        options.append("\n1. Addition: Provide input of numbers separated by space to add\n");
        options.append("2. Subtraction: Provide input of numbers separated by space to subtract\n");
        options.append("3. Multiplication: Provide input of numbers separated by space to multiply\n");
        options.append("4. Division: Provide two numbers to divide eg: num1/num2\n");
        options.append("5. Exit\n");

        while(true){
            System.out.println(options);
            int option = Integer.parseInt(input.nextLine());
            switch (option){
                case 1:
                    double[] data = collectData();
                    double res= mathOps.addition(data);
                    System.out.println(res);
                    break;
                case 2:
                    double[] data2 = collectData();
                    double res2= mathOps.subtraction(data2);
                    System.out.println(res2);
                    break;
                case 3:
                    double[] data3 = collectData();
                    double res3= mathOps.multiplication(data3);
                    System.out.println(res3);
                    break;
                case 4:
                    double[] data4 = collectData();
                    double res4= mathOps.division(data4[0],data4[1]);
                    System.out.println(res4);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Please choose a correct option");

            }
        }
    }

    public static double[] collectData(){
        System.out.println("Enter the numbers separated by space");
        return Arrays.stream(input.nextLine().split(" "))
                        .filter(s -> !s.isEmpty())
                        .mapToDouble(Double::parseDouble)
                        .toArray();
    }
}