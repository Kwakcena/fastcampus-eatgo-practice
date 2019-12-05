package kr.co.fastcampus.eatgo_practice.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant("Bob zip");
        assertThat(restaurant.getName(), is("Bob zip"));
    }

}