import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Produkt> listOfObjects= new ArrayList<>();
        Produkt obje=new Produkt(123.04,1);
        Produkt obj1 = new Produkt(1234,17);
        Produkt obj2 = new Produkt(12454,34);
        Produkt obj3 = new Produkt(987,356);

        System.out.println("This is the reduce value "+obj1.getBasePrice());
        System.out.println("\n");
        System.out.println("This is the reduce value "+obje.getBasePrice());
        Produkt array = new Produkt(listOfObjects);



    }


}