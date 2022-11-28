package com.anwar.series.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anwar.series.entities.Genre;
import com.anwar.series.entities.Serie;
import com.anwar.series.repos.SerieRepository;
@Service
public class SerieServiceImpl  implements SerieService {

	
	@Autowired
	SerieRepository serieRepository;
	@Override
	public Serie saveSerie(Serie p) {
		return serieRepository.save(p);
	}

	@Override
	public Serie updateSerie(Serie p) {
		return serieRepository.save(p);

	}

	@Override
	public void deleteSerie(Serie p) {
		serieRepository.delete(p);
		
	}

	@Override
	public void deleteSerieById(Long id) {
		serieRepository.deleteById(id);
	}

	@Override
	public Serie getSerie(Long id) {
		return serieRepository.findById(id).get();
	}

	@Override
	public List<Serie> getAllSeries() {
		return serieRepository.findAll();
	}

	@Override
	public List<Serie> findByNomSerie(String nom) {
	return serieRepository.findByNomSerie(nom);
	}
	@Override
	public List<Serie> findByNomSerieContains(String nom) {
	return serieRepository.findByNomSerieContains(nom);
	}
	@Override
	public List<Serie> findByNomPrix(String nom, Double prix) {
		return serieRepository.findByNomPrix(nom, prix);
	}
	@Override
		public List<Serie> findByGenre(Genre genre) {
		    return serieRepository.findByGenre(genre);
		
	}
	@Override
	public List<Serie> findByGenreIdGen(Long id) {
	return serieRepository.findByGenreIdGen(id);
	}
	@Override
	public List<Serie> findByOrderByNomSerieAsc() {
	return serieRepository.findByOrderByNomSerieAsc();
	}
	@Override
	public List<Serie> trierSeriesNomsPrix() {
	return serieRepository.trierSeriesNomsPrix();
	}
}