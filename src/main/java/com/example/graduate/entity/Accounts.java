package com.example.graduate.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Accounts {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "username", nullable = false, length = 255)
    private String username;
    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "address", nullable = true, length = 255)
    private String address;
    @Basic
    @Column(name = "phone_number", nullable = true, length = 20)
    private String phoneNumber;
    @Basic
    @Column(name = "status", nullable = true)
    private Byte status;
    @Basic
    @Column(name = "date_of_birth", nullable = true)
    private Date dateOfBirth;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "notes", nullable = true, length = 255)
    private String notes;
    @Basic
    @Column(name = "gender", nullable = true)
    private Integer gender;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role roleByRoleId;
    @OneToMany(mappedBy = "accountsByAccountId")
    private Collection<CustomerVoucher> customerVouchersById;
    @OneToMany(mappedBy = "accountsByAccountId")
    private Collection<Orders> ordersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return id == accounts.id && Objects.equals(username, accounts.username) && Objects.equals(password, accounts.password) && Objects.equals(email, accounts.email) && Objects.equals(address, accounts.address) && Objects.equals(phoneNumber, accounts.phoneNumber) && Objects.equals(status, accounts.status) && Objects.equals(dateOfBirth, accounts.dateOfBirth) && Objects.equals(name, accounts.name) && Objects.equals(notes, accounts.notes) && Objects.equals(gender, accounts.gender) && Objects.equals(createdAt, accounts.createdAt) && Objects.equals(updatedAt, accounts.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email, address, phoneNumber, status, dateOfBirth, name, notes, gender, createdAt, updatedAt);
    }

    public Role getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRoleByRoleId(Role roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }

    public Collection<CustomerVoucher> getCustomerVouchersById() {
        return customerVouchersById;
    }

    public void setCustomerVouchersById(Collection<CustomerVoucher> customerVouchersById) {
        this.customerVouchersById = customerVouchersById;
    }

    public Collection<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Orders> ordersById) {
        this.ordersById = ordersById;
    }
}
