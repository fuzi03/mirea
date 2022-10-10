abstract class Dog {
    protected String name;
    protected int age;
    
    public Dog() {
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
class Buldog extends Dog {
    public Buldog() {
    }
    public Buldog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Buldog {" + "name = " + name + ", " + "age = " + age + "}";
    }
}
class Haski extends Dog {
    public Haski() {
    }
    public Haski(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Haski {" + "name = " + name + ", " + "age = " + age + "}";
    }
}
class DogTest {
    public static void main(String[] args) {
        Dog buldog = new Buldog("Bark", 6);
        System.out.println(buldog);
        Dog haski = new Haski("Cifet", 8);
        System.out.println(haski);
    }
}