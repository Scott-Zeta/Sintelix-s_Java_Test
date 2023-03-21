import java.util.*;

public class ReadWriteExecute {
    public static int symbolicToOctal(String permString) {
        if(permString.length() != 9){
            throw new IllegalArgumentException("String length is not equal to 9");
        }
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('r', 4);
        map.put('w', 2);
        map.put('x', 1);
        map.put('-', 0);

        int[] arr = new int[9];

        for(int i = 0; i<9; i++){
            arr[i] = map.get(permString.charAt(i));
        }

        int result = (int)(Math.pow(10, 2) * (arr[0] + arr[1] + arr[2]) + Math.pow(10, 1) * (arr[3] + arr[4] + arr[5]) + (arr[6] + arr[7] + arr[8]));
        return result;
    }

    public static void main(String[] args) {
        // Should write 752
        System.out.println(ReadWriteExecute.symbolicToOctal("rwxr-x-w-"));
    }
}