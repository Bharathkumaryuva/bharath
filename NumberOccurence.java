import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOccurence{
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = no.nextLine();
        Map<String,Integer> hashmMap = new HashMap<String,Integer>();

        String[] words =str.split(" ");
        for(String word : words ){
            Integer integer = hashmMap.get(word);
            if(integer == null){
                hashmMap.put(word, 1);
            }
            else{
                hashmMap.put(word, integer+1);
            }
        }
        System.out.println(hashmMap);

        
    }
}