package Arrays;
//Union of 2 sorted arrays that contains only unique elements
//arr1=[1,2,3,5,6]
//arr2=[1,2,3,4]
//union=[1,2,3,4,5,6]

import java.util.ArrayList;
import java.util.List;

public class UnionSortedArrays {

    public static void main(String[] args) {
         int nums1[]={1,2,3,5,6,7};
         int nums2[]={1,2,3,5,6};
         List<Integer> res=union(nums1,nums2);
        System.out.println(res);
    }
    static List<Integer>  union(int nums1[],int nums2[]){

        List<Integer> list=new ArrayList<Integer>();
        int a=nums1.length;
        int b=nums2.length;
        int i=0,j=0;
        while(i<a && j<b) {
            if (nums1[i] <= nums2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                j++;

            }
        }
            while(i<a){
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
            }

            while(j<b){
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                j++;
            }

return list;

    }




}
