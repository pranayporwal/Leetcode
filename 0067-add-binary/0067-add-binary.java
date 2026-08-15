class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            int x = a.charAt(i) - '0';
            int y = (j >= 0)
                    ? b.charAt(j--) - '0'
                    : 0;
            int sum = x + y + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        while (j >= 0) {
            int sum = (b.charAt(j--) - '0') + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}