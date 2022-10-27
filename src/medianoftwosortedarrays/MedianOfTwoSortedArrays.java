/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medianoftwosortedarrays;

import javax.print.attribute.standard.MediaSize;

/**
 *
 * @author Reazul-System
 */
public class MedianOfTwoSortedArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums1[] = new int[6];
        nums1[0] = 4;
        nums1[1] = 7;
        nums1[2] = 11;
        nums1[3] = 15;
        nums1[4] = 19;
        nums1[5] = 22;
        
        int nums2[] = new int[7];
        nums2[0] = 3;
        nums2[1] = 6;
        nums2[2] = 8;
        nums2[3] = 10;
        nums2[4] = 13;
        nums2[5] = 17;
        nums2[6] = 20;
        
        Solution solution = new Solution();
        double median = solution.findMedianSortedArrays(nums1, nums2);
        
        System.out.println("Median of Two Sorted Array is: " + median);
    }
}
