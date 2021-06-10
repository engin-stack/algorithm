public class PalindromeNumber {

  public boolean isPalindrome(int x) {

    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }

    int revertedNumber = 0;
    while (x > revertedNumber) {
      revertedNumber = revertedNumber * 10 + x % 10;
      x /= 10;
    }
    return x == revertedNumber || x == revertedNumber / 10;
  }

  public static void main(String[] args) {
    PalindromeNumber o = new PalindromeNumber();
    System.out.println(o.isPalindrome(22));
    System.out.println(o.isPalindrome(222));
    System.out.println(o.isPalindrome(121));
    System.out.println(o.isPalindrome(-121));
    System.out.println(o.isPalindrome(10));
    System.out.println(o.isPalindrome(-101));
    System.out.println(o.isPalindrome(-0));
    System.out.println(o.isPalindrome(1000021));
  }

}
