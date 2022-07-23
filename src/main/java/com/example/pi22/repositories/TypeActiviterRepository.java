package com.example.pi22.repositories;
import org.springframework.data.repository.query.Param;
import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pi22.entities.TypeActivite;

@Repository

public interface TypeActiviterRepository extends JpaRepository<TypeActivite, Long>{

	
	 /* @Query( value = "SELECT Name as nameFavoris FROM Favoris f " +
    "INNER JOIN Activite a on f.id_Fav=a.id" +
    " INNER JOIN Abonnement ab on ab.id.activiteId = a.id " +
    "INNER JOIN User u on u.id = ab.id.userId  WHERE u.id=:idUserParam", nativeQuery = true)

public List<String> getFavorisName1 (@Param("idUserParam")Long id);*/

@Query("select t.name  from TypeActivite  t left join  t.activites a " +
    "inner join a.abonnement ab inner join ab.userAbn us where us.id=:idUser")
//public List<String> gettypeActiviteName (@Param("idUser")Long id);
public List<String> getActiviterById(@Param("idUser")Long id);
}

