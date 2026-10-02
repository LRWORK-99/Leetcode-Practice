class LongestRepeatingCharacterReplacement {
    public int lengthOfLongestSubstring(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int length = 0;
        int left = 0;
        int best = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int count = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), count);
            }

            length++;

            while (!(length - Collections.max(map.values()) <= k)) {
                int count = map.get(s.charAt(left)) - 1;
                map.put(s.charAt(left), count);
                length--;
                left++;
            }

            if (best < length) {
                best = length;
            }
        }

        return best;
    }
}