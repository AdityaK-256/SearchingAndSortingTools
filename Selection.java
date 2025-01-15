class Selection{
    public static void main(String [] args){
        int ar[] = {5,7,2,9,4,1,10,3};
        int min = 0, temp = 0;
        
        for(int i = 0; i<ar.length;i++){
            min = i;
            for(int j = i+1;j<ar.length;j++){
                if(ar[min]>ar[j]){
                    min = j;
                }
            }
            
            temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
            
        }
        System.out.println("Sorted array: ");
        for(int k = 0; k<ar.length;k++){
            System.out.print(ar[k]+",");
        }
    }
}