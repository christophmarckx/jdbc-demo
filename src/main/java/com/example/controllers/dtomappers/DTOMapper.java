package com.example.controllers.dtomappers;

public interface DTOMapper<T1,T2> {
    T2 map(T1 entity);
}
