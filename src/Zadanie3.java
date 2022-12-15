import java.util.HashMap;

public class Zadanie3 {
    public static void main(String[] args) {
        Zadanie3 curiosity = new Zadanie3();
        curiosity.whoGotTheGift();

    }
    HashMap<String,String> whoGotWhat= new HashMap<>();

    public void whoGotTheGift()
    {
        whoGotWhat.put("Peter","socks");
        whoGotWhat.put("Tom","scarf");
        whoGotWhat.put("Sarah","olives");
        whoGotWhat.put("Tobias","sneakers");
        whoGotWhat.put("Sammy","pizza");
        whoGotWhat.put("Stacie","doll");

        System.out.println("Peter got " + whoGotWhat.get("Peter"));
        System.out.println("Tom got a " +whoGotWhat.get("Tom"));
        System.out.println("Sarah got " +whoGotWhat.get("Sarah"));
        System.out.println("Tobias got " +whoGotWhat.get("Tobias"));
        System.out.println("Sammy got " +whoGotWhat.get("Sammy"));
        System.out.println("Stacie got a " +whoGotWhat.get("Stacie"));


    }

}
