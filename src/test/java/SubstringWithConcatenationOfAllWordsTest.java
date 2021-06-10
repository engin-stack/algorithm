import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubstringWithConcatenationOfAllWordsTest {

  private final SubstringWithConcatenationOfAllWords o = new SubstringWithConcatenationOfAllWords();

  @Test
  void findSubstringCase1() {
    String s = "barfoothefoobarman";
    String[] words = new String[]{"foo","bar"};
    List<Integer> result = o.findSubstring(s, words);
    for (Integer i : result) {
      System.out.println(i);
    }
  }

  @Test
  void findSubstringCase2() {
    String s = "wordgoodgoodgoodbestword";
    String[] words = new String[]{"word","good","best","word"};
    List<Integer> result = o.findSubstring(s, words);
    for (Integer i : result) {
      System.out.println(i);
    }
  }

  @Test
  void findSubstringCase3() {
    String s = "barfoofoobarthefoobarman";
    String[] words = new String[]{"bar","foo","the"};
    List<Integer> result = o.findSubstring(s, words);
    for (Integer i : result) {
      System.out.println(i);
    }
  }

  @Test
  void findSubstringCase4() {
    String s = "aaa";
    String[] words = new String[]{"a","a"};
    List<Integer> result = o.findSubstring(s, words);
    for (Integer i : result) {
      System.out.println(i);
    }
  }
}
