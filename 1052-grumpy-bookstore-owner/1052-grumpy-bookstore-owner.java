class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int base = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }
        int gain = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                gain += customers[i];
            }
        }
        int bestGain = gain;
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                gain += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                gain -= customers[i - minutes];
            }
            bestGain = Math.max(bestGain, gain);
        }
        return base + bestGain;
    }
}