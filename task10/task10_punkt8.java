public class task10_punkt8 {
    static String punkt8(String str) {
        if (str.length() == 1) {
            return "YES";
        }
        else {
            if (str.substring(0, 1).equals(str.substring(str.length()-1, str.length()))) {
                if (str.length() == 2) {
                    return "YES";
                }
                return punkt8(str.substring(1, str.length()-1));
            }
            else {
                return "NO";
            }
        }

    }
    public static void main(String[] args) {
        String s = "ytty";
        System.out.print(punkt8(s));



    }
}
