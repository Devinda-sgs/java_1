class Main{

    public static void main(String[] args){
        calculator adding =new calculator();                //make object
        int r  = adding.add(6,7);                           //pass pharameters and store it in variable r
        System.out.println(r);                              //print result


    }
}
class calculator{                                           //creaate class
    public int add(int num1,int num2){                      //make method in it
        int res =num1+num2;                                 //operation
        return res;                                         //return output
    }
}
