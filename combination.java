
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combination {

    public static List<String> combination(String s, int st, List<String> res, String temp) {
        if (temp.length() >= 1 && temp.length() <= 8) {
            res.add(temp);
        }
        for (int i = st; i < s.length(); i++) {
            combination(s, i + 1, res, temp + s.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> res = new ArrayList<>();
        combination(input, 0, res, "");
        for (String str : res) {
            System.out.println(str);
        }
        System.out.println(res.size());
    }
}