package com.m2pfintech.OTPService2.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Data
@Table(name="Otp")
public class Otp {
    @Id
    @GeneratedValue
    private long pkey;
    private Timestamp changed;
    private String changer;
    private Timestamp created;
    private String creator;
    private String mobileNumber;
    private String uuaid;
    private int otp;


    public Otp(String uuaid , int otp, String mobileNumber, Timestamp changed, String changer, Timestamp created, String creator) {
        this.otp=otp;
        this.mobileNumber = mobileNumber;
        this.changed = changed;
        this.changer = changer;
        this.created = created;
        this.creator = creator;
        this.uuaid = uuaid;
    }

    public Otp() {
    }

    @Column(name = "pkey")
    public Long getPkey() {
        return pkey;
    }

    public void setPkey(Long pkey) {
        this.pkey = pkey;
    }

    @Column(name = "changed")
    public Timestamp getchanged(){
        return changed;
    }

    public void setChanged (Timestamp changed){
        this.changed = changed;
    }

    @Column(name = "changer")
    public String getChanger(){
        return changer;
    }

    public void setChanger(String changer){
        this.changer = changer;
    }

    @Column(name = "created")
    public Timestamp getCreated(){
        return created;
    }

    public void setCreated(Timestamp created){
        this.created = created;
    }

    @Column(name = "creator")
    public String getCreator(){
        return creator;
    }
    public void setCreator(String creator){
        this.creator=creator;
    }

    @Column(name = "mobileNumber")
   public String getMobileNumber(){
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    @Column(name = "uuaid")
    public String getUuaid(){
        return uuaid;
    }

    public void setUuaid(String uuaid){
        this.uuaid = uuaid;
    }

    @Column(name = "otp")
    public int getOtp(){
        return otp;
    }

    public void setOtp(int otp){
        this.otp = otp;
    }


}
