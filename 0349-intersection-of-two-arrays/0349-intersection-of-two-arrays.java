class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p = Math.max(nums1.length, nums2.length);
        int[] arr = new int[p];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;

            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] == nums2[j]) {
                if (k == 0 || arr[k - 1] != nums1[i]) {
                    arr[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            }
        }
        return Arrays.copyOf(arr, k);
    }
}