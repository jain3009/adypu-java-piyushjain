package codingtest;
import java.util.Scanner;
public class Que3 {


        public static void main(String[] args)
        {
            int n, mul;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any integer:");
            n = s.nextInt();
          Que3 obj = new Que3();
            mul = obj.fact(n);
            System.out.println("Factorial of "+n+" :"+mul);
        }
        int fact(int x)
        {
            if(x > 1)
            {
                return(x * fact(x - 1));
            }
            return 1;
        }
    }


