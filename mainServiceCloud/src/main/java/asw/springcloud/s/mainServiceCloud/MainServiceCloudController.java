package asw.springcloud.s.mainServiceCloud;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainServiceCloudController {
	
	@Autowired private ServiceIntermediary serviceIntermediary;
	
	//@RequestMapping("/S/{attore}")
	@RequestMapping("/{attore}")
	public String getFilm(Map<String, Object> model, @PathVariable String attore) {
		return attore + " ha recitato in " + serviceIntermediary.getNumeroFilm(attore) +
			   " film ed il film per il quale è più famoso è " +
				serviceIntermediary.getFilm(attore) + ".";
	}
	
	//@RequestMapping("/S/{attore}/{film}")
	@RequestMapping("/{attore}/{film}")
	public String getPersonaggio(Map<String, Object> model, @PathVariable String attore, @PathVariable String film) {
		return attore + " ha recitato in " +
				serviceIntermediary.getNumeroFilm(attore) + " film ed interpretato il ruolo di " +
				serviceIntermediary.getPersonaggio(attore, film) + " in " + film + ".";
	}
}
