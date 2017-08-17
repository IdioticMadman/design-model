package factory.car;

public class AudioCatFactory extends AudioFactory {
    @Override
    public <T extends AudioCar> T createAudioCar(Class<T> clazz) {

        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
