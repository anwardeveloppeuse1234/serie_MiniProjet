package com.anwar.series.service;

import java.util.List;

import com.anwar.series.entities.Genre;
import com.anwar.series.entities.Serie;

public interface SerieService {
	Serie saveSerie(Serie p);
	Serie updateSerie(Serie p);
	void deleteSerie(Serie p);
	 void deleteSerieById(Long id);
	Serie getSerie(Long id);
	List<Serie> getAllSeries();
	List<Serie> findByNomSerie(String nom);
	List<Serie> findByNomSerieContains(String nom);
	List<Serie> findByNomPrix (String nom, Double prix);
	List<Serie> findByGenre (Genre genre);
	List<Serie> findByGenreIdGen(Long id);
	List<Serie> findByOrderByNomSerieAsc();
	List<Serie> trierSeriesNomsPrix();


}
