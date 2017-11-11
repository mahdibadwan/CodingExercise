package com.codingexercise.services.hoteldeal;

import java.util.List;

import com.codingexercise.common.HotelDealResponse;

/**
 * hotel Deal service interface
 * @author MBadwan
 *
 */
public interface HotelDealService {

	public HotelDealResponse loadHotelDeals(List<String> parameters) throws Exception;

}
