package sr.unasat.jpa.hello.entities;

import java.io.Serializable;

@Entity
@Table(name = "MC_DONALDS")
public class MCDonaldsEntity implements Serializable {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="address")
    private String adress;
    @Column(name="phone")
    private String phone;
    @Column(name="code")
    private String code;

    public MCDonalds(int id, String adress, String phone, String code) {
        this.id = id;
        this.adress = adress;
        this.phone = phone;
        this.code = code;
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

    @Column(name="code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
