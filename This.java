class This{
    int a;
    /*void fun1(){
        a = 9;
        System.out.println(a);
    }
    void fun2(){
        System.out.println(a);
    }*/
    void print(int a , int b){
        System.out.println("h"+a+b);
        System.out.println("h"+this.a+b);
    }
    public static void main(){
        This ob = new This();
        ob.print(3,4);
        long v = 9;
        Integer obj = new Integer(9);
        
    }
}