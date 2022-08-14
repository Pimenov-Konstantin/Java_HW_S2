import java.util.ArrayList;
import java.util.List;

public class combine {

    public static void main(String[] args) {

        combine(4, 2);
        System.out.println(listCombine);
    }

    static List<List<Integer>> listCombine = new ArrayList<>();

    public static List<List<Integer>> combine(int n, int k) {
        genComb(n, k, 0, new ArrayList<>());
        return listCombine;
    }

    private static void genComb(int n, int k, int prevElem, List<Integer> curComb) {
        if (curComb.size() == k)
            listCombine.add(new ArrayList<>(curComb));

        for (int i = prevElem + 1; i <= n; i++) {
            curComb.add(i);
            genComb(n, k, i, curComb);
            curComb.remove(curComb.size() - 1);

        }
    }

}