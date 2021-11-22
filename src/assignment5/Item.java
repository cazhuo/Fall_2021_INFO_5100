package assignment5;

public class Item {
    private String Id;
    private int price;

    public Item(String id, int cost){
        this.Id =id;
        this.price=cost;
    }

    public String getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }
}
