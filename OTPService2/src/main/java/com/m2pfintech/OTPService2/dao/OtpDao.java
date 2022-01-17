package com.m2pfintech.OTPService2.dao;

import com.m2pfintech.OTPService2.entity.Otp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface OtpDao extends JpaRepository<Otp,Long> {

    Otp findByMobileNumber(String number);

}
