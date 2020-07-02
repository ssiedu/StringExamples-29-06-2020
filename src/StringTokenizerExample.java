
import java.util.StringTokenizer;


public class StringTokenizerExample {

    public static void main(String[] args) {
        String s="indore,bhopal;delhi,mumbai";
        StringTokenizer st=new StringTokenizer(s,",;");
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
/*
    StringTokenizer class is used to break a string in multiple tokens (parts)

    String nextToken()
    boolean hasMoreTokens();    //checks that do we have more tokens or not, if yes returns true else false
*/