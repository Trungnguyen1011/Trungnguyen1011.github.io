package vn.car.hw3.repo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import vn.car.hw3.model.Car;

@Repository
public class CarRepo {
  private ArrayList<Car> car = new ArrayList<>();

  public CarRepo() {
    try {
      ObjectMapper mapper = new ObjectMapper();
      File file = ResourceUtils.getFile("classpath:static/Car.json");

      car.addAll(mapper.readValue(file, new TypeReference<List<Car>>() {
      }));
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public List<Car> getAllCar() {

    return car;
  }

  public void addCar(Car newCar) {
    car.add(newCar);
  }

  public void updateCar(Car newCar) {
    Car oldCar = car.stream().filter(car -> car.getId() == newCar.getId()).findFirst().get();

    car.set(car.indexOf(oldCar), newCar);
  }

  public void deleteCar(Car deleteCar) {
    car.remove(deleteCar);
  }

  public Car getById(Integer id) {
    return car.stream().filter(car -> car.getId() == id.intValue()).findFirst().get();
  }

  public List<Car> searchList(String keyword) {
    return car.stream().filter(car -> car.getModel().toLowerCase().contains(keyword.toLowerCase())
        || car.getManufactor().toLowerCase().contains(keyword.toLowerCase())).collect(Collectors.toList());
  }
}
