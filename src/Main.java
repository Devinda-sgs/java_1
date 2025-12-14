class Main{

    public static void main(String[] args){
        String day= "monday";
        switch (day){
            case "sunday" ->System.out.println("1");
            case "monday" ->System.out.println("2");
            case "wednesday" ->System.out.println("3");

            default -> System.out.print("enter valid day");
        };
        int result;

        String day1= "monday";
        switch (day1){
            case "sunday" ->result =1;
            case "monday" ->result =2;
            case "wednesday" -> result =3;

            default -> result= 0;
        };
        System.out.print(result);


    }
}
