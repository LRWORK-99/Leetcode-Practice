class ProductsOfArrayExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1]  * nums[i - 1];
        }

        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;

        /**
         * More optimized version:
         *
         * int[] result = new int[nums.length];
         *
         * // Pass 1: fill result with prefix products (same as before)
         * result[0] = 1;
         * for (int i = 1; i < nums.length; i++) {
         *     result[i] = result[i-1] * nums[i-1];
         * }
         *
         * // Pass 2: multiply in suffix products, using one running variable instead of an array
         * int suffix = 1;
         * for (int i = nums.length - 1; i >= 0; i--) {
         *     result[i] *= suffix;
         *     suffix *= nums[i];
         * }
         */
    }
}