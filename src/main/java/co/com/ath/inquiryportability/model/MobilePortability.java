package co.com.ath.inquiryportability.model;

import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 
 * @author lmeza
 *
 */
@Entity
@Table(name = "MOBILE_PORTABILITY")
public class MobilePortability {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	@ApiModelProperty(value = "Id mobile portability", required = true)
	public int id;
	@Column(name = "TARGET")
	@ApiModelProperty(value = "Target mobile portability", required = true)
	public String target;
	@Column(name = "PREVIOUS_CARRIER")
	@ApiModelProperty(value = "Previous carrier mobile portability", required = true)
	public int previous_carrier;
	@Column(name = "RECEIVER_CARRIER")
	@ApiModelProperty(value = "Receiver carrier mobile portability", required = true)
	public int receiver_carrier;
	@Column(name = "ORIGINAL_CARRIER")
	@ApiModelProperty(value = "Original carrier mobile portability", required = true)
	public int original_carrier;
	@Column(name = "PORTABILITY_START_DATE")
	@ApiModelProperty(value = "Portability Start Date carrier mobile portability", required = true)
	public Date portability_start_date;
	@Column(name = "PORTABILITY_ID")
	@ApiModelProperty(value = "Portability id mobile portability", required = true)
	public String portability_id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public int getPrevious_carrier() {
		return previous_carrier;
	}
	public void setPrevious_carrier(int previous_carrier) {
		this.previous_carrier = previous_carrier;
	}
	public int getReceiver_carrier() {
		return receiver_carrier;
	}
	public void setReceiver_carrier(int receiver_carrier) {
		this.receiver_carrier = receiver_carrier;
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
	public String getPortability_id() {
		return portability_id;
	}
	public void setPortability_id(String portability_id) {
		this.portability_id = portability_id;
	}
	

}
