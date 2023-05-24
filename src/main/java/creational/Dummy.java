package creational;

import java.util.ArrayList;
import java.util.Collection;

class Dummy {
    private final Collection<Integer> numbers;

    private final String lastName;

    private final String firstName;

    private Dummy(DummyBuilder dummyBuilder) {
        this.numbers = dummyBuilder.numbers;
        this.firstName = dummyBuilder.firstName;
        this.lastName = dummyBuilder.lastName;
    }

    static class DummyBuilder {

        private final Collection<Integer> numbers = new ArrayList<>();

        private String lastName;

        private String firstName;

        Dummy build() {

            return new Dummy(this);
        }

        DummyBuilder addNumber(Integer number) {

            numbers.add(number);

            return this;
        }

        DummyBuilder withFirstName(String firstName) {

            this.firstName = firstName;

            return this;
        }

        DummyBuilder withLastName(String lastName) {

            this.lastName = lastName;

            return this;
        }
    }

    public Collection<Integer> getNumbers() {
        return numbers;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
