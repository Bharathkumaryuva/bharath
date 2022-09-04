import java.util.Scanner;

public class duplicateLetter {
    public static void main(String[] args) {
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = s.nextLine();
        char[] cA = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if(cA[i]== cA[j]){
                    System.out.print(cA[j]+ " ");
                    count = count +1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

