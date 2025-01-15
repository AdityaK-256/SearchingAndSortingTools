import java.util.StringTokenizer;
import java.lang.Character;
class tokenizer{
    public static void main(String [] args){
        // // int ar[] = {9,3,5,2,7,3,6};
        // int ar[][] = new int[3][4];
        // System.out.println(ar[3].length);
        String s = "Hello! how are you?Nice.";
        StringTokenizer str = new StringTokenizer(s," .,!?");
        System.out.println(str.countTokens());
        // System.out.println(str.nextToken());
        // System.out.println(str.hasMoreTokens());
        // System.out.println(str.hasMoreElements());
        // System.out.println(str.nextToken());
        // System.out.println(str.hasMoreTokens());
        // System.out.println(str.hasMoreElements());
        int i = 0;
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
            i++;
        }
        System.out.println(str.countTokens());
        //System.out.println(Character.isVowel('A'));
    }
}