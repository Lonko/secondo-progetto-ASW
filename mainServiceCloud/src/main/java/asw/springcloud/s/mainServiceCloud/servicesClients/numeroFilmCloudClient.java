package asw.springcloud.s.mainServiceCloud.servicesClients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("S2")
public interface numeroFilmCloudClient {

	@RequestMapping("/S2/{attore}")
	public int getNumeroFilm(@PathVariable("attore") String attore);
}
