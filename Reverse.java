import java.util.Scanner;
 
public class Reverse {
 
    public static void main(String[] args) {
 
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        str = in.nextLine();
         
        String[] split = str.split("");
        for(int i=split.length-1; i>=0; i--)
        {
            System.out.print(split[i] + "");
        }
         
    }
 
}