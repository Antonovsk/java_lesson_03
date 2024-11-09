import java.util.ArrayList;
import java.util.Arrays;

class FilterNegative {
    public static int[] FilterNegative(int[] a) { // Исправлено имя метода
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (num >= 0) {
                result.add(num);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}


public  class task1 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[] {-1, 2, -3, 4, -5, 6};
        } else {
            a = Arrays.stream(args[0].split(", ")) // Исправлено разделение строки
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        FilterNegative answer = new FilterNegative();
        String itresume_res =
Arrays.toString(answer.FilterNegative(a)); // Исправлено имя метода
        System.out.println(itresume_res);
    }
}