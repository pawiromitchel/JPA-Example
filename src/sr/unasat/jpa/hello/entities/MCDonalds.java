package sr.unasat.jpa.hello.entities;

import java.io.Serializable;

@Entity
@Table(name = "MC_DONALDS")
public class MCDonaldsEntity implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="address", nullable="false")
    private String adress;

    @Column(name="phone", nullable="false")
    private String phone;

    @Column(name="code", nullable="false", unique="true")
    private String code;

    @ManyToOne
    @JoinColumn(name="city_fk")
    private City city;

    public MCDonaldsEntity(int id, String adress, String phone, String code, City city) {
        this.id = id;
        this.adress = adress;
        this.phone = phone;
        this.code = code;
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
