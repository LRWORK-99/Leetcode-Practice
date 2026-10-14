class SearchA2DMatrix{
    public boolean searchMatrix(int[][] matrix, int target){
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int low = 0;
        int high = rowLength * colLength - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            int row = mid / colLength;
            int col = mid % colLength;
            if (matrix[row][col] == target){
                return true;
            } else if (matrix[row][col] < target){
                low = mid + 1;
            } else { //matrix[row][col] > target
                high = mid - 1;
            }
        }

        return false;
    }
}