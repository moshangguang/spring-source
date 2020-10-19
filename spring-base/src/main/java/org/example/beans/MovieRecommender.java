package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MovieRecommender {
    @Autowired
    private MovieFinder movieFinder;
    private MovieCatalog movieCatalog;
    private CustomerPreferenceDao customerPreferenceDao;

    public MovieRecommender() {
        System.out.println("Construct MovieRecommender()");
    }

    @Autowired
    public MovieRecommender(MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
        System.out.println("Construct MovieRecommender(MovieCatalog movieCatalog) ");
    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    public MovieCatalog getMovieCatalog() {
        return movieCatalog;
    }

    public CustomerPreferenceDao getCustomerPreferenceDao() {
        return customerPreferenceDao;
    }

    @Autowired(required = false)
    public void setCustomerPreferenceDao(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }
}
