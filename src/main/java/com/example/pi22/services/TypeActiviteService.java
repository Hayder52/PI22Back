package com.example.pi22.services;

import com.example.pi22.entities.TypeActivite;
import com.example.pi22.entities.User;
import com.example.pi22.repositories.TypeActiviterRepository;
import com.example.pi22.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import response.MatchingResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeActiviteService implements ITypeActiviteService {
    @Autowired
    private TypeActiviterRepository typeActiviterRepository;
    @Autowired
    private UserRepository userRepository;

    public  List<String> getFavoris (Long id){
        return  typeActiviterRepository.getActiviterById(id);
    }

    @Override
    public List<MatchingResponse> findMatchedUser(Long id) {
        List<MatchingResponse> matchingResponses = new ArrayList<>();
        List<String> myFavorites = typeActiviterRepository.getActiviterById(id);
        List<User> users = userRepository.findAllByIdNot(id);


        for(User user: users) {
            List<String> commonFavorites = new ArrayList<>();
            List<String> otherFovorites = typeActiviterRepository.getActiviterById(user.getId());
            //for loop or
            for(String myFav: myFavorites) {
                for(String otherFav: otherFovorites) {
                    if(myFav.equals(otherFav)) {
                        commonFavorites.add(myFav);
                    }

                }
            }
            if(!commonFavorites.isEmpty()) {
                MatchingResponse matchingResponse = new MatchingResponse();
                matchingResponse.setName(user.getName());
                matchingResponse.setIdUsser((user.getId()));
                matchingResponse.setFavoris(commonFavorites);
                matchingResponses.add(matchingResponse);
            }
        }

        return matchingResponses;

    }
}
