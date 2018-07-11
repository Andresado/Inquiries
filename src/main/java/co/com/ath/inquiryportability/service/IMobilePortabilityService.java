package co.com.ath.inquiryportability.service;


import co.com.ath.inquiryportability.model.MobilePortability;
/**
 * 
 * @author lmeza
 *
 */
public interface IMobilePortabilityService {

    public MobilePortability getMobilePortabilityByTarget(String target);
}
