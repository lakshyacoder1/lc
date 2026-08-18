class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                list1.add(nums[i]);
            } else if (nums[i] == pivot) {
                list2.add(nums[i]);
            } else {
                list3.add(nums[i]);
            }
        }
        list1.addAll(list2);
        list1.addAll(list3);
        int[] arr = new int[list1.size()];

        for (int i = 0; i < list1.size(); i++) {
            arr[i] = list1.get(i);
        }

        return arr;

    }
}