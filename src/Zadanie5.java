import java.util.HashMap;
import java.util.Scanner;

public class Zadanie5 {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,String>menu = new HashMap<>();
    public static void main(String[] args) {
        Zadanie5 getMap = new Zadanie5();
        getMap.zadanie5();

    }
    public void zadanie5()
    {
        menu.put(1,"Pepperoni Pizza");
        menu.put(2,"Hawaiian Pizza");
        menu.put(3,"Mushroom Pizza");
        menu.put(4,"Ham Pizza");
        menu.put(5,"Plain Cheese Pizza");
        menu.put(6,"Vegetable Pizza");
        menu.put(7,"Hot Pepper Pizza");
        menu.put(8,"Sour Crumble Pizza");
        menu.put(9,"Roasted Oyster Pizza");
        menu.put(10,"Seafood Pizza");

        System.out.println("Enter a key specifying how much of the menu you want to see: ");
        int key= sc.nextInt();
        for(int i=1;i<key;i++)
        {
            menu.get(i);

            System.out.println(i+ ": "+menu.get(i));
        }



    }

}
