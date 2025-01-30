package com.mnb.bank.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class AccountType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountTypeId;

    @Column(nullable = false, length = 20, unique = true)
    private String accountTypeName;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal maximumTransactionAmount;

    @Column(nullable = false)
    private Integer maximumWithdrawalAmount;

    @Column(nullable = false)
    private BigDecimal feesPerYear;

    @Column(nullable = false)
    private BigDecimal feesPerTransaction;
}
