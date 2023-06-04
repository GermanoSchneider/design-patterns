package structural.bridge;

class IndustrialBrewery extends Brewery {

    IndustrialBrewery(Beer beer) {
        super(beer);
    }

    @Override
    Beer produce() {

        System.out.println("Starting process at Industrial Brewery");
        getBeerInformation();

        return beer;
    }
}
