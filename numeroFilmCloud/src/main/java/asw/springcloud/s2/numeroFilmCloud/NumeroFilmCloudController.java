package asw.springcloud.s2.numeroFilmCloud;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroFilmCloudController {

	/* mappa del numero di film girati dagli attori (a scopo di test)*/
	private Map<String, Integer> filmGirati;

	@PostConstruct
	public void init() {
		/* inizializza la mappa */
		filmGirati = new HashMap<>();
		filmGirati.put("Leonardo di Caprio", 30);
		filmGirati.put("Johnny Depp", 55);
	}
	
    /* Restituisce il numero di film 
     * in cui l'attore ha recitato
     * acceduta come GET /S2/{attore} */
	//@RequestMapping("/S2/{attore}")
	@RequestMapping("/{attore}")
	public int getNumeroFilm(@PathVariable String attore) {
		if(this.filmGirati.containsKey(attore))
			return this.filmGirati.get(attore);
		return new Random().nextInt(100); 
	}
	
}