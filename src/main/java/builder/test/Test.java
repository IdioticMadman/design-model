package builder.test;

import builder.Builder;
import builder.Director;
import builder.MacBookBuilder;

public class Test {

    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示器");
        String computerInfo = builder.create().toString();
        System.out.println(computerInfo);
    }
}
