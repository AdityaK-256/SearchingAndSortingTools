/** 
 * In "ub>=lb" is "=" necessary
 * ∵ if point = 56, then,
 * in the last iteration lb = 4, ub = 4;
 * which will not be executed if "=" is not used in "ub>=lb".
 */

class binary{
    public static void main(String [] args){
        int ar[] = {12,23,34,45,56,69,77};
        int mid  = 0;
        int ub = ar.length-1;
        int lb = 0;
        int pos =0;
        int point = 56; 
        int flag = 0;
        while(ub>lb){
            mid = (ub + lb)/2;
            if(ar[mid]>point){
                ub = mid-1;
            }
            else if(ar[mid]<point){
                lb = mid+1;
            }
            else{
                pos = mid;
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("index: "+pos);
        }
        else{
            System.out.println("Not found.");
        }
    }
}