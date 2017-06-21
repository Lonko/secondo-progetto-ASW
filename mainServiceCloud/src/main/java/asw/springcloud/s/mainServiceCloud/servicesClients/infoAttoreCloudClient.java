package asw.springcloud.s.mainServiceCloud.servicesClients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("S1")
public interface infoAttoreCloudClient {
	
	@RequestMapping("/S1/{attore}")
	public String getFilm(@PathVariable("attore") String attore);
	
	@RequestMapping("/S1/{attore}/{film}")
	public String getPersonaggio(@PathVariable("attore") String attore, @PathVariable("film") String film);
}
