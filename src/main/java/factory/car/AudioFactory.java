package factory.car;

public abstract class AudioFactory {

    public abstract <T extends AudioCar> T createAudioCar(Class<T> clazz);

}
