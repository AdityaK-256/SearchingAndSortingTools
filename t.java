class t{
    public static void main(String [] args){
        String s = "123";
        int h = 9834;
        char ch = '9';
        char ch1 = 'a';
        System.out.println(Integer.parseInt(s));
        System.out.println(Double.parseDouble(s));
        System.out.println(Integer.toString(h));
        System.out.println(String.valueOf(h));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isLetterOrDigit(ch));
        System.out.println(Character.isWhitespace(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.toUpperCase(ch1));
        int A = 'Z';
        System.out.println(A);
        System.out.println(s.startsWith("1"));
        System.out.println(s.endsWith("23"));
        System.out.println(Integer.valueOf(s));
    }
}