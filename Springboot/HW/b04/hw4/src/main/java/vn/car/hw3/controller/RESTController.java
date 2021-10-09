package vn.car.hw3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.car.hw3.model.Car;
import vn.car.hw3.repo.CarRepo;
import vn.car.hw3.request.DeleteRequest;
import vn.car.hw3.request.SearchRequest;



@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired CarRepo carRepo;

    @GetMapping("/home")
    public ResponseEntity<List<Car>> gethome() {
        return ResponseEntity.ok().body(carRepo.getAllCar());
    }

    @PostMapping(path = "/home", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void postCar(Car car) {
     carRepo.addCar(car);
    }

   


    @PatchMapping("/home")
    public void edit(Car car) {
        carRepo.updateCar(car);
    }

    @DeleteMapping("/home")
    public void deleteRequest(DeleteRequest deleteRequest) {
        carRepo.deleteCar(carRepo.getById(deleteRequest.getId()));
    }

 
    @PostMapping("/search")
    public ResponseEntity<List<Car>> searchRequest(SearchRequest searchRequest) {
        
        return ResponseEntity.ok().body(carRepo.searchList(searchRequest.getKeyword()));
    }

}
