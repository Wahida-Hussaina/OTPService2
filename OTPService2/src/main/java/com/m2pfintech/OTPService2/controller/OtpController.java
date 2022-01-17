package com.m2pfintech.OTPService2.controller;

import com.m2pfintech.OTPService2.entity.Otp;
import com.m2pfintech.OTPService2.generator.OtpGenerator;
import com.m2pfintech.OTPService2.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stereo")

public class OtpController {
    @Autowired
    private OtpService service;

   // @GetMapping("/check")
    //public String index(){
      //return "success";
    //}



  @PostMapping("/generate")
    public String generator(@RequestBody Otp number){
        service.sample(number);
        return "success";

    }

    @PostMapping("/validation")
    public boolean verifyOtp(@RequestBody Otp data){
        return service.verification(data);
    }


}
