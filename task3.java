import  java.util.ArrayList;
import java.util.Arrays;

class FilterStrings {
    public static String[] filterShortStrings(String[] arr){
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr) {
            if (s.length() > 3) {
                result.add(s);
            }
        }

        String[] resultArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++){
            resultArray[i] = result.get(i); // Добавлена точка с запятой
        }

        return resultArray;
    
    }
}

public class task3 {
    public static void main(String[] args) {
        String[] arr;

        if (args.length == 0) {

            arr = new String[]{"cat", "elephant", "dog", "giraffe"};
        }else{
            arr = args[0].split(", ");
        }

        FilterStrings answer = new FilterStrings();
        String itresume_res =
Arrays.toString(answer.filterShortStrings(arr)); // Исправлено на toString
        System.out.println(itresume_res);
    }
}