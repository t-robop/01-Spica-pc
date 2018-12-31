package model;

/**
 * Created by yuusuke on 2018/11/28.
 */
public class BlockModel {
    private String id;
    private int pos;
    //if
    private int ifState = 0;
    //ブロック
    private SpicaBlock block;

    private int speed = 0;
    //ブロック毎の値
    //private int time = 0;
    private boolean isInLoop=false;

    // センサーの距離
    int value = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }


    public SpicaBlock getBlock() {
        return block;
    }

    public void setBlock(SpicaBlock block) {
        this.block = block;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTime() {
        return value;
    }

    public void setTime(int value) {
        // 入力上は1000秒で1秒だが、ロボット側では、10で1秒のため
        this.value = value / 100;
    }

    public boolean isInLoop() {
        return isInLoop;
    }

    public void setInLoop(boolean inLoop) {
        isInLoop = inLoop;
    }


    // ifで使うsensor距離を入れる
    public void setValue(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }


    // ifで使うそのBlockがif trueなのか falseなのか
    public int getIfState() {
        return ifState;
    }
    public void setIfState(int ifState) {
        this.ifState = ifState;
    }

// ifで使う以上以下の分岐
    public int getIfGreaterOrLess() {
        return speed;

    }
    public void setIfGreaterOrLess(int value) {
        this.speed = value;
    }


    public enum SpicaBlock {
        FRONT(1),
        BACK(2),
        LEFT(3),
        RIGHT(4),
        FOR_START(5),
        FOR_END(6),
        IF_START(7),
        IF_END(8),
        BREAK(9),
        START(10),
        END(11),
        ELSE(12);

        private final int id;

        SpicaBlock(final int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }
}
