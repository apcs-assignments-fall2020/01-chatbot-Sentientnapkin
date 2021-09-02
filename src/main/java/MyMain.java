import java.util.Scanner;
//scan.next() for next word, scan.nextLine
public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String nm = scan.nextLine();
        String name = nm.toUpperCase().charAt(0)+nm.substring(1,nm.length());
        System.out.println("Good Morning "+ name + ". I hope you have a pleasant rest of your day.");
        System.out.println("And your favorite color?");
        String color = scan.nextLine();
        String favcolor = color.toLowerCase().charAt(0)+color.substring(1,color.length());
        System.out.println("I dislike "+favcolor+".");
        System.out.println("What is your favorite brand of water?");
        String water = scan.nextLine();
        String favwater = water.toUpperCase().charAt(0)+water.substring(1,water.length());
        System.out.println(favwater+" is easily in my top 10!");
        System.out.println("Where were you born?");
        String birth = scan.nextLine();
        String birthplace = birth.toUpperCase().charAt(0)+birth.substring(1,birth.length());
        System.out.println("I personally love " + birthplace+"!");
        System.out.println("What year were you born in?");
        int age = scan.nextInt();
        System.out.println(age + " really was a time to be alive!");
        scan.close();
    }
}
