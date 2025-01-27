class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int length = 0, longest = 0;
        HashSet<Character> set = new HashSet<>();
        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));

                length = r - l + 1;
                longest = Math.max(longest, length);
                r++;
            } else {

                set.remove(s.charAt(l));
                l++;

            }
        }
        return longest;
    }
}
