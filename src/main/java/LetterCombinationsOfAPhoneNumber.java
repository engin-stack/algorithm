import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

  private static final Map<Character, String[]> map = new HashMap<>();

  static {
    map.put('2', new String[]{"a", "b", "c"});
    map.put('3', new String[]{"d", "e", "f"});
    map.put('4', new String[]{"g", "h", "i"});
    map.put('5', new String[]{"j", "k", "l"});
    map.put('6', new String[]{"m", "n", "o"});
    map.put('7', new String[]{"p", "q", "r", "s"});
    map.put('8', new String[]{"t", "u", "v"});
    map.put('9', new String[]{"w", "x", "y", "z"});
  }

  public List<String> letterCombinations(String digits) {

    int size = digits.length();
    if (size == 0){
      return new ArrayList<>();
    }

    char firstDigit = digits.charAt(0);
    String[] resultArr = map.get(firstDigit);
    for (int i = 1; i < size; i++) {
      char digitChar = digits.charAt(i);
      String[] toAddArr = map.get(digitChar);
      resultArr = mergeArr(resultArr, toAddArr);
    }
    return Arrays.asList(resultArr);
  }

  private String[] mergeArr(String[] arr1, String[] arr2) {
    String[] resultArr = new String[arr1.length * arr2.length];
    int index = 0;
    for (String arr1Item : arr1) {
      for (String arr2Item : arr2) {
        resultArr[index++] = arr1Item + arr2Item;
      }
    }
    return resultArr;
  }

}
