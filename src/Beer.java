public class Beer extends Alcohol {

    private int strength;
    private int volume;
    private BeerKindsEnum kind;

    public Beer(int strength, int volume, BeerKindsEnum kind) {
        this.strength = strength;
        this.volume = volume;
        this.kind = kind;
    }

    public void drink(){
        System.out.println("You have drunk " + this.volume + " ml of beer");
    }
    final public void drink(String name){
        System.out.println(name + " has drunk beer" + this.volume + " ml of beer");
    }

    public BeerKindsEnum getKind() {
        return kind;
    }

    public int getVolume() {
        return volume;
    }

    public int getStrength() {
        return strength;
    }

    public void printInfo(){
        System.out.println("Strength is " + this.getStrength() + "%");
        System.out.println("Volume is " + this.getVolume()+ "ml");
        System.out.println("Kind of beer is " + this.getKind().name().toLowerCase());
    }
}
