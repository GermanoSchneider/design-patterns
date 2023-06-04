package structural.bridge;

class CraftBrewery extends Brewery {

    CraftBrewery(Beer beer) {
        super(beer);
    }

    @Override
    Beer produce() {

        System.out.println("Starting process at Craft Brewery");
        getBeerInformation();

        return beer;
    }
}
