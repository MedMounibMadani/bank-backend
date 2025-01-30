package com.mnb.bank.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Card implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    @Column(nullable = false, unique = true, length = 16)
    private String cardNumber;

    @Column(nullable = false)
    private Date expiryDate;

    @Column(nullable = false)
    private int code;

    @Column(nullable = false)
    private int pinCode;

    @Column(nullable = false)
    private Boolean isActive = true;

    @Column(nullable = false)
    private Boolean onlinePaymentStatus = false;

    @Column(nullable = false)
    private Boolean internationalPaymentStatus = false;

    @OneToOne
    @JoinColumn(nullable = false, name = "account_id", unique = true)
    private Account account;
}
