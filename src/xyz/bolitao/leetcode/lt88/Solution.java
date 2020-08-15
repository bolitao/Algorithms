package xyz.bolitao.leetcode.lt88;

import java.util.Arrays;

/**
 * @author bolitao
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        List<Integer> list = new ArrayList<>(m + n);
//        for (int value : nums1) {
//            list.add(value);
//        }
//        for (int v : nums2) {
//            list.add(v);
//        }
//        System.out.println(list);
        int total = n + m;
        int[] tmp = new int[total];
        int index = 0;
        for (int v : nums1) {
            if (0 == v) {
                return;
            }
            tmp[index] = v;
            index++;
        }
        for (int v : nums2) {
            if (0 == v) {
                return;
            }
            tmp[index] = v;
            index++;
        }
        Arrays.sort(tmp);
        System.out.println(Arrays.toString(tmp));
    }
}
