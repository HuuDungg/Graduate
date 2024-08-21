package com.example.graduate.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Size {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "code", nullable = true, length = 255)
    private String code;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "status", nullable = true)
    private Byte status;
    @OneToMany(mappedBy = "sizeBySizeId")
    private Collection<ProductDetail> productDetailsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return id == size.id && Objects.equals(code, size.code) && Objects.equals(name, size.name) && Objects.equals(status, size.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, status);
    }

    public Collection<ProductDetail> getProductDetailsById() {
        return productDetailsById;
    }

    public void setProductDetailsById(Collection<ProductDetail> productDetailsById) {
        this.productDetailsById = productDetailsById;
    }
}
