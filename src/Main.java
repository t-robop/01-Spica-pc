import util.SpicaWrapper;

public class Main {

    private static void write(SpicaWrapper spica) {
        //////////////////この下にプログラムを書こう！/////////////////////





        ///////////////////////////ここまで！///////////////////////////
    }

    public static void main(String[] args) {
        //このメソッド内がユーザーに見えないようにしてください
        SpicaWrapper spica = new SpicaWrapper("192.168.1.101",50000);
        write(spica);
        spica.run();
    }
}
