public abstract class Dish {
    protected String type;
    protected String material;
    
    public Dish() {
    }
    
    public Dish(String type, String material) {
        this.type = type;
        this.material = material;
    }
    
    public String getType() {
        return type;
    }
    public String getMaterial() {
        return material;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public String toString() {
        return "Dish{ " + "type = '" + type + '\'' + ", " + "material = '" + material + " }";
    }
}
public class Cup extends Dish {
    protected int size;
    
    public Cup() {
    }
    
    public Cup(int size, String type, String material) {
        this.size = size;
        this.type = type;
        this.material = material;
    }
    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "Cup{ " + "size = '" + size + '\'' + ", " + "type = '" + type + '\'' + ", " + "material = '" + material + '\'' + " }";
    }
}
public class Pan extends Dish {
    protected int ruchek;
    
    public Pan() {
    }
    
    public Pan(int ruchek, String type, String material) {
        this.ruchek = ruchek;
        this.type = type;
        this.material = material;
    }
    
    public int getRuchek() {
        return ruchek;
    }
    public void setRuchek(int ruchek) {
        this.ruchek = ruchek;
    }
    @Override
    public String toString() {
        return "Pan{ " + "ruchek = " + ruchek + ", " + "type = '" + type + '\'' + ", " + "material = '" + material + '\'' + " }";
    }
}
public class DishTest {
    public static void main(String[] args) {
        Dish cup = new Cup(10,"for tea","glass");
        System.out.println(cup);

        Dish pan = new Pan(5,"for cooking","iron");
        System.out.println(pan);
    }
}