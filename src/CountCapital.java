
public class CountCapital {
    public static void main(String[] args) {

        String s="This Is Java And I Love This Language";
                    
        //writing a code to count capital alphabates
        //System.out.println((int)'A');
        //System.out.println((int)'Z');
        byte b[]=s.getBytes();
        int count=0;
        for(byte val:b){
            if(val>=65 && val<=90){
                count++;
            }
        }
        System.out.println("Total Capital Alphabates : "+count);
    }
}
