package co.com.ath.inquiryportability.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Clase para definir la respuesta de portabilidad
 * 
 * @author lmeza
 *
 */
public class MobilePortabilityResponse {

	private int receiver_carrier;
	private int previous_carrier;
	private int original_carrier;

	@JsonFormat(pattern = "dd/MM/yyyy")

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date portability_start_date;

	public int getReceiver_carrier() {
		return receiver_carrier;
	}

	public void setReceiver_carrier(int receiver_carrier) {
		this.receiver_carrier = receiver_carrier;
	}

	public int getPrevious_carrier() {
		return previous_carrier;
	}

	public void setPrevious_carrier(int previous_carrier) {
		this.previous_carrier = previous_carrier;
	}

	public int getOriginal_carrier() {
		return original_carrier;
	}

	public void setOriginal_carrier(int original_carrier) {
		this.original_carrier = original_carrier;
	}

	public Date getPortability_start_date() {
		return portability_start_date;
	}

	public void setPortability_start_date(Date portability_start_date) {
		this.portability_start_date = portability_start_date;
	}

}
