package builder;

public class Director {

    private Builder mBuilder = null;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder
                .buildBoard(board)
                .buildDisplay(display)
                .buildOs();
    }
}
