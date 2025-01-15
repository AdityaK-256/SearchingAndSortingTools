class l{
    public static void main(String [] args){
        int ar[] = {9,3,5,2,7,3,6};
        int t = 5;
        int flag = 0;
        int pos = 0;
        for(int i = 0; i<ar.length; i++){
            if(ar[i]==t){
                flag = 1;
                pos = i;
                break;
            }
        }
        if(flag ==1){
            System.out.println("Found at: " +pos);
        }
        else{
            System.out.println("Not Found");
        }
    }
}