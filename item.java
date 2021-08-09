package ques01.Ques01;

public abstract class item {

    private int itemNo;
    private String description;
    private double unitPrice;

    public item(int itemNo, String description, double unitPrice) {
        this.itemNo = itemNo;
        this.description = description;
        this.unitPrice = unitPrice;
    }
    public void Display(){

        System.out.println(itemNo);
        System.out.println(description);
        System.out.println(unitPrice);
    }

    
    
}
