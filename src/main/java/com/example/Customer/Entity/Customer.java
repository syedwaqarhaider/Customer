package com.example.Customer.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name is required")
    private String name;

    @Embedded
    private CustomerDetails details;

    @Column(name = "account_type")
    private String accountType;

    @ElementCollection
    @CollectionTable(name = "customer_business_requirements", joinColumns = @JoinColumn(name = "customer_id"))
    @Column(name = "requirement")
    private List<String> businessRequirements;

    @Pattern(regexp = "^(fulltime|parttime)$", message = "Contract type should be 'fulltime' or 'parttime'")
    @Column(name = "contract_type")
    private String contractType;

    // Constructors, getters, and setters

    public Customer() {
    }

    public Customer(String name, CustomerDetails details, String accountType,
                    List<String> businessRequirements, String contractType) {
        this.name = name;
        this.details = details;
        this.accountType = accountType;
        this.businessRequirements = businessRequirements;
        this.contractType = contractType;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerDetails getDetails() {
        return details;
    }

    public String getAccountType() {
        return accountType;
    }

    public List<String> getBusinessRequirements() {
        return businessRequirements;
    }

    public String getContractType() {
        return contractType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(CustomerDetails details) {
        this.details = details;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBusinessRequirements(List<String> businessRequirements) {
        this.businessRequirements = businessRequirements;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
}

