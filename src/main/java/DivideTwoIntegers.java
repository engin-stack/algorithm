public class DivideTwoIntegers {

  public int divide(int dividend, int divisor) {

    if (divisor == 1) {
      return dividend;
    }
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }
    int res = 0;
    long unsignedDividend = Math.abs((long) dividend);
    long unsignedDivisor = Math.abs((long) divisor);
    while (unsignedDividend >= unsignedDivisor) {
      res++;
      unsignedDividend -= unsignedDivisor;
    }
    if ((divisor < 0 && dividend > 0) || (divisor > 0 && dividend < 0)) {
      res = -res;
    }
    return res;
  }

}
