class SS{
    public static void main(){
        int ar[] = {9,3,5,2,7,3,6};
        int min = 0;
        int temp = 0;
        for(int i = 0; i<ar.length;i++){
            min = i;//minmilist index
            for(int j = i+1;j<ar.length;j++){
                if(ar[min]>ar[j]){
                    min = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        System.out.print("Sorted array: ");
        for(int k = 0; k<ar.length; k++){
            System.out.print(ar[k]+",");
        }
    }
}