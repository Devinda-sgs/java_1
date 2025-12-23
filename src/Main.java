import java.util.Scanner;

class Main{

    public static void main(String args[]){
        ExpenseCalculator calc =new ExpenseCalculator();
        calc.getInput();

    }

}
class ExpenseCalculator{
    double[] expense;
    public double getInput(){
        Scanner sc =new Scanner(System.in);



        System.out.println("Enter your name: ");
        String name =sc.nextLine();
        System.out.println("Enter numbers of days: ");
        int days =sc.nextInt();

        expense = new double[days];                             //create an array days mean size of array

        for(int i=0;i<days;i++){
            System.out.println("Enter your " +(i+1)+ " day expense: ");
            expense[i] = sc.nextDouble();
        }
        return expense;




    }

}
