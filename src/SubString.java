import java.util.Scanner;

public class SubString {
    public static void main(String [] args)
    {

        String word;
        String cut;
        int length;
        int index;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word please: ");
        word = sc.nextLine();
        length = word.length();
        System.out.print("Enter a number as index between 0 and " + (length - 1) + " : ");
        index = sc.nextInt();
        sc.nextLine();
        cut = word.substring(0,index);

        System.out.println("The length of alphabet is: " + length);
        System.out.println("The substring from 0 to " + index +" is: " + cut);


    }
}
