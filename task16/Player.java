package task16;

import java.util.LinkedList;

public class Player {
    LinkedList<Integer> l_card = new LinkedList<>();

    String name;
    Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addCard(Integer l1) {
        l_card.add(l1);
    }
    public void addCard(Integer l1, Integer l2) {
        l_card.add(l1);
        l_card.add(l2);
    }

    @Override
    public String toString() {
        return "Player name: " + name + " {" + l_card + " }";
    }
}
