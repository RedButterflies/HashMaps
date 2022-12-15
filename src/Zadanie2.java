import java.util.HashMap;

public class Zadanie2 {
    public static void main(String[] args) {
        Zadanie2 christmas = new Zadanie2();
        christmas.myChristmas();

    }
    HashMap<String,Integer>christmasGifts = new HashMap<>();
    HashMap<String,Integer> grinchStoleThem = new HashMap<>();
    public void myChristmas()
    {
        christmasGifts.put("Grandma",5);
        christmasGifts.put("Granpa",3);
        christmasGifts.put("Sophie",4);
        System.out.println(christmasGifts);

        System.out.println("Copied: ");
        grinchStoleThem.putAll(christmasGifts);
        System.out.println(grinchStoleThem);
    }
}
