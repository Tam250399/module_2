public class test {
    public static void main(String[] args) {
        tv tv1 = new tv();
        tv1.TurnOn();
        tv1.setChanner(20);
        tv1.setVolumeLevel(5);

        tv tv2 = new tv();
        tv2.TurnOff();
        tv2.channelUp();
        tv2.channelDown();
        tv2.volumeUp();
        tv2.volumeDown();
        System.out.println("tv1 channel is" + tv1.channer + "and volume level is" + tv1.volumeLevel);
        System.out.println("tv1 channel is" + tv2.channer + "and volume level is" + tv2.volumeLevel);
    }
}
