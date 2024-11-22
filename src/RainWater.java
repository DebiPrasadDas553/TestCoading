public class RainWater {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
       int totalStoreWater= RainWater.totalWater(heights);
       System.out.println("Total stored water is "+totalStoreWater);

    }
    public static int totalWater(int[]heights){
        int left=0;
        int right=heights.length-1;
        int leftMax=0;
        int rightMax=0;
        int totalAmout=0;

        while (left<right){
            if (heights[left]<heights[right]){
                if (heights[left]>=leftMax){
                    leftMax=heights[left];
                }
                else {
                    totalAmout=totalAmout+leftMax-heights[left];
                }
                left++;
            }

            else {
                if (heights[right]>rightMax){
                    rightMax=heights[right];
                }
                else {
                    totalAmout=totalAmout+rightMax-heights[right];
                }
                right--;
            }
        }
        return totalAmout;
    }
}
