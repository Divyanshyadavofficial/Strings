import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        // out is ref variable of type print stream which is a class
        // null is a standard output stream which is your console
        // the Printstream has a method in it which is println
        // lets look at how println prints values of different types.
        // anything you print in println it calls the toString method.
        // println-->value_of-->toString.
        System.out.println("Div");
        System.out.println(new int[]{2,3,4,5});//for every object they have
        // a default representation which takes a hashcode adds @ to it and
        // some random characters.
        String name = null;
        System.out.println(name);
        System.out.println(Arrays.toString(new int[]{2,3,4,5}));
        // this is the method overriding and telling java that use Arrays's
        // class toString method rather than the default one.

    }
}
