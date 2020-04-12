package ch5;

class avgWords {
    public static void main(String[] args) {
        String str = "Mary had a little lamp";
        int c = countWords(str);
        double avg = averageLength(str);
        System.out.println("Words : " + c);
        System.out.println("Average length of words : " + avg);
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

    private static double averageLength(String aStr) {
        String temp[] = aStr.split(" ");
        double count = 0, totalLength = 0;
        for (String s : temp) {
            if (s.length() > 0) {
                count++;
                totalLength += s.length();
            }
        }
        return totalLength / count;
    }
}
