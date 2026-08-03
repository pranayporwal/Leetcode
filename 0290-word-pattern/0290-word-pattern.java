class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> mapPS = new HashMap<>();
        HashMap<String, Character> mapSP = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char p = pattern.charAt(i);
            String word = words[i];

            if (mapPS.containsKey(p)) {

                if (!mapPS.get(p).equals(word)) {
                    return false;
                }

            } else {

                if (mapSP.containsKey(word)) {
                    return false;
                }

                mapPS.put(p, word);
                mapSP.put(word, p);
            }
        }

        return true;
    }
}