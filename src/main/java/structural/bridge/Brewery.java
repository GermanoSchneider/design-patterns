package structural.bridge;

abstract class Brewery {

    protected final Beer beer;

    Brewery(Beer beer) {
        this.beer = beer;
    }

    abstract Beer produce();

    void getBeerInformation() {

        System.out.println("Dry hopping: " + beer.hasDryHopping());
        System.out.println("IBU: " + beer.getIbu());
        System.out.println("Hop: " + beer.getHop());
    }
}
