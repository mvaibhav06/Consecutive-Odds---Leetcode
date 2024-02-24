public class ConsecutiveOdds {
    public static boolean containConsecutiveOdds(int[] nums){
        int counter = 0;
        boolean previousOdd = true;

        for (int i=0; i< nums.length; i++){
            if (nums[i]%2 != 0){
                if (previousOdd){
                    counter++;
                }else {
                    counter = 1;
                    previousOdd = true;
                }
                if (counter == 3) return true;
            }else {
                previousOdd = false;
                counter = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,1};
        System.out.println(containConsecutiveOdds(nums));
    }
}
