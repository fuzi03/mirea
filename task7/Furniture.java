abstract class Furniture {
    protected String size;
    protected String material;
    protected float weight;
    protected float cost;
    protected boolean sold;

    Furniture(String size, String material, float weight, float cost, boolean sold) {
        this.size = size;
        this.material = material;
        this.weight = weight;
        this.cost = cost;
        this.sold = sold;
    }

    public void sell() {this.sold = true;};

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isSold() {
        return sold;
    }

    public abstract String thing();
    public abstract String action();

    @Override
    public String toString() {
        return  "размер= " + size +
                ",\nматериал= " + material +
                ",\nвес= " + weight +
                ",\nцена= " + cost +
                ",\nпродан= " + ((sold) ? "Да" : "Нет");
    }
}
class Chair extends Furniture {
    private boolean forGamers;
    private boolean footrest;

    Chair(String size, String material, float weight, float cost,
          boolean sold, boolean forGamers, boolean footrest)
    {
        super(size, material, weight, cost, sold);
        this.forGamers = forGamers;
        this.footrest = footrest;
    }

    public boolean isForGamers() {
        return forGamers;
    }

    public void setForGamers(boolean forGamers) {
        this.forGamers = forGamers;
    }

    public boolean isFootrest() {
        return footrest;
    }

    public void setFootrest(boolean footrest) {
        this.footrest = footrest;
    }

    @Override
    public String action() {
        if (footrest) return "Можно сидеть";
        else return "Можно сидеть и лежать";
    }

    @Override
    public String thing() {
        return "Стул";
    }

    @Override
    public String toString() {
        return "Характеристики стула:\n"
                + super.toString()
                + "\nИгровой= " + ((forGamers) ? "Да" : "Нет")
                + "\nЕсть подставка для ног= " + ((footrest) ? "Да" : "Нет")
                + "\n";
    }
}
class Main {

    public static void main(String[] args) {
        Chair a = new Chair("40x50x90", "Oak", 1.3f, 200, false, false, false);
        System.out.println(a);
    }
}