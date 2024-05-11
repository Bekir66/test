// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
    int counter =0;
    int product = 1;
    int input = 1;

    while( (input != 0) && (counter<10)){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zahl eingeben:");
        input = scan.nextInt();
        counter = counter + 1;
        if(input>0){
            product = product * input;
        }
        //System.out.println(+product);
        //System.out.println(+input);
    }
    if (product >0 ){
        System.out.println(+product);
    }
    }
}