package model;

/**
 * Created by yuusuke on 2018/11/28.
 */
public class BlockModel {
    private String id;
    private int ifState = 0;
    private SpicaBlock block;

    // 速度やifの<>を入れる
    private int value1 = 0;

    // センサーの距離
    int value2 = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SpicaBlock getBlock() {
        return block;
    }

    public void setBlock(SpicaBlock block) {
        this.block = block;
    }

    public int getSpeed() {
        return value1;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.value1 = 0;
        } else if (speed > 255) {
            this.value1 = 255;
        } else {
            this.value1 = speed;
        }
    }

    public int getTime() {
        return value2;
    }

    public void setTime(int value) {
        // 入力上は1000秒で1秒だが、ロボット側では、10で1秒のため
        this.value2 = value / 100;
    }


    // ifで使うsensor距離を入れる
    public void setSensorValue(int value) {
        this.value2 = value2;
    }


    public int getSensorValue() {
        return value2;
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
        return value1;

    }

    public void setLoopNum(int loopNum) {
        this.value2 = loopNum;
    }

    // < > どちらかを決める 1なら> 2なら<
    public void setIfGreaterOrLess(int value) {
        this.value1 = value;
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
