package J12_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChar {
    // first non-repeating letter in a stream of characters (lowerCse) -> till every character

    public static void main(String[] args) {
        String s = "aabccxb";
        firstNonRepeating(s);
    }

    public static void firstNonRepeating(String str){
        int[] fre=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            fre[ch-'a']++;
            q.add(ch);
            while(!q.isEmpty() && fre[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 +" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
}
