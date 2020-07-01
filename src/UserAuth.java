
import java.util.Scanner;


public class UserAuth {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String validId="indore";
        String validPassword="india";
        
        System.out.println("Enter Your Id : ");
        String userId=sc.next();
        System.out.println("Enter Your Pw : ");
        String password=sc.next();
        
        if(userId.equalsIgnoreCase(validId)){
            //id is correct
            //we will check for password
            if(password.equals(validPassword)){
                //pwd is correct
                System.out.println("Welcome User......");
            }else{
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid Id");
        }
        
        
        
        /*
        System.out.println("enter your code");  
        int code=sc.nextInt();
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter your salary");
        double sal=sc.nextDouble();
        
        System.out.println("Your Inputs : ");
        System.out.println(code+","+name+","+sal);
        */
    }
}
