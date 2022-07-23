package com.example.pi22.controllers;

import com.example.pi22.entities.TypeActivite;
import com.example.pi22.repositories.TypeActiviterRepository;
import com.example.pi22.services.TypeActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import response.MatchingResponse;

import java.nio.file.Path;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/ListType")

public class TypeActiviterControler {
    @Autowired
    private TypeActiviteService typeActiviteService;
    @Autowired
    private TypeActiviterRepository typerepo;

    @GetMapping("/list/{id}")
    public List<String> get (@PathVariable Long id){
       return  typeActiviteService.getFavoris(id);
    }

    @GetMapping("/Matching/{id}")
    public List<MatchingResponse> Matching (@PathVariable Long id){
        return typeActiviteService.findMatchedUser(id);
    }

    @GetMapping("/All")
    public List<TypeActivite>findAll()
    {
        return typerepo.findAll();
    }


}
