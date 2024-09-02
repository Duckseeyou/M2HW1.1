public class Main {
    public static void main(String[] args) {
        Beer beer = new Beer(10, 1000, BeerKindsEnum.ALE);
        BurningLove burningLove = new BurningLove(17, 500, BeerKindsEnum.LAGER, 100);
        BurningLove burningLove1 = new BurningLove(25, 2000, BeerKindsEnum.HYBRID, 200);

        beer.printInfo();
        beer.drink();
        burningLove.printInfo();
        burningLove.drink();
        burningLove1.printInfo();
        burningLove.drink();
    }
}