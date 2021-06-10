public class ImplementPow {

  public double myPow(double x, int n) {
    double res;

    if (n < 0) {
      double p = pow(x, -n);
      res = 1 / p;
    } else {
      res = pow(x, n);
    }
    return Math.round(res * 100000d) / 100000d;
  }

  private double pow(double x, int n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return x;
    }
    double powMid = pow(x, n / 2);
    return (n % 2 == 0) ? powMid * powMid : powMid * powMid * x;
  }
}
