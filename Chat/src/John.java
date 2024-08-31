import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class John extends Frame implements Runnable,ActionListener {
    TextField textField ;
    TextArea textArea;
    Button send;
    Socket socket;
    ServerSocket serverSocket;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    Thread chat;

    John(){
        textField = new TextField();
        textField.setBounds(50,50,400,30);
        textArea = new TextArea();
        textArea.setBounds(50,100,400,400);
        send = new Button("send");
        send.setBounds(400,500,50,20);

        send.addActionListener(this);
        try{
            serverSocket = new ServerSocket(12000);
            socket = serverSocket.accept();


            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
        }catch (Exception e){

        }


        add(textField);
        add(textArea);
        add(send);

        chat = new Thread(this);
        chat.setDaemon(true);
        chat.start();

        setTitle("John");
        setLayout(null);
        setSize(600,600);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        String msg = textField.getText();
        textArea.append("John: "+ msg +"\n");
        textField.setText("");
        try {
            dataOutputStream.writeUTF(msg);
            dataOutputStream.flush();
        }catch (Exception E){

        }
    }
    public static void main(String[] args) {
        new John();
    }

    public void run() {
        while(true){
        try {
            String msg = dataInputStream.readUTF();
            textArea.append("Aval: "+msg+"\n");
        }catch (Exception e){

        }

    }

    }



}
