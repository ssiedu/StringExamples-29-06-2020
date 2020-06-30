
//in this program we will learn use various constructors provided by String class.
public class StringConstructorsExample {

    public static void display(String str){
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        
        String s1=new String();
        String s2=new String("indore");
        char ch[]={'a','b','c','d','e','f','g','h','i','j'};
        String s3=new String(ch);   //we are creating a String using elements of char array
        String s4=new String(ch,2,3);
        byte b[]={65,66,67,68,69,70,71,72,73,74};       //its an array of byte data type
        String s5=new String(b);    //we are creating a String using by elements of byte array
        String s6=new String(b,1,4);
        display(s1);
        display(s2);
        display(s3);
        display(s4);
        display(s5);
        display(s6);
    }
}
/*
    constructors
    -------------------

    String()                    //zero args
    String(String)
    String(char[])
    String(char[],int,int)
    String(byte[])
    String(byte[],int,int)

    int length() 
*/
