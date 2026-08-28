class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            map.get(sortedKey).add(str);
        }

        List<List<String>> result = new ArrayList<>(map.values());

        return result;

        /**
         * More optimal method to avoid sorting, use counting instead:
         *
         *     public List<List<String>> groupAnagrams(String[] strs) {
         *         Map<String, List<String>> res = new HashMap<>();
         *         for (String s : strs) {
         *             int[] count = new int[26];
         *             for (char c : s.toCharArray()) {
         *                 count[c - 'a']++;
         *             }
         *             String key = Arrays.toString(count);
         *             res.putIfAbsent(key, new ArrayList<>());
         *             res.get(key).add(s);
         *         }
         *         return new ArrayList<>(res.values());
         *     }
         */

    }
}