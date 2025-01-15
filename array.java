class array{
    void add(int arr[]){
        for(int i = 0; i<arr.length; i++){
            arr[i]+=1;
        }
    }
    public static void main(String [] args){
        array obj = new array();
        int ar[] = {1,2,3,4,5};
        System.out.println("Array ar before executing method:");
        for(int j = 0; j<5; j++){
            System.out.print(ar[j]+",");
        }
        System.out.println();
        System.out.println("Array ar after executing method:");
        obj.add(ar);
        for(int k = 0;k<ar.length; k++){
            System.out.print(ar[k]+",");
        }
    }
}