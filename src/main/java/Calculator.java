import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

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

    public static double factorial(double num1)
    {
        logger.info("[FACTORIAL] - " + num1);
        double result=1;
        if(num1<0){
            System.out.println("factorial doesn't exist for negative numbers");
            return Double.NaN;
        }
        for(int i=1; i<=num1; i++){
            result = result* i;

        }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public static double squareRoot(double num){
        logger.info("[SQ ROOT] - " + num);
        if(num<0)
            return Double.NaN;

        double result = Math.sqrt(num);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;

    }

    public static double cal_natural_log(double number){
        logger.info("[NATURAL LOG] - " + number);
        double result = 0;

        try {

            if (number <0 ) {
                result = Double.NaN;

                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {

                result = Math.log(number);
            }

        } catch (ArithmeticException error) {

            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }

        logger.info("[RESULT - NATURAL LOG] - " + result);

        return result;
    }

    public static double cal_pow(double base_num, double exp_num){
        logger.info("[POWER - " + base_num + " RAISED TO] " + exp_num);

        if(base_num==0 && exp_num==0)
            return Double.NaN;


        double result = Math.pow(base_num, exp_num);

        logger.info("[RESULT - POWER] - " + result);


        return result;
    }

}