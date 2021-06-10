import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LetterCombinationsOfAPhoneNumberTest {

  private final LetterCombinationsOfAPhoneNumber o = new LetterCombinationsOfAPhoneNumber();

  @Test
  void letterCombinationsTest1() {
    List<String> resultList = o.letterCombinations("23");
    Assertions.assertArrayEquals(resultList.toArray(),
        new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"});
  }

  @Test
  void letterCombinationsTest2() {
    List<String> resultList = o.letterCombinations("");
    Assertions.assertArrayEquals(resultList.toArray(), new String[]{});
  }

  @Test
  void letterCombinationsTest3() {
    List<String> resultList = o.letterCombinations("2");
    Assertions.assertArrayEquals(resultList.toArray(), new String[]{"a", "b", "c"});
  }
}
