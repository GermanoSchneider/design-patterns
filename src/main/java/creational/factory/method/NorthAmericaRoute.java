package creational.factory.method;

import java.util.Collection;
import java.util.List;

import static creational.factory.method.Country.*;

class NorthAmericaRoute extends Route {

    @Override
    Collection<Country> getCountries() {

        return List.of( CANADA, UNITED_STATES );
    }
}
