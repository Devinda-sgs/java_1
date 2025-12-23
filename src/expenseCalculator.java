import java.util.Scanner;
class expense{
    public double[] getExpense(){
        double expense[];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter days");
        int day = sc.nextInt();
        expense =new double[day];
        for(int i=0;i<day;i++){
            System.out.println("enter "+(i+1)+" day expense");
            expense[i] = sc.nextDouble();

        }
        return expense;
    }
    void displayExpenses(double[] expense) {
        for (int i = 0; i < expense.length; i++) {

            System.out.println("Day " + (i + 1) + " expenses: " + expense[i]);


        }
    }
    double total(double[] expense){
        double sum =0;
        for (int j=0; j < expense.length ;j++){
            sum = sum + expense[j];

        }
        System.out.println("Total expense in " +expense.length +" is " + sum);
        return sum;
    }
    void avg(double[] expense){
        double sum =0;
        for (int j=0; j < expense.length ;j++){
            sum = sum + expense[j];

        }
        double avrg =sum/expense.length;
        System.out.println("your average is "+ avrg);

    }
}


public class expenseCalculator {
    public static void main(String arg[]){
        expense expen =new expense();
        double[] arr = expen.getExpense();
        expen.displayExpenses(arr);
        double total= expen.total(arr);
        expen.avg(arr);


    }
}
