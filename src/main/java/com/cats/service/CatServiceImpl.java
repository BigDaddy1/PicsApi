package com.cats.service;


import com.cats.entity.Cat;
import com.cats.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService{




    @Autowired
    private CatRepository repository;

    public List<Cat> getAll() {
        return repository.findAll();
    }

    public Cat getByID(long id) {
        return repository.findOne(id);
    }

    public Cat save(Cat cat) {
        return repository.saveAndFlush(cat);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}