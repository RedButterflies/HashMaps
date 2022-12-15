import java.util.HashMap;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Zadanie4 bear = new Zadanie4();
        bear.lookAndFind();

    }
    public void lookAndFind()
    {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,String>numberOne = new HashMap<>();
        for(int i=0;i<5;i++)
        {
            numberOne.put(i,"A verry happy bear");
        }
        System.out.println("Enter a number to see if a bear is happy: ");
        int number = scan.nextInt();
        if(numberOne.containsKey(number))
        {
            System.out.println("You've found a bear");
            System.out.println(numberOne.get(number));
        }
        else
        {
            System.out.println("Try again");
        }
    }
}
