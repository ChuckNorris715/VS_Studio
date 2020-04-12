package ch5;

class stringWords {
    public static void main(String[] args) {
        String str = "Mary had a little lamp";
        int c = countWords(str);
        System.out.println("Words : " + c);
    }
    
    private static int countWords(String aStr) {
        String temp[] = aStr.split(" ");
        int c = 0;
        for (String s : temp) {
            if (s.length() > 0)
                c++;
        }
        return c;
    }
}
