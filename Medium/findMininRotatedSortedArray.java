class Solution {
    public int findMin(int[] nums) {
    int l = 0, r = nums.length - 1, mid = (l+r)/2;
    while(l <= r){
        System.out.print("left (index: " + l +"): " + nums[l] +  " middle (index: " + mid +"): " + nums[mid] + " right (index: " + r +"): " + nums[r] + "\n");
      if(nums[l] < nums[r])
           return Math.min(nums[l], nums[r]);
           
      if(nums[l] < nums[mid]){
        l = mid;
        mid = (l+r) / 2;
      } else if(nums[mid] < nums[r]){
        r = mid;
        mid = (l+r) / 2;
      }
      if(mid == l || mid == r){
         System.out.print("left (index: " + l +"): " + nums[l] +  " middle (index: " + mid +"): " + nums[mid] + " right (index: " + r +"): " + nums[r] + "\n");
        return Math.min(nums[l], nums[r]);

      }
    }
    return -1;
    
    }
}
