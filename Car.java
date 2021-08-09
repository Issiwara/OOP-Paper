package ques01.Ques01;

public class Car extends item {
    
    private String model;
    private String type;

    public Car(int itemNo, String description, double unitPrice, String model, String type) {
        super(itemNo, description, unitPrice);
        this.model = model;
        this.type = type;
    }

    @Override
    public void Display() {
        // TODO Auto-generated method stub
        super.Display();
        System.out.println(model);
        System.out.println(type);
    }
    

    
}
