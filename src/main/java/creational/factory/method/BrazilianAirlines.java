package creational.factory.method;

class BrazilianAirlines implements Airline {

    @Override
    public Route createRoute(Route route) {

        if (!route.isFromSouthAmerica()) throw new RuntimeException("Route needs to be from South America");

        return new SouthAmericaRoute();
    }
}
