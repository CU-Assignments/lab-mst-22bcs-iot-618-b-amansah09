import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingSum {
    
    // Method to parse strings into Integers and return a list
    public static List<Integer> parseStringToIntegers(String[] strNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strNumbers) {
            numbers.add(Integer.parseInt(str)); // Autoboxing: int to Integer
        }
        return numbers;
    }
    
    // Method to calculate the sum of a list of Integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing: Integer to int
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
