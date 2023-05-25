package creational.builder;

class Car {
    private final int doors;

    private final String brand;

    private final String model;

    private Car(CarBuilder carBuilder) {
        this.doors = carBuilder.doors;
        this.model = carBuilder.model;
        this.brand = carBuilder.brand;
    }

    static class CarBuilder {

        private int doors;

        private String brand;

        private String model;

        Car build() {

            if (doors <= 1) throw new RuntimeException("The car should have at least two doors");

            return new Car(this);
        }

        CarBuilder addNumberOfDoors(Integer doors) {

            this.doors = doors;

            return this;
        }

        CarBuilder addBrand(String brand) {

            this.brand = brand;

            return this;
        }

        CarBuilder addModel(String model) {

            this.model = model;

            return this;
        }
    }

    public int getDoors() {
        return doors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
