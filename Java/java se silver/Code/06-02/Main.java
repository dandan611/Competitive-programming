public class Main{
    public static void main(String[] args){
        Item a = new Item();
        Item b = new Item();
        a.name = "apple";
        b.price = 100;
        a.price = 200;
        b.name = "banana";
        a = b;
        a.printInfo();
    }
}