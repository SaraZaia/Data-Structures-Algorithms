import java.util.*;
import java.lang.*;

public class ClosingTheLoop {

    /**
     * https://open.kattis.com/problems/closingtheloop
     */

    static public String closeLoop(int N, int S, String Line) {
        String[] arr;

        List<Integer> arrBlue = new ArrayList<>();
        List<Integer> arrRed = new ArrayList<>();

        int min = 0;
        int result = 0;

        arr = Line.split(" ");
        for (int j = 0; j < S; j++) {
            if (arr[j].endsWith("B")) {
                arrBlue.add(Integer.parseInt(arr[j].substring(0, arr[j].length()-1)));
            }else if (arr[j].endsWith("R")){
                arrRed.add(Integer.parseInt(arr[j].substring(0, arr[j].length()-1)));
            }
        }
        Collections.sort(arrRed, Collections.reverseOrder());
        Collections.sort(arrBlue, Collections.reverseOrder());

        min = Integer.min(arrBlue.size(), arrRed.size());

        for (int r = 0; r < min; r++) {
            result = result + arrBlue.get(r) + arrRed.get(r) -2;

        }
        return "Case #"+ N + ": " + result;
        //}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
;
        int N = in.nextInt(); // Number of cases

        for (int i = 1; i <= N; i++) {
            int S = in.nextInt();
            in.nextLine();
            String Line = in.nextLine();
            System.out.println(closeLoop(i, S, Line));
        }
    }

}
