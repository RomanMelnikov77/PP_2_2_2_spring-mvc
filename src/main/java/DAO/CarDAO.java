package DAO;

import models.Car;
import org.springframework.stereotype.Component;
import DAO.CarDAO;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private List<Car> carList;
    {
        carList=new ArrayList<>();
        carList.add(new Car("AUDI", "A6",200));
        carList.add(new Car("BMW", "X5",250));
        carList.add(new Car("VOLKSWAGEN", "Tuareg",210));
        carList.add(new Car("LADA", "6",260));
        carList.add(new Car("MERSEDES", "SLK",220));
    }
    public List<Car> showAll(Integer count) {
        if ((count == null) || (count >= 5)) {
            return carList;
        } else if (count > 0) {
            return carList.stream().limit(count).toList();
        } else {
            return null;
        }
    }

}

