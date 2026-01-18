public class Main{
    public static void main(String[] args) {
        students student1 = new students();
        student1.name = "Alice";
        student1.age = 20;  
        students student2 = new students();
        student2.name = "Bob"; 
        student2.age = 22;
        student2.gender = "Male";
        students student3 =new students();
        student3.name = "Charlie";
        student3.age = 19;     
        student3.gender = "Male";

        students stu[] = {student1, student2, student3};        //create studennts array
       
        for(int i=0;i<stu.length;i++){                          //method to print student details
            System.out.println("Name: " + stu[i].name + ", Age: "   + stu[i].age + ", Gender: " + stu[i].gender);   
        }
        //useing enhanced for loop

        for(students s : stu){
            System.out.println("Name: " + s.name + ", Age: "   + s.age + ", Gender: " + s.gender);  
        }
    
    
    }
}
class students{
    String name;
    int age;
    String gender;
}
