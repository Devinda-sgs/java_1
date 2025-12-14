class Main{

    public static void main(String[] args){
        int b=5;
        int a=6;
        int x=7;
        int y=8;

        if (a<b && x<y){
            System.out.println("hello");
        }
        else{
            System.out.println("good");
        }
        if (a<b || x<y) {
            System.out.println("bye");
        } else if (a!=b) {
            System.out.println("hi");

        }
        else{
            System.out.println("go");
        }

    }
}
