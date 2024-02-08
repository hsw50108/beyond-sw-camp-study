package namecard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NameCard {

    private String name;
    private String number;
    private String email;
    private String fax;
    private String homepageUrl;
    private String companyName;
    private String position;
    private String postalCode;
    private String address;


}
