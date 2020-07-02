
public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("abcdefgh");
        System.out.println(sb);
        //sb.append("XYZ");
        //sb.insert(0, "XYZ");
        //sb.replace(2, 5, "1234");
        //sb.setCharAt(2, '#');
        //sb.deleteCharAt(3);
        //sb.delete(1, 4);
        //sb.reverse();
        System.out.println(sb);
        
        
    }
}
/*  
    StringBuffer gives you mutable objects (changable)

    methods of StringBuffer
    ---------------------------
    append  (add the new contents at the end of existing contents)
    insert  (insert the new contents on desired position)
    replace (replace a range with new data)
    setCharAt
    deleteCharAt
    delete
    reverse
    toString    to convert a StringBuffer to String
*/
