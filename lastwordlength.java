/*
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*/

public class lastwordlength {
public static int lengthofword(String s1){
    int lengthoftheword=0;
    String word=s1.trim();
    String []word2=word.split(" ");
    int lenght=word2.length-1;
    return  word2[lenght].length();
}
    public static void main(String[] args) {
        String s ="   fly me   to   the moon  ";
int lengthoftheword=lengthofword(s);
System.out.println(lengthoftheword);

    }
}
