package creational.factory.factory_method;

import java.util.Collection;
import java.util.List;

import static creational.factory.factory_method.Country.*;

class SouthAmericaRoute extends Route {

    @Override
    public Collection<Country> getCountries() {

        return List.of( BRAZIL, COLOMBIA );
    }
}
