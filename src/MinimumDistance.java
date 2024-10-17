public class MinimumDistance {
    public static void main(String[] args) {

        String str = "the quick the brown quick brown frog the frog";
        String word1 = "quick";
        String word2 = "frog";
        Integer mindist = MinimumDistance.minimumDistance(str, word1, word2);
        System.out.println("Minimu distance is"+" "+mindist);

    }
    public static Integer minimumDistance(String str, String str1, String str2){
        //first check str 1and str2 is present or not
        int index1=-1;
        int index2=-1;
        int minDis=Integer.MAX_VALUE;
        String[] words = str.split(" ");
        for (int i=0;i<words.length;i++){
            if (words[i].equals(str1)){
                index1=i;
            }
            if (words[i].equals(str2)){
                index2=i;
            }
            if (index1!=-1&&index2!=-1){
               minDis = Math.min(minDis,Math.abs(index1-index2)-1);

            }
        }
        if (minDis==Integer.MAX_VALUE){
            return -1;
        }
        else

        return minDis;
    }
}
