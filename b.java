class b{
    public static void main(){
        int ar[]  = {12,23,34,45,56,69,77};
        int t = 69;
        int mid=0,lb = 0,ub = ar.length-1,pos = 0,flag = 0;
        
        while(lb<=ub){
            mid = (lb+ub)/2;
            if(ar[mid]>t){
                ub = mid-1;
            }
            else if(ar[mid]<t){
                lb = mid+1;
            }
            else{
                pos = mid;
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Not found");
        }
        else{
            System.out.println(t+"found at index: "+pos);   
        }
    }
}