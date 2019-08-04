/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.*/
public class Merge {

    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        for (int k = m + n - 1; k >= 0; k--) {
            if (i < 0) A[k] = B[j--];
            else if (j < 0) A[k] = A[i--];
            else if (A[i] < B[j]) A[k] = B[j--];
            else A[k] = A[i--];
        }
    }
}
