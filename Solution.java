class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length+nums2.length;
        int ar[] = new int[l];
        double median = 0;
        int temp = 0;
        
            for(int j = 0;j<nums1.length;j++){
                
                    ar[j]=nums1[j];
                    
                
            }
            for(int a = 0;a<nums2.length;a++){
                
                    ar[a]=nums2[a];
                    
                
            }
            System.out.println();
                for(int i = 0; i<l;i++){
        System.out.print(ar[i]+",");
        }
            for(int i = 0; i<l;i++){
                for(int k = 0;k<l-1-i;k++){
                    if(ar[k]>ar[k+1]){
                        temp=ar[k];
                        ar[k]=ar[k+1];
                        ar[k+1]=temp;

                    }
                }
            }
            System.out.println();
            for(int i = 0; i<l;i++){
        System.out.print(ar[i]+",");
        }
        if(l%2==0){
            median = ((ar[(l/2)-1]+ar[(l/2)+1-1])/2.0);
            
        }
        else{
            median = ar[(l+1/2)-1];
        }
        //System.out.println(median);
        return median;
    }
    
}