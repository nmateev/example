package com.wasp.landlordcommunication.models;

import com.wasp.landlordcommunication.utils.Constants;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = Constants.PAYMENTS_TABLE)
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = Constants.PAYMENTS_ID_COLUMN)
    private int paymentId;

    @NotNull
    @Column(name = Constants.PAYMENTS_TENANT_ID_COLUMN)
    private int tenantId;

    @NotNull
    @Column(name = Constants.PAYMENTS_LANDLORD_ID_COLUMN)
    private int landlordId;

    @NotNull
    @Column(name = Constants.PAYMENTS_PROPERTY_ID_COLUMN)
    private int propertyId;

    @NotNull
    @Column(name = Constants.PAYMENTS_PROPERTY_ADDRESS_COLUMN)
    private String propertyAddress;

    @NotNull
    @Min(value = Constants.PAYMENT_AMOUNT_VALIDATION_MIN_VALUE)
    @Column(name = Constants.PAYMENTS_AMOUNT_COLUMN)
    private double paymentAmount;

    @NotNull
    @Column(name = Constants.PAYMENTS_DATE_PAID_COLUMN)
    private String datePaid;

    @NotNull
    @Size(min = Constants.CARD_NUMBER_VALIDATION_MIN_VALUE, max = Constants.CARD_NUMBER_VALIDATION_MAX_VALUE)
    @Column(name = Constants.PAYMENTS_CARD_NUMBER_COLUMN)
    private String cardNumber;


    public Payment() {


    }

    public Payment(int tenantId, int landlordId, String propertyAddress, int propertyId, double paymentAmount, String datePaid, String cardNumber) {
        setTenantId(tenantId);
        setLandlordId(landlordId);
        setPropertyAddress(propertyAddress);
        setPropertyId(propertyId);
        setPaymentAmount(paymentAmount);
        setDatePaid(datePaid);
        setCardNumber(cardNumber);
    }


    public int getPaymentId() {
        return paymentId;
    }

    public int getTenantId() {
        return tenantId;
    }

    public int getLandlordId() {
        return landlordId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getDatePaid() {
        return datePaid;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    private void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    private void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    private void setLandlordId(int landlordId) {
        this.landlordId = landlordId;
    }

    private void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    private void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    private void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    private void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    private void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
