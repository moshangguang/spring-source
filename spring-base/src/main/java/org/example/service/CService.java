package org.example.service;

public class CService {
    A1Service a1Service;
    A2Service a2Service;

    public CService(A1Service a1Service, A2Service a2Service) {
        this.a1Service = a1Service;
        this.a2Service = a2Service;
    }

    @Override
    public String toString() {
        return "CService{" +
                "a1Service=" + a1Service +
                ", a2Service=" + a2Service +
                '}';
    }
}
