class insertion{
    public static void main(String [] args){
        int ar[] = {7,6,3,5,2,4,1};
        for(int x = 1; x<ar.length;x++){
            int y= x-1;
            int current = ar[x];
            while(y>=0&&ar[y]>current){
                ar[y+1]=ar[y];
                y--;
            }
            ar[y+1] = current;
        }
        for(int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}