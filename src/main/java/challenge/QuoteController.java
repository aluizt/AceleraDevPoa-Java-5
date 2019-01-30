package challenge;

import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/v1")
public class QuoteController {

	@Autowired
	private QuoteService service;
	
	@NotNull
	@RequestMapping(value="/quote", method=RequestMethod.GET)
		public Quote getQuote() {		
		return service.getQuote();
	}
	
	@NotNull
	@GetMapping
	@RequestMapping(value = "/quote/{actor}", method = RequestMethod.GET)
		public Quote getQuoteByActor(@PathVariable String actor) {		
		return service.getQuoteByActor(actor);
	}

}