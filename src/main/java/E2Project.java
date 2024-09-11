public class E2Project {
    public static void main(String[] args) {
        String s="Hello,World!!567";
        int alphaCount=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                alphaCount++;
            }

        }
       System.out.println("Number of alpha characters: " + alphaCount);

    }
}
