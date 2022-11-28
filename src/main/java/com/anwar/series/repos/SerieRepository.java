package com.anwar.series.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.anwar.series.entities.Genre;
import com.anwar.series.entities.Serie;


@RepositoryRestResource(path = "rest")
public interface SerieRepository extends JpaRepository<Serie, Long> {
	List<Serie> findByNomSerie(String nom);
	 List<Serie> findByNomSerieContains(String nom);
	 @Query("select p from Serie p where p.nomSerie like %:nom and p.prixSerie > :prix")
	 List<Serie> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	 @Query("select p from Serie p where p.genre = ?1")
	 List<Serie> findByGenre (Genre genre);
	 List<Serie> findByGenreIdGen(Long id);
	 List<Serie> findByOrderByNomSerieAsc();
	 @Query("select p from Serie p order by p.nomSerie ASC, p.prixSerie DESC")
	 List<Serie> trierSeriesNomsPrix ();
}
