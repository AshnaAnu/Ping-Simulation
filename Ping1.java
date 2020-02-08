import java.io.*;
import java.net.*;
class Ping1
{
    public static void main(String[]args)throws UnknownHostException,IOException
    {
        String ipAddress="127.0.0.1";
        InetAddress inet=InetAddress.getByName(ipAddress);
        System.out.println("sending ping request to"+ipAddress);
        System.out.println(inet.isReachable(5000)?"host is reachable":"host is not reachable");
        ipAddress="192.168.3.50";
        inet=InetAddress.getByName(ipAddress);
        System.out.println("sending ping request to"+ipAddress);
        System.out.println(inet.isReachable(5000)?"host is reachable":"host is not reachable");

    }
}