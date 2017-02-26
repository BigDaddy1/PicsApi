package com.cats.service;


import com.cats.entity.Cat;

import java.util.List;

public interface CatService
{

    List<Cat> getAll();
    Cat getByID(long id);
    Cat save(Cat remind);
    void remove(long id);

}