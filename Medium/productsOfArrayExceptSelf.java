class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> pref = new ArrayList<>();
        int[] suff = new int[nums.length];

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                pref.add(nums[i]);
            } else {
                pref.add(nums[i] * pref.get(i - 1));
            }
        }
        System.out.println(pref.toString());

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1)
                suff[i] = nums[i];
            else
                suff[i] = nums[i] * suff[i + 1];

            System.out.println(suff[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                ans[i] = suff[i + 1];
            else if (i == nums.length - 1)
                ans[i] = pref.get(i - 1);
            else
                ans[i] = pref.get(i - 1) * suff[i + 1];
        }

        return ans;
    }
}
