/*

Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.


 */

public class Challenge3 {
    public static String highScore(String text){
        int max =0;
        String result = "";

        for (String word: text.split(" ")){
            int total = 0;
            for (char x : word.toCharArray()){
                total += x - 96;
            }
            if (total > max){
                max = total;
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "if two words score the same return the word that appears earliest in the original string";
        System.out.println(highScore(a));
    }
}
