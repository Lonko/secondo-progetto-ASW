package asw.springcloud.s1.infoAttoreCloud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoAttoreCloudController {

	/* mappa del film per il quale gli attori sono più famosi (a scopo di test) */
	private Map<String, String> attoreFilm;
	/* mappa del personaggio recitato nel film (a scopo di test) */
	private Map<String, String> filmPersonaggio;
	/* lista di personaggi */
	private List<String> personaggi;
	/* lista di film */
	private List<String> film;

	@PostConstruct
	public void init() {
		/* inizializza la mappa dei saluti */
		attoreFilm      = new HashMap<>();
		filmPersonaggio = new HashMap<>();
		String[] personaggiRandom = {"Mark Zuckerberg", "Neo", "Luke Skywalker", "Frodo Baggins", "Bruce Nolan"};
		String[] filmRandom = {"The Social Network", "Matrix", "Star Wars", "Signore degli Anelli", "Una Settimana da Dio"};
		personaggi = new ArrayList<>(Arrays.asList(personaggiRandom));
		film 	   = new ArrayList<>(Arrays.asList(filmRandom));
		attoreFilm.put("Leonardo di Caprio", "Titanic");
		attoreFilm.put("Johnny Depp", "Pirati dei Caraibi");
		filmPersonaggio.put("Titanic", "Jack Dawson");
		filmPersonaggio.put("Pirati dei Caraibi", "Jack Sparrow");
		
	}
	
    /* Restituisce il film per il
     * quale l'{attore} è più famoso
     * acceduta come GET /S1/{attore} */
	//@RequestMapping("/S1/{attore}")
	@RequestMapping("/{attore}")
	public String getFilm(@PathVariable String attore) {
		if(this.attoreFilm.containsKey(attore))
			return this.attoreFilm.get(attore);
		int randomIndex = new Random().nextInt(this.film.size());
		return this.film.get(randomIndex);
	}

    /* Restituisce il personaggio che l'{attore} 
     * ha interpretato nel {film}
     * acceduta come GET /S1/{attore}/{film} */
	//@RequestMapping("/S1/{attore}/{film}")
	@RequestMapping("/{attore}/{film}")
    public String getPersonaggio(@PathVariable String attore, @PathVariable String film) {
		if(this.attoreFilm.containsKey(attore) && this.filmPersonaggio.containsKey(film))
			return this.filmPersonaggio.get(film);
		int randomIndex = new Random().nextInt(this.personaggi.size());
		return this.personaggi.get(randomIndex);
    }	
	
}

