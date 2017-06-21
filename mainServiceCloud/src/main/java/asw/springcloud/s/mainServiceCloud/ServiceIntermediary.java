package asw.springcloud.s.mainServiceCloud;

public interface ServiceIntermediary {
	public String getFilm(String attore);
	public String getPersonaggio(String attore, String film);
	public int getNumeroFilm(String attore);
}
