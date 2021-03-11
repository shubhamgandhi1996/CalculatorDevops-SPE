import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("******************** Welcome to Calculator Application ****************");
        while(true) {
            System.out.print("1:-For Square Root Operation \n2:- For Factorial  \n3:- For Logarithm  \n4:-For Power Function \nPress any other key to exit:  ");

                int choice;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());

            if (choice == 1) {
                System.out.println(" Enter the number to Calculate Square Root: ");
                double num = Double.parseDouble(br.readLine());
                double result= squareRoot(num);
                if(result>=0)
                    System.out.println(" Square root of " + num + " is: " + squareRoot(num)+ "\n");
                else
                    System.out.println(" real square root exists only for positive numbers  \n");
            }

            else if (choice == 2) {
                    System.out.println(" Enter the number to Calculate Factorial: ");
                    int num = Integer.parseInt(br.readLine());
                    System.out.println(" Factorial of " +num+ " is: " + factorial(num)+ "\n");

            }


            else if (choice == 3) {
                System.out.println(" Enter the number to calculate natural logarithm(base): ");

                double num = Double.parseDouble(br.readLine());


                if(num<0)
                    System.out.println(" Enter positive numbers only ");
                else
                    System.out.println(" Natural log value of " +num+ " is: " + cal_natural_log(num)+ "\n");

            }

            else if (choice == 4) {
                System.out.println("enter the base and exponent to calculate the power of base value: ");
                System.out.println("enter the base value: ");
                double base_num, exp_num;
                base_num = Double.parseDouble(br.readLine());
                System.out.println("enter the exponent value: ");
                exp_num = Double.parseDouble(br.readLine());
                System.out.println(base_num + " to the power "+exp_num+ " is: "+cal_pow(base_num, exp_num)+ "\n");
            }

            else{
                System.out.println("1 To Use Calculator Again\nPress any other number to exit ");
                if(Integer.parseInt(br.readLine())!=1) {
                    System.out.println("Thank you and see you again\n");
                    break; // breaking from infinite while loop
                }
            }

        }// end of infinite while loop
    }

    public static double factorial(int n)
    {
        if(n<0){
            System.out.println(" !!Factorial Does not  exist for Negative Numbers!! ");
            return Double.NaN;
        }
        if (n == 0)
            return 1;

        return n*factorial(n-1);

    }

    public static double squareRoot(double num){
        if(num<0)
            return Double.NaN;
        return Math.sqrt(num);
    }

    public static double cal_natural_log(double num){
        if(num==0)
            return Double.NEGATIVE_INFINITY;
        else if(num<0)
            return Double.NaN;
        return Math.log(num);
    }

    public static double cal_pow(double base_num, double exp_num){
        if(base_num==0 && exp_num==0)
            return Double.NaN;
        return Math.pow(base_num, exp_num);
    }

}