package kr.co.fastcampus.eatgo_practice.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L,"Bob zip", "Seoul");
        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void Information() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");
        assertThat(restaurant.getInformation(), is("Bob zip is Seoul"));
    }

}