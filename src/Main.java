import util.SpicaWrapper;

public class Main {

    public static void main(String[] args) {
        SpicaWrapper spica = new SpicaWrapper("192.168.10.101",10000);


        //////////////////この下にプログラムを書こう！/////////////////////
        spica.loopStart(2);
        spica.front(1000,100);
        spica.back(1000,80);
        spica.loopEnd();

        // しきい値 int型, 以上以下 String型
        //spica.ifStart(20,"up");
        //spica.left(1000,100);
        //spica.ifElse();
        //spica.right(1000,100);
        //spica.ifEnd();
        //spica.back(1500,100);


        ///////////////////////////ここまで！///////////////////////////

        spica.run();
    }
}
