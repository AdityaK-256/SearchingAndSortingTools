class octal{
    int oct;
    //int n;
    octal(){
        oct=0;
        
    }
    void dectoOct(int n){
        if(n!=0){
            //oct = n%8+(dectoOct(n/8)*10);
            oct = oct+((n%8)*10);
            n=n/8;
        }
    }
    void display(){
        dectoOct(100);
        System.out.println(oct);
    }
}