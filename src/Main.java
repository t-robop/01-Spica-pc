import util.SpicaWrapper;

public class Main {

    public static void main(String[] args) {
        SpicaWrapper spica = new SpicaWrapper("192.168.1.101",50000);


        //////////////////この下にプログラムを書こう！/////////////////////
        spica.loopStartBlock(2);
        spica.front(1000,100);
        spica.back(1000,80);
        spica.loopEndBlock();

        // しきい値 int型, 以上以下 String型
        //spica.ifStartBlock(20,"up");
        //spica.left(1000,100);
        //spica.elseBlock();
        //spica.right(1000,100);
        //spica.ifEndBlock();
        //spica.back(1500,100);

        ///////////////////////////ここまで！///////////////////////////

        spica.run();
    }
}
