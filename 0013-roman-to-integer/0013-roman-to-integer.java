class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int cur = getRoman(s.charAt(i));
            int next = getRoman(s.charAt(i + 1));

            if (cur < next) {
                sum -= cur;
            } else {
                sum += cur;
            }
        }

        // Add the last Roman numeral
        sum += getRoman(s.charAt(s.length() - 1));

        return sum;
    }

    private int getRoman(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}