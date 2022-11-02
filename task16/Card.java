package task16;

public class Card {
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
