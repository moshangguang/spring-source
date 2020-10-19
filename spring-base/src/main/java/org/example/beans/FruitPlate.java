package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class FruitPlate {
    @Autowired
    private Fruit[] fruits;
    @Autowired
    private List<Fruit> fruitList;
    @Autowired
    private Set<Fruit> fruitSet;
    @Autowired
    private Map<String, Fruit> fruitMap;
    @Autowired
    private Fruit primary;


    public Fruit[] getFruits() {
        return fruits;
    }

    public List<Fruit> getFruitList() {
        return fruitList;
    }

    public Set<Fruit> getFruitSet() {
        return fruitSet;
    }

    public Map<String, Fruit> getFruitMap() {
        return fruitMap;
    }

    public Fruit getPrimary() {
        return primary;
    }


}
