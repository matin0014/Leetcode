class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums)
            set.add(i);
        int longest = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                while (set.contains(i + count))
                    count++;
                longest = Math.max(longest, count);
            }

        }
        System.out.println(set);
        return longest;
    }
}
