package com.anwar.series.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomSer", types = { Serie.class })

public interface SerieProjection {
	public String getNomSerie();
	
}
