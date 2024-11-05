public class Median {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,2,4,5,6};
        System.out.println(findMedian(a,b));
    }
    public static double findMedian(int[] a, int[] b) {
        int size1 = a.length;
        int size2 = b.length;

        if (size1 > size2) {
            return findMedian(b, a);
        }

        int left = (size1 + size2 + 1) / 2;
        int start = 0;
        int end = size1;

        while (start <= end) {
            int median = (start + end) / 2;
            int median2 = left - median;

            int l1 = (median > 0) ? a[median - 1] : Integer.MIN_VALUE;
            int r1 = (median < size1) ? a[median] : Integer.MAX_VALUE;
            int l2 = (median2 > 0) ? b[median2 - 1] : Integer.MIN_VALUE;
            int r2 = (median2 < size2) ? b[median2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if ((size1 + size2) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                end = median - 1;
            } else {
                start = median + 1;
            }
        }

        return 0.0;
    }
}
