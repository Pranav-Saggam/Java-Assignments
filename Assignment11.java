import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment11 {

    public static void main(String[] args) throws IOException {
        HashMap<Character,Integer> count = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name");
        String file=sc.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String readLine = bufferedReader.readLine();
        while(readLine!=null){
            for (char c:readLine.toCharArray()){
                count.put(c, count.getOrDefault(c,0)+1);
            }
            readLine=bufferedReader.readLine();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));
        for(Character c:count.keySet()){
            bufferedWriter.append(c+" "+count.get(c));
            bufferedWriter.append("\n");
        }
        bufferedWriter.close();
    }
}
