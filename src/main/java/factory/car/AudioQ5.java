package factory.car;

public class AudioQ5 extends AudioCar {
    @Override
    public void driver() {
        System.out.println("Q5 启动啦！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5 开启自动巡航");
    }
}
