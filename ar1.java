class ar1{
    public static void main(){
        int ar[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(ar.length);
        for(int i= 0;i<=2;i++){
            for(int j= 0; j<=2;j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        System.out.println("Right");
        for(int i= 0;i<=2;i++){
            for(int j= 0; j<=2;j++){
                if(i+j==2){
                    System.out.print(ar[i][j]);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println("Left");
        for(int i= 0;i<=2;i++){
            for(int j= 0; j<=2;j++){
                if(i==j){
                    System.out.print(ar[i][j]);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        for(int i= 0;i<=2;i++){
            for(int j= 0; j<=2;j++){
                if(i==j){
                    System.out.print(ar[i][j]);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}