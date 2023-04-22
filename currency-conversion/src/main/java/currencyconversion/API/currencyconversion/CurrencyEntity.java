package currencyconversion.API.currencyconversion;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "currency")
@Getter
@Setter
public class CurrencyEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "from")
    private String from;

    @Column(name = "to")
    private String to;

    @Column(name = "AMOUNT")
    private Double AMOUNT;

    @Column(name = "result")
    private Double result;

    @Column(name = "currentDate")
    private Date currentDate;
}
