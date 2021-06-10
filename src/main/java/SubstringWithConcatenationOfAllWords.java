import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {

  public List<Integer> findSubstring(String s, String[] words) {
    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();
    int sLen = s.length();
    int num = words.length;
    int wordLen = words[0].length();

    for (int i = 0; i < sLen - num * wordLen + 1; i++) {
      String subString = s.substring(i, i + num * wordLen);
      if (isConcat(subString, map, wordLen)) {
        result.add(i);
      }
    }
    return result;
  }

  private boolean isConcat(String subString, Map<String, Integer> map, int wordLen) {
    Map<String, Integer> subStringMap = new HashMap<>();
    for (int i = 0; i < subString.length(); i += wordLen) {
      String sWord = subString.substring(i, i + wordLen);
      subStringMap.put(sWord, subStringMap.getOrDefault(sWord, 0) + 1);
    }
    return subStringMap.equals(map);
  }

}
