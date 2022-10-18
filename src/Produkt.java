import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Math;

public class Produkt {

    private double basePrice;
    private int timeInStorage;

    private ArrayList<Produkt> listOfObjects;

    public Produkt(ArrayList<Produkt> listOfObjects) {
        this.listOfObjects = listOfObjects;
    }

    public ArrayList<Produkt> getListOfObjects() {
        return listOfObjects;
    }

    public void setListOfObjects(ArrayList<Produkt> listOfObjects) {
        this.listOfObjects = listOfObjects;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Produkt(double price, int time) {
        basePrice = price;
        timeInStorage = time;
    }

    public void setBasePrice(int price) {
        basePrice = price;
    }

    public int getTimeInStorage() {
        return timeInStorage;
    }

    public void setTimeInStorage(int time) {
        timeInStorage = time;
    }
    public List<Produkt> reducePriceOfElement(List<Produkt> listOfProducts){
        /*
        if (this.timeInStorage>10 && this.timeInStorage<20){
            this.basePrice*=0.9;}
        else if (this.timeInStorage>20) {
            this.basePrice*=0.8;
        }
        this.basePrice=(double)Math.round(this.basePrice*20.0)/20.0;
    */
        for(Produkt elements:listOfProducts){

            if(elements.timeInStorage>10 && elements.timeInStorage<20)
                elements.basePrice*=0.9;
            if(elements.timeInStorage>20)
                elements.basePrice*=0.8;
            elements.basePrice=(double)Math.round(elements.basePrice*20.0)/20.0;
        }
        return listOfProducts;
    }

    public void biggerThan100(List<Produkt> listOfProducts){
        //List<Produkt> list = new ArrayList<>();
        for (Produkt element:listOfProducts){
            if(element.basePrice>100){
                System.out.println(element);
                System.out.println("\n");
                //list.add(element);
            }
        }
    }

    public List<Produkt> sortList(List<Produkt> listOfProducts){
        reducePriceOfElement(listOfProducts);
        listOfProducts.sort(Comparator.comparing(Produkt::getBasePrice));
        return listOfProducts;
    }

    public Produkt mostExpensive(List<Produkt> listOfProducts){
        listOfProducts.sort(Comparator.comparing(Produkt::getBasePrice));
        return listOfProducts.get(listOfProducts.size()-1);
    }

    public Produkt leastExpensive(List<Produkt> listOfProducts){
        listOfProducts.sort(Comparator.comparing(Produkt::getBasePrice));
        return listOfProducts.get(0);
    }

    @Override
    public String toString() {
        return "Product :\t PriceTag = "+basePrice+"\n    \t"+"Time in Storage"+ timeInStorage;}

}

    /*
    public int sumOfElements(List<Produkt> listOfProjects) {
        for(int el:listOfProjects)
    }*/

