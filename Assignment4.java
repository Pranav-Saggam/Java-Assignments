import java.time.LocalDate;
import java.util.Scanner;
class Kyc{
    String[] input=new String[2];
    public void checkRange( String[][] s,int l){
             for(int k=0;k<l;k++){
                 input[0]=s[k][0];
                 input[1]=s[k][1];
            int day = Integer.parseInt(input[0].substring(0, 2));
            int month = Integer.parseInt(input[0].substring(3, 5));
            int year = Integer.parseInt(input[1].substring(6));
            LocalDate datePlus30 = LocalDate.of(year, month, day).plusDays(30);
            LocalDate dateMinus30 = datePlus30.minusDays(60);

            int curDay = Integer.parseInt(input[1].substring(0, 2));
            int curMonth = Integer.parseInt(input[1].substring(3, 5));
            LocalDate curDate = LocalDate.of(year, curMonth, curDay);
            if (curDate.isAfter(datePlus30)) {
                System.out.println(dateMinus30 + " " + datePlus30);
            } else if (curDate.isBefore(datePlus30) && curDate.isAfter(dateMinus30)) {
                System.out.println(dateMinus30 + " " + curDate);
            } else {
                System.out.println("No range");
            }

        }
    }


}
public class Assignment4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        String[][] str=new String[5][2];
        for(int i=0;i<r;i++){
            str[i][0]=sc.next();
            str[i][1]=sc.next();
        }

        Kyc check=new Kyc();
        check.checkRange(str,r);

    }

}
