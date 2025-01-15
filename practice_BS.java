class practice_BS{
    public static void main(String [] args){
        int ar[] = {12,23,34,45,56,69,77};
        int ub = ar.length-1;
        int lb= 0;
        int mid = 0;
        int t = 12;
        int pos = 0;
        boolean flag = false;
        while(ub>=lb){
            mid = (ub+lb)/2;
            if(t>ar[mid]){
                lb = mid+1;
            }
            else if(t<ar[mid]){
                ub = mid-1;
            }
            else if(ar[mid]==t){
                flag = true;
                pos = mid;
                break;
            }
        }
        if(flag){
            System.out.println("Number is found at index: "+pos);
        }
        else{
            System.out.println("Number is not found.");
        }
    }
}