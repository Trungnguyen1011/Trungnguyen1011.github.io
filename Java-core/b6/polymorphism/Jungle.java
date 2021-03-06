package polymorphism;

import java.util.ArrayList;

interface Swim {
    void breathUnderWater();

    void swim();
}

interface Fly {
    void flapWings();

    void fly();
}

// https://youtu.be/bk7McNUjWgw
// Cá chuồn
class FlyingFish implements Swim, Fly {

    @Override
    public void breathUnderWater() {
        System.out.println("Cá chuồn thở dưới mặt nước");
    }

    @Override
    public void swim() {
        System.out.println("Cá chuồn bơi rất nhanh");
    }

    @Override
    public void flapWings() {
        System.out.println("Cá chuồn vẫy đôi cánh");
    }

    @Override
    public void fly() {
        System.out.println("Cá chuồn có thể bay xa 100 mét trên mặt nước");
    }

}

class Dolphin implements Swim {

    @Override
    public void breathUnderWater() {
        System.out.println("Cá heo thở dưới mặt nước");

    }

    @Override
    public void swim() {
        System.out.println("Cá heo bơi rất nhanh");
    }

}

class Eagle implements Fly {

    @Override
    public void flapWings() {
        System.out.println("Đại bàng vẫy đôi cánh");
    }

    @Override
    public void fly() {
        System.out.println("Đại bàng có thể bay cao 10000 mét trên mặt nước");
    }

}

public class Jungle {

    FlyingFish flyingFish = new FlyingFish();
    Dolphin dolphin = new Dolphin();
    Eagle eagle = new Eagle();

    ArrayList<Swim> swimAnimals = new ArrayList<>();
    ArrayList<Fly> flyAnimals = new ArrayList<>();

    public Jungle() {
        swimAnimals.add(flyingFish);
        swimAnimals.add(dolphin);
        flyAnimals.add(eagle);
        flyAnimals.add(flyingFish);
    }

    public void simulate() {
        for (Swim i : swimAnimals) {
            i.breathUnderWater();
            i.swim();
        }

        for (Fly object : flyAnimals) {
            object.flapWings();
            object.fly();
        }
    }
}