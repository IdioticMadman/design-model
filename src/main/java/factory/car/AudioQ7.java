package factory.car;

public class AudioQ7 extends AudioCar {
    @Override
    public void driver() {
        System.out.println("Q7 启动啦！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7 开启自动巡航");
    }
}
