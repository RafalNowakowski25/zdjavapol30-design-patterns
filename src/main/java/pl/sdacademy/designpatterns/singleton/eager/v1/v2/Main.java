package pl.sdacademy.designpatterns.singleton.eager.v1.v2;

public class Main {
    public static void main(String[] args) {
        Universe universe = Universe.INSTANCE;
        System.out.println(universe == Universe.INSTANCE);
    }
}
