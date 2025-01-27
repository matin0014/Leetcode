class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int most = 0;
        while (i < j) {
            System.out.println(j);
            int water = (j - i) * Math.min(heights[i], heights[j]);
            most = Math.max(most, water);
            System.out.println(most);
            if (heights[j] > heights[i])
                i++;
            else if (heights[i] > heights[j])
                j--;
            else {
                i++;
                j--;
            }

        }
        return most;
    }

}
