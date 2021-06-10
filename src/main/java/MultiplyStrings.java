public class MultiplyStrings {

  public String multiply(String num1, String num2) {

    if ("0".equals(num1) || "0".equals(num2)) {
      return "0";
    }
    int[] resultArr = new int[num1.length() + num2.length()];
    for (int i = num1.length() - 1; i >= 0; i--) {
      for (int j = num2.length() - 1; j >= 0; j--) {
        resultArr[i + j + 1] += (num2.charAt(j) - '0') * (num1.charAt(i) - '0');
      }
    }

    int more = 0;
    for (int i = resultArr.length - 1; i >= 0; i--) {
      int sum = resultArr[i] + more;
      resultArr[i] = sum % 10;
      more = sum / 10;
    }

    StringBuilder result = new StringBuilder();
    for (int num : resultArr) {
      if (num == 0 && result.length() == 0) {
        continue;
      }
      result.append(num);
    }
    return result.toString();
  }
}
