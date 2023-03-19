package Day23_Inheritance_Extends.exmpl4;

public class bus extends car{

    private int capacity;


    public bus(String clour, String brand, int HP, int capacity) {
        super(clour, brand, HP);
        setCapacity(capacity);
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }







}
