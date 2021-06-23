
import java.util.Scanner;
// Algorithm's time complexity is O(N)
class CheckAllAlphabets{
    int[] asci=new int[26];
    int flag=0;
    public void check(String input){
        char[] ch=input.toCharArray();
        for(char i: ch){
            int j=(int)i;
            if(j>=97 && j<=122){
                asci[j-97]=1;
            }
        }
        for(int i:asci){
            if(i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("It contains all alphabets");
        }
        else{
            System.out.println("It does not contain all alphabets");
        }
    }
}


public class Assignment2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String input=sc.nextLine().toLowerCase();
        CheckAllAlphabets ch=new CheckAllAlphabets();
        ch.check(input);

    }
}
