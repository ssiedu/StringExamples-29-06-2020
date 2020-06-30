
public class StringMethodsExampleOne {

    public static void main(String[] args) {

        String s1="indore";
        String s2="Indore";
        //int n=s1.compareTo(s2);
        int n=s1.compareToIgnoreCase(s2);
        System.out.println(n);
        
        
        /*
        String s="abcd@gmail.com";
        boolean b=s.endsWith(".in");
        System.out.println(b);
        */
        /*
        String s1="indore";
        //String s1="india";
        boolean b=s1.startsWith("i");
        System.out.println(b);
        */
        
        /*
        String s1=new String("indore");
        String s2=new String("Indore");
        
        boolean b1=s1.equals(s2);
        boolean b2=s1.equalsIgnoreCase(s2);
        
        System.out.println(b1);
        System.out.println(b2);
        
        */
    }
}
/*
    Non-Static-Methods-of-String-class (you need to call them on String objects)
    ======================================

    boolean equals(String)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)  //begining
    boolean endsWith(String)    //end
    int compareTo(String)

        int n=s1.compareTo(s2);

                    s1>s2       +ve
                    s1<s2       -ve
                    s1=s2       0








*/