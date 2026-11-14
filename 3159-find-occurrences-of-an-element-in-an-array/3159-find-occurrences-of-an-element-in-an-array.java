class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        int[] arr = new int[queries.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                count++;
                map.put(count, i);
            }
        }

        for (int j = 0; j < queries.length; j++) {
            arr[j] = map.getOrDefault(queries[j], -1);
        }

        return arr;
    }
}