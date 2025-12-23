class computer{
    void playMusic(){
        System.out.println("Music playing");
    }
    String getPen(int cost){
        if (cost > 20){
            String str ="Cost is: " +cost;
            return str;
        }
        else {
            String str = "you dont have enogh money";
            return str;
        }
    }
}

public class Main{
    public static void main(String arg[]){
        computer com1 = new computer();         //make com1 object
        com1.playMusic();                       //call playMusic method
        String stri=  com1.getPen(30);     //call getPen method and store retuned value stri variable
        System.out.println(stri);               //print stris

    }
}
