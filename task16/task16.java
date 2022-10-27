import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class task16 {
    public static class Player {
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
    public static class Card {
        protected int v1;
        protected int v2;
        public Card() {

        }
        Card(int v1, int v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        public void setV(int v1) {
            this.v1 = 1;
        }

        public void setV2(int v2) {
            this.v2 = v2;
        }

        public int getV1() {
            return v1;
        }

        public int getV2() {
            return v2;
        }
        static public int compare(int v1, int v2) {

            if (v1 > v2) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> value = new ArrayList<>();
        //ArrayList<Card> card1 = new ArrayList<>();
        //ArrayList<Card> card2 = new ArrayList<>();
        Card c = new Card();
        Player pl1 = new Player("Первый игрок");
        Player pl2 = new Player("Второй игрок");




        /*for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random()*9);
            if (card.contains(new Card(rand)) == false) {
                card.add(new Card(rand));
            }
        }*/

        while (value.size() != 10) {
            int rand = (int) (Math.random() * 10);
            if (!value.contains(rand)) {
                value.add(rand);

            }
            System.out.println(value);
        }
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                pl1.addCard(value.get(i));
            }
            else {
                pl2.addCard(value.get(i));
            }
        }
        System.out.println(1);
        System.out.println(pl1);
        System.out.println(pl2);
        int count = 0;
        for (int i = 1; i < 106; i++) {
                if (Card.compare(pl1.l_card.get(0), pl2.l_card.get(0)) == 1) {
                    pl1.addCard(pl1.l_card.get(0), pl2.l_card.get(0));

                }
                else {
                    pl2.addCard(pl1.l_card.get(0), pl2.l_card.get(0));
                }
                pl1.l_card.remove(0);
                pl2.l_card.remove(0);
                System.out.println(i+1);
                System.out.println(pl1);
                System.out.println(pl2);
                if (pl1.l_card.size() == 0) {
                    System.out.println("second " + ++i);
                    break;
                }
                if (pl2.l_card.size() == 0) {
                    System.out.println("first " + ++i);
                    break;
                }
                if (i == 105) {
                    System.out.println("\n" + "botva");
                }


        }




        //pl1.l_card.remove(0);
        //System.out.println(pl1);
        //System.out.println(pl1.l_card.get(0));









    }

}
