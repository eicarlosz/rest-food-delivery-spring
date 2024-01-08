package br.com.food.delivery.api.service;

import br.com.food.delivery.api.model.Food;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class FoodService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(FoodService.class.getName());

    public Food findById(String Id) {
        logger.info("Finding one Food");
        Food food = new Food();
        food.setFoodId(counter.incrementAndGet());
        food.setName("testeComida");
        food.setPrice(22);
        return food;
    }
}
