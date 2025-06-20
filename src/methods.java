import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Divyansh yadav";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);// does not change the original object
        System.out.println(name.indexOf('a'));
        System.out.println("   Divyansh    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
