package co.com.ath.inquiryportability.controller;

import co.com.ath.inquiryportability.model.MobilePortability;
import co.com.ath.inquiryportability.model.MobilePortabilityResponse;
import co.com.ath.inquiryportability.service.MobilePortabilityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 
 * @author Luis Meza Rest Controller que expone la operacion
 *         portabilidad/numerica/target/{numeroCedular} Retorna un Json
 */

@RestController
@RequestMapping("inquiry/portability/")
@Api(value = "Portability target mobile")
public class MobilePortabilityController {

	private static final Logger log = LoggerFactory.getLogger(MobilePortabilityController.class);

	@Autowired
	public MobilePortabilityService mobilePortabilityService;

	@GetMapping(value = "target/{target}", produces = "application/json")
	@ApiOperation(value = "Consulta por numero móvil", notes = "Retorna operador portado reciente")
	public MobilePortabilityResponse getMobilePortabilityByTarget(@PathVariable("target") String target) {
		log.info("Se procede a consular el siguiente movil" + target);
		try {
			if (target == null || target == "") {
				throw new NotFoundException(target);
			}

			MobilePortability mobilePortability = mobilePortabilityService.getMobilePortabilityByTarget(target);
			MobilePortabilityResponse responsePortability = new MobilePortabilityResponse();
			responsePortability.setReceiver_carrier(mobilePortability.getReceiver_carrier());
			responsePortability.setPrevious_carrier(mobilePortability.getPrevious_carrier());
			responsePortability.setOriginal_carrier(mobilePortability.getOriginal_carrier());
			responsePortability.setPortability_start_date(mobilePortability.getPortability_start_date());
			return responsePortability;
		} catch (Exception e) {
			log.error("Se presento un problema al tratar de retornar informacion para  " + target);
		}

		return null;

	}

}
