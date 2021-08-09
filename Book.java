package ques01.Ques01;

public class Book extends item{

    private String publisher;
    private String category;
    private int pages;
    public Book(int itemNo, String description, double unitPrice, String publisher, String category, int pages) {
        super(itemNo, description, unitPrice);
        this.publisher = publisher;
        this.category = category;
        this.pages = pages;
    }
    @Override
    public void Display() {
        super.Display();
        System.out.println(publisher);
        System.out.println(category);
        System.out.println(pages);
    }
    
    
    
    
}
