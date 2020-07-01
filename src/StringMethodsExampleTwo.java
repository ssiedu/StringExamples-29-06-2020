
public class StringMethodsExampleTwo {
    public static void main(String[] args) {
        
        //String s="ABCDEFG";
        String s="this is java";
        //char ch=s.charAt(2);
        //System.out.println(ch);
        
        byte b[]=s.getBytes();
        for(byte val:b){
            System.out.println(val);
        }
        /*
        char ch[]=s.toCharArray();
        //System.out.println(ch[0]);
        //System.out.println(ch[1]);
        for(char c:ch){
            System.out.println(c);
        }
        */
        
        /*
        String s="this is java and java is object oriented language";
        //int n=s.indexOf('i');   //search for the first occurence of 'i' , searching will start from 0
        //int n=s.indexOf('i',35);   //search for the first occurence of 'i' , searching will start from 6
        //int n=s.indexOf("is");
        int n=s.indexOf("is",20);
        System.out.println(n);
        */
    }
}
/*
    Methods For Searching / extracting something from String
    (each space is considered as a char and indexing starts with 0)
    ----------------------------------------------------------------
    int indexOf(char)       //searching a single char
    int indexOf(char,int)
    int indexOf(String)     //searching a string in another string
    int indexOf(String,int)

    char charAt(int)
    char[] toCharArray()    //will convert a string to char array
    byte[] getBytes()       //will convert a string to byte array 


*/
