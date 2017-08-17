package builder;

public class MacBookBuilder extends Builder {
    private Computer mComputer = new MacBook();

    @Override
    public Builder buildBoard(String board) {
        mComputer.setBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setDisplay(display);
        return this;
    }

    @Override
    public Builder buildOs() {
        mComputer.setOs();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}