public class Ques1 {
        public static boolean increasingTriplet(int[] nums) {
            if(nums.length<3){
                return false;
            }
            for(int i=0;i<nums.length-2;i++){
                int currentEle=nums[i];
                int firstEle=nums[i+1];
                int secEle=nums[i+2];
                if(currentEle<firstEle && firstEle<secEle){
                    return true;
                }

            }
            return false;
        }

    public static void main(String[] args) {
        int[] nums = {5,6,7,2,1};
        boolean result= Ques1.increasingTriplet(nums);
        System.out.println(result);
    }
    }

