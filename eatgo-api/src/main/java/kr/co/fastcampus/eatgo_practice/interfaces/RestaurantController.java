package kr.co.fastcampus.eatgo_practice.interfaces;

import kr.co.fastcampus.eatgo_practice.domain.Restaurant;
import kr.co.fastcampus.eatgo_practice.domain.RestaurantRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    //현재 컨트롤러 안에서 레스토랑 레포지토리를 직접 만들고 할당하고 있다.
    //이를 다른곳으로 옭기는것이 목표다.
    //RestaurantRepository repository = new RestaurantRepository();
    //아래와 같이 변경할 수 있다.
    @Autowired
    private RestaurantRepositoryImpl repository;

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = repository.findAll();
        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {
        Restaurant restaurant = repository.findById(id);
        return restaurant;
    }
}
