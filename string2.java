import java.util.Scanner;
public class string2{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(10);
        str.append("hello hii byee");
        System.out.println(str.length());
        System.out.println(str.capacity());
        String str1="hello";
        System.out.println(str1.concat("hiiiiiiiiiiiiiiiiii"));
        System.out.println(str1);
    }
}
