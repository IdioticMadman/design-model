package factory.car;

public class AudioQ3 extends AudioCar {
    @Override
    public void driver() {
        System.out.println("Q3 启动啦！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q3 开启自动巡航");
    }
}
