package com.m2pfintech.OTPService2.generator;

import java.util.Random;

public class OtpGenerator {
    public int generateOtp(){
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return otp;
    }

}
