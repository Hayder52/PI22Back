
package com.example.pi22.services;

import com.example.pi22.entities.TypeActivite;

import response.MatchingResponse;

import java.util.List;

public interface ITypeActiviteService {
    //public TypeActivite ajouterFavoris (TypeActivite favoris);


    public List<MatchingResponse> findMatchedUser(Long id);


}