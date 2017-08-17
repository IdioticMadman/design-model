package factory.car;

public class Client {

    public static void main(String[] args) {

        AudioFactory audioFactory = new AudioCatFactory();

        AudioQ3 audioCar = audioFactory.createAudioCar(AudioQ3.class);
        audioCar.driver();
        audioCar.selfNavigation();
        AudioQ5 audioCar5 = audioFactory.createAudioCar(AudioQ5.class);
        audioCar5.driver();
        audioCar5.selfNavigation();
        AudioQ7 audioCar7 = audioFactory.createAudioCar(AudioQ7.class);
        audioCar7.driver();
        audioCar7.selfNavigation();
    }
}
