import java.util.ArrayList;

class Item{
    private String name;
    private int price;
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public boolean equals(Object obj){
        if(obj instanceof Item){
            Item tmp = (Item) obj;
            if(tmp.name.equals(this.name)){
                return true;
            }
        }
        return false;
    }
    public String getName(){
        return name;
    }
}


public class Main{
    public static void main(String[] args){
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("A",100));
        list.add(new Item("B",200));
        list.add(new Item("C",300));
        list.add(new Item("A",100));
        list.remove(new Item("A",500));

        for(Item item:list){
            System.out.println(item.getName());
        }
    }
}