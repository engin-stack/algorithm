public class CountAndSay {


    public String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }
        String r = countAndSay(n - 1);
        char[] charArr = r.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();
        char cNow = 0;
        int count = 0;
        int i = 0;
        while (i < charArr.length) {
            if (count == 0) {
                cNow = charArr[i];
                count ++;
                ++i;
                continue;
            }
            if (cNow == charArr[i]) {
                count++;
                ++i;
                continue;
            }
            resultBuilder.append(count).append(cNow);
            cNow = charArr[i];
            count = 1;
            ++i;
        }
        resultBuilder.append(count).append(cNow);
        return resultBuilder.toString();
    }
}
