class bs{
    public static void main(String [] args){
        int ar[] = {9,5,2,7,3,6};
        int temp = 0;
        
        for(int i = 0; i<ar.length;i++){
            for(int j = 0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for(int k = 0; k<ar.length;k++){
            System.out.print(ar[k]+",");
        }
    }
}