public class double23 {
  public boolean double23(int[] nums) {
    if (nums.length == 0) {
      return false;
    } else if (nums.length == 1) {
      return false;
    } else if (nums.length == 2) {
      return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    } else {
      return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 2 && nums[2] == 2) ||
          (nums[1] == 2 && nums[2] == 2) || (nums[0] == 3 && nums[1] == 3) ||
          (nums[0] == 3 && nums[2] == 3) || (nums[1] == 3 && nums[2] == 3));
    }
  }

/* found online, a bit more concise ;-)
public boolean double23(int[] nums) {
   return (nums.length>1 && nums[0]==nums[1] && (nums[0]==2 || nums[0]==3));
}*/
}
