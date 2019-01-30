package challenge;
import org.springframework.stereotype.Service;

@Service
public abstract interface QuoteService
{
  public abstract Quote getQuote();
  
  public abstract Quote getQuoteByActor(String paramString);
}