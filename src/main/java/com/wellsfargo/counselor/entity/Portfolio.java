package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio{

    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }
    public Portfolio(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(){this.creationDate = creationDate;}
}
