package tn.dari.spring.domain.util;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MeetingForm {
	
	@JsonFormat(pattern = "dd-mm-yyyy")
	Date date;
	int fromHour;
	int toHour;
	public MeetingForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getFromHour() {
		return fromHour;
	}
	public void setFromHour(int fromHour) {
		this.fromHour = fromHour;
	}
	public int getToHour() {
		return toHour;
	}
	public void setToHour(int toHour) {
		this.toHour = toHour;
	}
	
}
