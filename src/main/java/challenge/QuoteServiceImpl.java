package challenge;


import java.util.List;
import java.util.Random;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repo;

	@Override
	public Quote getQuote() {
		List<Quote> quote = repo.findAll();
		Random aleatorio = new Random();
		return quote.get(aleatorio.nextInt(18306) - 1);			
	}
	
	@Override
	public Quote getQuoteByActor(String actor) {		
		
		List<Quote> obj =  repo.findByActor(actor);
		
		int tamanho = obj.size();
		Random aleatorio = new Random();
		System.out.println(obj.get(aleatorio.nextInt(tamanho) -1));
		return obj.get(aleatorio.nextInt(tamanho) -1);
		
	}

}
