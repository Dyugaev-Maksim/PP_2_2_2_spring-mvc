package web.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int serial;

    public Car(String name, String model, int serial) {
        this.name = name;
        this.model = model;
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", serial=" + serial +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return serial == car.serial && Objects.equals(name, car.name) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, serial);
    }
}
