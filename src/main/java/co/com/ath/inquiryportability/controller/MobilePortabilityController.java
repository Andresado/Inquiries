package co.com.ath.inquiryportability.controller;

import co.com.ath.inquiryportability.model.MobilePortability;
import co.com.ath.inquiryportability.service.MobilePortabilityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 
 * @author Luis Meza 
 * Rest Controller que expone la operacion
 * portabilidad/numerica/target/{numeroCedular} Retorna un Json
 */

@RestController
@RequestMapping("portabilidad/numerica/")
@Api(value = "Portability target mobile")
public class MobilePortabilityController {

	private static final Logger log = LoggerFactory.getLogger(MobilePortabilityController.class);

	@Autowired
	public MobilePortabilityService mobilePortabilityService;

	@GetMapping(value = "target/{target}", produces = "application/json")
	@ApiOperation(value = "Consulta por numero móvil", notes = "Retorna operador portado reciente")
	public ResponseEntity<MobilePortability> getMobilePortabilityByTarget(@PathVariable("target") String target) {
		log.info("Se consultó el siguiente movil" + target);
		MobilePortability mobilePortability = mobilePortabilityService.getMobilePortabilityByTarget(target);
		try {
			if (mobilePortability == null) {
				throw new NotFoundException(target);
			}
		} catch (Exception e) {
			log.info("Se presento un problema al consultar el numero " + target);
		}
		return new ResponseEntity<MobilePortability>(mobilePortability, HttpStatus.OK);
	}

}
