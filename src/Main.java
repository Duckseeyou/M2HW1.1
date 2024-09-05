public class Main {
    public static void main(String[] args) {
        Beer beer = new Beer(10, 1000, BeerKindsEnum.ALE);
        BurningLove burningLove = new BurningLove(17, 500, BeerKindsEnum.LAGER, 100);
        BurningLove burningLove1 = new BurningLove(25, 2000, BeerKindsEnum.HYBRID, 200);

        Beer[] beers = {beer, burningLove, burningLove1};

        for (int i = 0; i < beers.length; i++) {
            beers[i].printInfo();
            beers[i].drink();
            System.out.println();
        }

    }
}