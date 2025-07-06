class k{
    int i;
    k(){
        i=0;
    }
    void print(){
        if(i<=5){
            i=i+1;
            System.out.println(i);
            print();
            //i=--i;
            System.out.println(i);
            i=i-1;
        }
    }
}