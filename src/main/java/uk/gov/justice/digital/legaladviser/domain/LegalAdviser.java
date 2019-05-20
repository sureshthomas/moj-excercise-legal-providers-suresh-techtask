package uk.gov.justice.digital.legaladviser.domain;

/** +
 * POJO domain object representing legal adviser
 */
public class LegalAdviser {
    private int id;
    private String name;
    private String address1;
    private String city;
    private String postCode;
    private String phone;
    private String orgType;
    private boolean catCrime;
    private boolean catDebt;
    private boolean catHousing;
    private boolean catImmigrationOrAsylum;
    private boolean catWelfareBenefits;

    public LegalAdviser(int id, String name, String address1, String city, String postCode, String phone, String orgType,
                        boolean catCrime, boolean catDebt, boolean catHousing, boolean catImmigrationOrAsylum, boolean catWelfareBenefits) {
        this.id = id;
        this.name = name;
        this.address1 = address1;
        this.city = city;
        this.postCode = postCode;
        this.phone = phone;
        this.orgType = orgType;
        this.catCrime = catCrime;
        this.catDebt = catDebt;
        this.catHousing = catHousing;
        this.catImmigrationOrAsylum = catImmigrationOrAsylum;
        this.catWelfareBenefits = catWelfareBenefits;
    }

    @Override
    public String toString() {
        return "LegalProvider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address1='" + address1 + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", phone='" + phone + '\'' +
                ", orgType='" + orgType + '\'' +
                ", catCrime=" + catCrime +
                ", catDebt=" + catDebt +
                ", catHousing=" + catHousing +
                ", catImmigrationOrAsylum=" + catImmigrationOrAsylum +
                ", catWelfareBenefits=" + catWelfareBenefits +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getOrgType() {
        return orgType;
    }

    public boolean isCatCrime() {
        return catCrime;
    }

    public boolean isCatDebt() {
        return catDebt;
    }

    public boolean isCatHousing() {
        return catHousing;
    }

    public boolean isCatImmigrationOrAsylum() {
        return catImmigrationOrAsylum;
    }

    public boolean isCatWelfareBenefits() {
        return catWelfareBenefits;
    }
}


