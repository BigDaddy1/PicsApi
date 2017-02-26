package com.cats.controller;


import com.cats.entity.Cat;
import com.cats.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class apicontroller {

    @Autowired
    private CatService service;

    @RequestMapping(value = "/cats/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Cat> getAllCats() {
        return service.getAll();
    }

    @RequestMapping(value = "/cats/one/id={id}", method = RequestMethod.GET)
    @ResponseBody
    public Cat getCat(@PathVariable("id") long catID) {
        return service.getByID(catID);
    }

    @RequestMapping(value = "/cats/save", method = RequestMethod.POST)
    @ResponseBody
    public Cat saveCat(@RequestBody Cat cat) {

        return service.save(cat);
    }



    @RequestMapping(value = "/cats/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }

}
