package com.example.graduate.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "customer_voucher", schema = "datn", catalog = "")
@IdClass(CustomerVoucherPK.class)
public class CustomerVoucher {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "voucher_id", nullable = false)
    private int voucherId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "account_id", nullable = false)
    private int accountId;
    @ManyToOne
    @JoinColumn(name = "voucher_id", referencedColumnName = "id", nullable = false)
    private Voucher voucherByVoucherId;
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id", nullable = false)
    private Accounts accountsByAccountId;

    public int getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerVoucher that = (CustomerVoucher) o;
        return voucherId == that.voucherId && accountId == that.accountId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(voucherId, accountId);
    }

    public Voucher getVoucherByVoucherId() {
        return voucherByVoucherId;
    }

    public void setVoucherByVoucherId(Voucher voucherByVoucherId) {
        this.voucherByVoucherId = voucherByVoucherId;
    }

    public Accounts getAccountsByAccountId() {
        return accountsByAccountId;
    }

    public void setAccountsByAccountId(Accounts accountsByAccountId) {
        this.accountsByAccountId = accountsByAccountId;
    }
}
