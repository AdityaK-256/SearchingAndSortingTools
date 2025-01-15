class LS{
    public static void main(){
        int ar[] = {9,3,5,2,7,3,6};
        int point = 3;
        System.out.println("Index: ");
        for(int i = 0; i<ar.length-1; i++){
            if(ar[i]==point){
                
                System.out.print(i+",");
                //break;
            }
        }
    }
}