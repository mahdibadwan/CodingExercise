package com.codingexercise.dao.hoteldeal;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.codingexercise.common.HotelDealResponse;

public interface HotelDealDAO {
	public ResponseEntity<HotelDealResponse> getHotelDeals(List<String> parameters) throws Exception;

}
