import java.util.HashMap;


public class Zadanie1 {
    public static void main(String[] args) {
        Zadanie1 cookie = new Zadanie1();
        cookie.addCookies();

    }
    HashMap<String,String> cookies = new HashMap<>();
    public void addCookies () {

        for(int i=0;i<5;i++)
        {
            cookies.put("cookie"+i,"strawberry");
        }
        System.out.println(cookies);

        for(int i=5;i<10;i++)
        {
            cookies.put("cookie"+i,"chocolate");
        }
        System.out.println("*");
        System.out.println("New cookies!!");
        System.out.println("*");
        System.out.println(cookies);
        for(int i=10;i<15;i++)
        {
            cookies.put("cookie"+i,"vanilla");
        }
        System.out.println("*");
        System.out.println("New cookies!!");
        System.out.println("*");
        System.out.println(cookies);
    }

}
