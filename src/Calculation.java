//public class Calculation {
//    public static void game3.main(String[] args) {
//        int number = 213;
//        double number2 = 456.5;
//        double sum = number2 % number;
//        double count = (int)2.5;
//        System.out.println(count);
//    }
//}
import java.util.Arrays;

public class Calculation {

    static boolean canMatch(String s1, String s2) {
        if (null == s1 || null == s1 || s1.length() != s2.length()) {
            return false;
        }
        // Extract and sort even or odd character strings from s1 and s2
        String s1e = evenOrOdd(true, s1);
        String s2e = evenOrOdd(true, s2);
        String s1o = evenOrOdd(false, s1);
        String s2o = evenOrOdd(false, s2);
        return s1e.equals(s2e) && s1o.equals(s2o);
    }

    static String evenOrOdd(boolean even, String s) {
        int start = even ? 0 : 1;
        char[] result = new char[s.length() / 2 + 1];
        int j = 0;
        for (int i = start; i < s.length(); i = i + 2) {
            result[j++] = s.charAt(i);
        }
        Arrays.sort(result);
        return new String(result);
    }

    public static void main(String[] args) {
        String[] arrData = {"abcd", "cdab", "qwer", "rftg"};
        int count = 0;
        for(int i = 0; i< arrData.length; i++){
            String a = arrData[i];
            boolean last = false;
            for(int j = i +1; j< arrData.length; j++) {
                if(i != j) {
                    String b = arrData[j];
                    if(canMatch(a, b)) {
                         last = true;
                        break;
                    }else {
                        last = true;
                    }
                }
            }
            if(last) {
                count += 1;
            }

        }
        System.out.println(count);
    }

}