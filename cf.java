class Solution {
    public int maximumCount(int[] nums) {
        int negCt = binarySearch(nums, 0);
        int posCt = nums.length - binarySearch(nums, 1);
        return Math.max(negCt, posCt);
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1, res = nums.length;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                res = mid;
                right = mid - 1;
            }
        }
        
        return res;
    }
}