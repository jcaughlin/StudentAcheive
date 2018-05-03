package edu.matc.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ReCaptchaVerify {

    private Logger logger = LogManager.getLogger(this.getClass());

    private final String recaptchaVerifySite = "https://www.google.com/recaptcha/api/siteverify";



    private  final String localhostSecretKey = "6LcoVTMUAAAAABdRQl6iFYAg0ubYlOC5npvfvDIv";
    private String localhostRecaptchaResponse;
    private String localhostResponseRemoteIP;


    private String awsPrivateString = "6Ldki1YUAAAAACqVzTqmvgWxySdoXNWtrfoEMNyo";
    private String gRecaptchaResponse;
    private String awsResponseRemoteIP;





}
