package web.service;

import web.models.Car;

import java.util.List;

public interface ServiceInt {
    List<Car> showAll(Integer count);
}
