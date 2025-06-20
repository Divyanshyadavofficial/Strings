import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//prints the ascii values
        System.out.println("a"+"b");//prints the concatenated string
        System.out.println('a'+3);// this prints ascii value of d
        System.out.println((char)('a'+3));// this prints d
        System.out.println("a"+1);// when an integer is added with a string
        // it is converted to its wrapper class integer that will call tostring
        // this is same as after a few steps: "a"+"1".
        System.out.println("Div"+ new ArrayList<>());// it will call to string on this
        // this will return Div and an empty array.
//        System.out.println(new Integer(56)+new ArrayList<>());
        // because the operator + in java is only defined for primitives
        // and you can only use this with all the complex objects as well
        // but the only condition is
        // when any one of the values is of type string.
        String ans = new ArrayList<>()+""+new ArrayList<>();
        System.out.println(ans);



    }
}
