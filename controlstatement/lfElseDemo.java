package controlstatement;


import java.util.Scanner;

public class lfElseDemo {
	void checkIfElse(int number){

    }


    void checkElseIf(int number){

        if (number<35){
            System.out.printf("Fail");
        }
        else if(number>=35 && number<60){
            System.out.printf("Pass Class");
        }

        else if (number>=60 && number<74){
            System.out.printf("First Class");
        }
        else if (number>=74 && number<=100){
            System.out.printf("Dist");
        }
        else {
            System.out.printf("Invalid");
        }

    }


    public static void main(String[] args) {
    	lfElseDemo demo=new lfElseDemo();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        demo.checkIfElse(number);
        //demo.checkIfElse(number);
        demo.checkElseIf(number);
    }


}
