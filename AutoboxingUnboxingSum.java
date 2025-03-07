import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingSum {
    
    public static List<Integer> parseStringToIntegers(String[] strNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strNumbers) {
            numbers.add(Integer.parseInt(str));
        }
        return numbers;
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        String[] strNumbers = {"10", "20", "30", "40", "50"};
        List<Integer> numbers = parseStringToIntegers(strNumbers);
        
        int sum = calculateSum(numbers);
        
        System.out.println("The sum of the list of integers is: " + sum);
    }
}
