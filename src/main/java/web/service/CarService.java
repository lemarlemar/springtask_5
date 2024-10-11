package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2015));
        cars.add(new Car("Honda", "Civic", 2016));
        cars.add(new Car("Ford", "Focus", 2017));
        cars.add(new Car("BMW", "X3", 2018));
        cars.add(new Car("Mercedes", "C-Class", 2019));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
