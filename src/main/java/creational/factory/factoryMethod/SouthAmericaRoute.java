package creational.factory.factoryMethod;

import java.util.Collection;
import java.util.List;

import static creational.factory.factoryMethod.Country.*;

class SouthAmericaRoute extends Route {

    @Override
    public Collection<Country> getCountries() {

        return List.of( BRAZIL, COLOMBIA );
    }
}
