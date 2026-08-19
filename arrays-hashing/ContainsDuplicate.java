class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        /***
         * Brute forece method, works but not efficient - O(n²)
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
        ***/

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num)
        }
        return false;
    }
}