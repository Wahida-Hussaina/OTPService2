package com.m2pfintech.OTPService2.service;

import com.m2pfintech.OTPService2.dao.OtpDao;
import com.m2pfintech.OTPService2.entity.Otp;
import com.m2pfintech.OTPService2.generator.OtpGenerator;
import com.m2pfintech.OTPService2.uuid.UuidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class OtpService {



    @Autowired
    private OtpDao repository;


    public void sample(Otp number){
        OtpGenerator generator1=new OtpGenerator();
        int otp =generator1.generateOtp();
        UuidGenerator generator2=new UuidGenerator();
        String digest = generator2.uuid();
        Otp obj1 = new Otp(digest,otp,number.getMobileNumber(),number.getchanged(),number.getChanger(),number.getCreated(),number.getCreator());
        repository.save(obj1);

    }

    public boolean verification(Otp data ) {
        Otp sample1 = repository.findByMobileNumber(data.getMobileNumber());
       if (sample1.getOtp() == data.getOtp()) {
            return true;
        } else {
            return false;
        }

    }
}
