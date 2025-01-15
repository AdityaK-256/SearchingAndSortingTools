class practice_SS{
    public static void main(String [] args){
        int ar[] = {9,3,5,2,7,3,6};
        int temp = 0;
        int min= 0;
        for(int i = 0;i<ar.length;i++){
            min=i;
            for(int j = i+1;j<ar.length;j++){
                if(ar[min]>ar[j]){
                    min=j;
                }
            }
            temp = ar[i];
            ar[i]=ar[min];
            ar[min] = temp;
        }
        System.out.println("Sorted array:");
        for(int i = 0;i<ar.length; i++){
            System.out.print(ar[i]+",");
        }
    }
}