import java.util.Scanner;


public class StringMethods {

public static void main(String args[]){

    String name;
    char initial;
    int sub;

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    name =input.nextLine();

    System.out.println(name.length());

    initial = name.charAt(0);
    System.out.println(initial);

    System.out.println(name.toUpperCase());

    sub =name.lastIndexOf(" ");

    System.out.println(name.substring(sub));






}


}


