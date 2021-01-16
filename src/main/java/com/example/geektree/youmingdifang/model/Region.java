package com.example.geektree.youmingdifang.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private List<Integer> productIDs;

    public Region() {

    }

    public Region(Long id, String name, List<Integer> productIDs) {

        this.id = id;
        this.name = name;
        this.productIDs = productIDs;
    }

    // MARK: - Getter

    public Long getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Integer> getProductIDs() {
        return this.productIDs;
    }

    // MARK: - Setter

    public setName(String name) {
        this.name = name;
    }

    public setProductIDs(List<Integer> productIDs) {
        this.productIDs = productIDs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hash(this.productIDs);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Region Region = (Region) obj;

        if (this.name != Region.name) {
            return false;
        }

        return Objects.equals(this.id, Region.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Region{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", product_ids=").append(productIDs);
        sb.append('}');
        return sb.toString();
    }
}