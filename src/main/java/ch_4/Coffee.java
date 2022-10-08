package ch_4;

public class Coffee extends Beverage {

    @Override
    protected void boilWater() {
        super.boilWater();
    }

    @Override
    protected void pourInCup() {
        super.pourInCup();
    }

    public void brewCoffeeGrinds() {
        System.out.println("필터를 활용해 커피를 내린다.");
    }

    public void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가한다.");
    }
}
