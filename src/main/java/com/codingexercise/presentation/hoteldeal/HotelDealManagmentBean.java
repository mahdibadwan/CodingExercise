package com.codingexercise.presentation.hoteldeal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.codingexercise.common.HotelDealResponse;
import com.codingexercise.presentation.BaseBean;
import com.codingexercise.services.hoteldeal.HotelDealService;
import com.codingexercise.services.hoteldeal.HotelDealServiceImp;

/**
 * HotelDealManagmentBean used as viewer object in presentation layer and control requests
 * @author MBadwan
 *
 */
@ManagedBean(name = "hotelDealManagmentBean", eager = true)
@SessionScoped
public class HotelDealManagmentBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2043372660900241332L;
	private String destinationName;
	private String destinationCity;
	private List<String> regionIds;
	private Date minTripStartDate;
	private Date maxTripStartDate;
	private Integer lengthOfStay;
	private Float 	minStarRating;
	private Float 	maxStarRating;
	private Float 	minTotalRate;
	private Float 	maxTotalRate;
	private Float 	minGuestRating;
	private Float 	maxGuestRating;
	
	private HotelDealService hotelDealService;
	private HotelDealResponse hotelDeals;

	/**
	 * 
	 */
	public HotelDealManagmentBean() {
		super();
		hotelDealService = new HotelDealServiceImp();
		destinationName = "";
		destinationCity = "";
		regionIds = new ArrayList<String>();
		
		minTripStartDate = null;
		maxTripStartDate = null;
		lengthOfStay = 0;
		minStarRating = 0.f;
		maxStarRating = 0.f;
		minTotalRate = 0.f;
		maxTotalRate = 0.f;
		minGuestRating = 0.f;
		maxGuestRating = 0.f;
	}
	
	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public List<String> getRegionIds() {
		return regionIds;
	}

	public void setRegionIds(List<String> regionIds) {
		this.regionIds = regionIds;
	}
	public Date getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}

	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public Float getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(Float minStarRating) {
		this.minStarRating = minStarRating;
	}

	public Float getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(Float maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public Float getMinTotalRate() {
		return minTotalRate;
	}

	public void setMinTotalRate(Float minTotalRate) {
		this.minTotalRate = minTotalRate;
	}

	public Float getMaxTotalRate() {
		return maxTotalRate;
	}

	public void setMaxTotalRate(Float maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}

	public Float getMinGuestRating() {
		return minGuestRating;
	}

	public void setMinGuestRating(Float minGuestRating) {
		this.minGuestRating = minGuestRating;
	}

	public Float getMaxGuestRating() {
		return maxGuestRating;
	}

	public void setMaxGuestRating(Float maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}

	public HotelDealResponse getHotelDeals() {
		return hotelDeals;
	}

	public void setHotelDeals(HotelDealResponse hotelDeals) {
		this.hotelDeals = hotelDeals;
	}

	public HotelDealService getHotelDealService() {
		return hotelDealService;
	}

	public void setHotelDealService(HotelDealService hotelDealService) {
		this.hotelDealService = hotelDealService;
	}


	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	private List<String> buildRequestParameters(){
		
		List<String> parameters = new ArrayList<String>();
		if(destinationName != null && !destinationName.isEmpty()){
			parameters.add("destinationName="+ destinationName);
		}else if(destinationCity != null && !destinationCity.isEmpty()){
			parameters.add("destinationCity" + destinationCity);
		}else if(regionIds != null & regionIds.size() != 0){
			String ids = "";
			for(String id: regionIds){
				ids += id +",";
			}
			if(!ids.isEmpty()){
				ids = ids.substring(0, ids.length() - 1);
			}
			parameters.add("regionIds="+regionIds);
		}
	
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		if(minTripStartDate != null){
			parameters.add("minTripStartDate="+":"+ df.format(minTripStartDate));
		}
		if(maxTripStartDate != null){
			parameters.add("maxTripStartDate="+":"+ df.format(maxTripStartDate));
		}
		
		if(lengthOfStay != 0){
			parameters.add("lengthOfStay=" + lengthOfStay);
		}
		
		if(minStarRating != 0.f){
			parameters.add("minStarRating=" + minStarRating);
		}
		
		if(maxStarRating != 0.f){
			parameters.add("maxStarRating=" + maxStarRating);
		}
		
		if(minTotalRate != 0.f){
			parameters.add("minTotalRate=" + minTotalRate);
		}
		if(maxTotalRate != 0.f){
			parameters.add("maxTotalRate=" + maxTotalRate);
		}
		if(minGuestRating != 0.f){
			parameters.add("minGuestRating=" + minGuestRating);
		}
		if(maxGuestRating != 0.f){
			parameters.add("maxGuestRating=" + maxGuestRating);
		}
		return parameters;
		
	}
	public void loadHotelDeals() {
		try {
			hotelDeals = hotelDealService.loadHotelDeals(buildRequestParameters());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
