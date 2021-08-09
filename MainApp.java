package ques01.Ques01;

import java.util.ArrayList;


public class MainApp {
    public static void main(String[] args) {

        ArrayList<item> arrList = new ArrayList<>();

        Book b1 = new Book(1,"book1",100.0,"abc","story",120);
        Book b2 = new Book(2,"book2",200.0,"def","education",200);

        Car c1 = new Car(3,"car1",1000,"toyota","a");
        Car c2 = new Car(4,"car2",2500,"benz","b");

        arrList.add(b1);
        arrList.add(b2);
        arrList.add(c1);
        arrList.add(c2);

        for (item iitem : arrList) {
            iitem.Display();
            System.out.println(" ");
            
        }
        

        

    }
    
}
