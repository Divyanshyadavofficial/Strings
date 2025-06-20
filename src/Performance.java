public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i = 0;i<26;i++){
            char ch = (char)('a'+i);
            series = series+ch;
        }
        System.out.println(series);
        // the problem here is when the element is added to the series
        // new object is created every time
        // copying the old one and then appending the new changes
        // "abc" +"d" = "abcd"
        // "abcd"+"e" = "abcde"
        // 1+2+3+4+ .... + N.
        //O(n2)(n square).
        // if you have to add n characters in a string you will have a
        // complexity of n2 that is the problem.


        //sol - if there is a datatype that will allow us to modify its value
        // String Builder class.



    }
}
