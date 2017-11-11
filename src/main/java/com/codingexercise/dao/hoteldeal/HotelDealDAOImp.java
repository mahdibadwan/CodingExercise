package com.codingexercise.dao.hoteldeal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.util.UriComponentsBuilder;

import com.codingexercise.common.HotelDealResponse;
import com.codingexercise.common.RestManager;
import com.codingexercise.common.RestManager.AvailableServices;
import com.codingexercise.dao.DAOBaseImp;

@ManagedBean(name = "hotelDealDAO", eager = true)
@SessionScoped
public class HotelDealDAOImp extends DAOBaseImp implements HotelDealDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4676351622438279795L;

	@Override
	public ResponseEntity<HotelDealResponse> getHotelDeals(List<String> parameters) throws Exception {
		
		String url = AvailableServices.READ_HOTEL_DEALS.buildServicePath();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		for(String param:parameters){
			url += "&"+param;
		}

	    
		ResponseEntity<HotelDealResponse> hotelDealResponse = RestManager.getInstance().getRestTemplate().exchange(url , AvailableServices.READ_HOTEL_DEALS.getHttpMethod(), entity,
				HotelDealResponse.class);
		
		
		// TODO Auto-generated method stub
		return hotelDealResponse;
	}



}
