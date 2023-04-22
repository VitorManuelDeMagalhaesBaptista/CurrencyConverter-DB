package currencyconversion.API.currencyconversion;


import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<CurrencyEntity, Long> {
}


