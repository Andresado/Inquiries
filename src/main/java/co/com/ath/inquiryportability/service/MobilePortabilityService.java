package co.com.ath.inquiryportability.service;

import co.com.ath.inquiryportability.model.MobilePortability;
import co.com.ath.inquiryportability.repository.MobilePortabilityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author lmeza
 *
 */
@Service("IMobilePortabilityService")
public class MobilePortabilityService implements IMobilePortabilityService {

    @Autowired
    public MobilePortabilityRepository mobilePortabilityRepository;

    @Override
    public MobilePortability getMobilePortabilityByTarget(String target) {
        MobilePortability obj = mobilePortabilityRepository.findByTarget(target);
        MobilePortability objPortability = new MobilePortability();
        
        obj.setReceiver_carrier(objPortability.getReceiver_carrier());
        
        return objPortability;
    }
    

}
