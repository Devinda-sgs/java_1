class calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
    public double add(int a,double b){
        return a+b;
    }
}

public class Main{
    public static void main(String arg[]){
        calculator cal=new calculator();
        int x= cal.add(5,7);
        int y = cal.add(6,16,12);
        double z =cal.add(9,5.04564);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
}
