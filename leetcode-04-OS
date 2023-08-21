/*
Median of two sorted arrays
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i=0;
        int j=0;
        int k=0;

        int[] merge= new int[nums1.length+ nums2.length];

        // merging two array in sorted order

        while( i< nums1.length && j < nums2.length){

            if( nums1[i] <= nums2[j]){

                merge[k]= nums1[i];
                i++;
                k++;

            }else{

                merge[k]= nums2[j];
                j++;
                k++;

            }
        }

        // adding remaining elements

        while( i < nums1.length){

            merge[k]= nums1[i];
            i++;
            k++;

        }
        while( j < nums2.length){

            merge[k] = nums2[j];
            j++;
            k++;

        }

        int n = merge.length;
        double median = 0.0;

        if(n %2 == 0){

            median = (merge[(n-1)/2]+ merge[n/2])/2.0;

        }else{

            median = merge[n/2];

        }

        return median;
    }
}
