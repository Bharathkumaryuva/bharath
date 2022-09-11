import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter any sentence");
        String input = a.nextLine();
        System.out.println("enter the character");
        char search = a.nextLine().charAt(0);

        int count = 0;
        for (int i =0; i<input.length();i++){
            if(input.charAt(i) == search){
                count++;
            }
        }
        System.out.println("The character " + search + "appears " + count +" times.");

    }
}
