// Java Program to Ping an IP address
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Assignment3
{
    // Sends ping request to a provided IP address
    public static void sendPingRequest(String ipAddress)
            throws UnknownHostException, IOException {
        ArrayList<Long> time=new ArrayList<>();
        InetAddress geek = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to " + ipAddress);
        long currentTime = System.currentTimeMillis();

        if (InetAddress.getByName(ipAddress).isReachable(5000) ) {
            System.out.println("pinged successfully in " + currentTime );
            currentTime = System.currentTimeMillis() - currentTime;
            time.add(currentTime);
        } else {
            System.out.println("PIng failed.");
            return;
        }
        printMedian(time);
    }
    public static void printMedian(ArrayList<Long> time){
        Collections.sort(time);
        int l = time.size();
        Double median=(double)time.get(0);
        if(l>1)
        median = (double) (time.get(l/ 2) + time.get((l / 2) + 1)) / 2;
        System.out.println("Median is"+median);
    }
    // Driver code
    public static void main(String[] args)
            throws UnknownHostException, IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter host name to ping");
        String ipAddress = sc.nextLine();
        sendPingRequest(ipAddress);
    }
}
