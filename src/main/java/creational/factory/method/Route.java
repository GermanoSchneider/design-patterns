package creational.factory.method;

import java.util.Collection;

abstract class Route {

    abstract Collection<Country> getCountries();

    boolean isFromSouthAmerica() {

        return this instanceof SouthAmericaRoute;
    }
}
