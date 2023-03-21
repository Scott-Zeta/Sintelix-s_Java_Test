import java.util.*;

public class Sum3 {
    /**
     * Adds/appends list of integers at the end of internal list.
     */
    private ArrayList<Integer> sumList = new ArrayList<>();

    public void addLast(int[] list) {
        for (int n : list) {
            sumList.add(n);
        }
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given sum.
     */
    public boolean containsSum3(int sum) {
        if (sumList.size() < 3) {
            throw new IllegalArgumentException("Less than three elements in list!");
        }

        int window = sumList.get(0) + sumList.get(1) + sumList.get(2);
        if (window == sum) {
            return true;
        }
        for (int i = 3; i < sumList.size(); i++) {
            window += sumList.get(i) - sumList.get(i-3);
            if (window == sum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Sum3 s = new Sum3();

        s.addLast(new int[] { 1, 2, 3 });

        System.out.println(s.containsSum3(6));
        System.out.println(s.containsSum3(9));

        s.addLast(new int[] { 4 });

        System.out.println(s.containsSum3(9));
    }
}