class p2{
    public static void main(){
        for(int i= 5;i>=1;i--){
            for(int j= 5;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}