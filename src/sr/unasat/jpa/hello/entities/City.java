package sr.unasat.jpa.hello.entities;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CITY")
public class City {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name", nullable="false" , unique="true")
    private String name;

    @Column(name="description", nullable="false")
    private String description;

    @OneToMany(mappedBy="id",cascade=CascadeType.ALL)
    private Set<MCDonaldsEntity> mcDonaldsEntities = new HashSet<MCDonaldsEntity>();

    public City(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
