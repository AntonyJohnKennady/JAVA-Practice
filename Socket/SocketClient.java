package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketClient  {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8888);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String msg = dataInputStream.readUTF();
        System.out.println("Server says : "+msg);

        dataInputStream.close();
        socket.close();
    }


}
