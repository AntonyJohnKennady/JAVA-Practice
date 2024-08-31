package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String msg = "Hi CLient!";
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(),msg.length(),ip,1234);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();

    }
}
