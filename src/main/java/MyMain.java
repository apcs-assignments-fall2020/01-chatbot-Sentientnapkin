import java.util.Scanner;
//scan.next() for next word, scan.nextLine
public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Good Morning "+ name);
        System.out.println("What year were you born in?");
        String age = scan.nextLine();
        System.out.println(age + " really was a good year wasn't it!");
        System.out.println("What is your social security number?");
        String ssnum = scan.nextLine();
        System.out.println(ssnum+" really rolls right off the tongue.");
        System.out.println("Where were you born?");
        String birthplace = scan.nextLine();
        System.out.println("I personally love " + birthplace);
        System.out.println("And yoru favorite color?");
        String favcolor = scan.nextLine();
        System.out.println("I personally dislike "+favcolor);
        scan.close();
    }
}
