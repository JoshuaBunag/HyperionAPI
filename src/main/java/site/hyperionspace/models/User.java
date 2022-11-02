package site.hyperionspace.models;

import javax.persistence.*;

@Entity
public class User {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// <== GENERAETE ID AUTOMATICALLY
    //generator = "SequenceSubCategoryId")
    //@SequenceGenerator(name = "SequenceSubCategoryId",sequenceName = "Starting_Sequence")
    //@Column(name = "id",columnDefinition="INTEGER IDENTITY (1,1)",nullable=false)
    private Long id;
    private String name;
    private String address;
    private String contact;
    private String company;
}
