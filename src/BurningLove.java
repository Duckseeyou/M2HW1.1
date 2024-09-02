public final class BurningLove extends Beer{

    private int temperature;

    public BurningLove(int strength, int volume, BeerKindsEnum kind, int temperature) {
        super(strength, volume, kind);
        this.temperature = temperature;
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("YOU WAS SET ON FIRE!");
    }

    public int getTemperature() {
        return temperature;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Temperature is " + this.getTemperature());
    }
}
