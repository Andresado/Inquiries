package co.com.ath.inquiryportability.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.ath.inquiryportability.model.MobilePortability;
/**
 * 
 * @author lmeza
 *
 */
@Repository
public interface MobilePortabilityRepository extends JpaRepository<MobilePortability, Long> {

    public MobilePortability findByTarget(String target);
}
