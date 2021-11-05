package com.grit;

public class Customer {
    //Constructor
    public Customer(String Name, long SSN, long ccNum){
        name = Name;
        ssn = SSN;
        creditCard = new CreditCard(ccNum);
    }
    public Customer(String Name, long SSN) {
        name = Name;
        ssn = SSN;
    }

    //State
    private String name;
    private long ssn;
    private long phoneNr;
    private String email;
    private CreditCard creditCard;


    //Behaviour
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }
    public long getSSN() {
        return ssn;
    }
    public long getPhoneNr() {
        return phoneNr;
    }
    public void setPhoneNr(long phoneNr) {
        this.phoneNr = phoneNr;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void registerCreditCard(long ccNum){
        creditCard = new CreditCard(ccNum);
    }
}
