package asw.springcloud.s.mainServiceCloud;

import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainServiceCloudController {
	@Autowired
	private LoadBalancerClient loadBalancer;
	
    /* Restituisce il numero di film in cui 
     * l'{attore} ha recitato ed il film per il 
     * quale è più famoso
     * acceduta come GET /S/{attore} */
	@RequestMapping("/S/{attore}")
	public String getFilm(Map<String, Object> model, @PathVariable String attore) {
		String film    = getString("S1", attore);
		int numeroFilm = getInt("S2", attore);
		return attore+" ha recitato in "+numeroFilm+" film ed il film per il quale è più famoso è "+film+".";
	}

    /* Restituisce il numero di film in cui l'{attore}
     * ed il personaggio interpretato nel {film}
     * acceduta come GET /S/{attore}/{film} */
	@RequestMapping("/S/{attore}/{film}")
    public String getPersonaggio(Map<String, Object> model, @PathVariable String attore, @PathVariable String film) {
		String personaggio = getString("S1", attore+"/"+film);
		int numeroFilm = getInt("S2", attore);
		return attore+" ha recitato in "+numeroFilm+" film ed interpretato il ruolo di "
				+personaggio+" in "+film+".";
    }	
	
	private int getInt(String service, String param){
		String uri = getServiceURI(service)+"/"+service+"/"+param;
		return new RestTemplate().getForObject(uri, Integer.class);
	}
	
	private String getString(String service, String param){
		String uri = getServiceURI(service)+"/"+service+"/"+param;
		return new RestTemplate().getForObject(uri, String.class);
	}
	
	private URI getServiceURI(String service) {
		ServiceInstance instance = loadBalancer.choose(service);
		if(instance!=null) {
			URI uri = instance.getUri();
			if(uri!=null){
				return uri;
			}
		}
		return null;
	}
}
