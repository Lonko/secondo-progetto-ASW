package asw.springcloud.s.mainServiceCloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import asw.springcloud.s.mainServiceCloud.servicesClients.infoAttoreCloudClient;
import asw.springcloud.s.mainServiceCloud.servicesClients.numeroFilmCloudClient;

@Service
public class ServiceIntermediaryImpl implements ServiceIntermediary {
	@Autowired private infoAttoreCloudClient iacClient;
	@Autowired private numeroFilmCloudClient nfcClient;
	
	@HystrixCommand(fallbackMethod="getFallbackFilm")
	public String getFilm(String attore) {return iacClient.getFilm(attore);}
	
	public String getFallbackFilm(String attore){return "Alien";}

	@HystrixCommand(fallbackMethod="getFallbackPersonaggio")
	public String getPersonaggio(String attore, String film){
		return iacClient.getPersonaggio(attore, film);
	}
	
	public String getFallbackPersonaggio(String attore, String film){return "Ellen Ripley";}

	@HystrixCommand(fallbackMethod="getFallbackNumero")
	public int getNumeroFilm(String attore){return nfcClient.getNumeroFilm(attore);}
	
	public int getFallbackNumero(String attore){return 10;}
}
