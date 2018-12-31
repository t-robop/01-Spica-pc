import util.SpicaWrapper;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //UdpSend udpSend = new UdpSend("192.168.10.38",10000);
        //udpSend.UdpSendText("aaaaaaaaaaaa");
        SpicaWrapper spica = new SpicaWrapper("192.168.1.126",10000);


        //////////////////////////////////////////////////////
        spica.front(1000,100);
        spica.back(2000,80);

        // しきい値 int型, 以上以下 String型
        //spica.ifStartBlock(20,"up");
        spica.left(1000,100);
        //spica.elseBlock();
        spica.right(2000,100);
        //spica.ifEndBlock();
        spica.back(1500,100);




        /////////////////////////////
        spica.run();
    }
}
