package util;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by yuusuke on 2018/11/28.
 */
public class UdpSend {

    private String ip = "192.168.1.7";
    private int port = 10000;
    private InetAddress inetAddress;
    private byte[] buff;
    private DatagramSocket socket;
    private DatagramPacket packet;
    private Thread sendTextThread;


    public UdpSend(String ip, int port){
        // 読み込み
        this.ip = ip;
        this.port = port;
    }

    public void UdpSendText(String sendText){
        try {
            buff = sendText.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }
        sendTextThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    inetAddress = InetAddress.getByName(ip);
                    socket = new DatagramSocket();
                    packet = new DatagramPacket(
                            buff,
                            buff.length,
                            inetAddress,
                            port
                    );
                    socket.send(packet);
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        sendTextThread.start();
    }
}