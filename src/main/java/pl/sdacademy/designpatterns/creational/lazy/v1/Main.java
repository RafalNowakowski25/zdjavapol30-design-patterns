package pl.sdacademy.designpatterns.creational.lazy.v1;

public class Main {
    public static void main(String[] args) {
        Universe universe = Universe.getInstance();
        System.out.println(universe == Universe.getInstance());
    }
}