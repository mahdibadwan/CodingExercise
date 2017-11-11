package com.codingexercise.services.hoteldeal;

import java.util.List;

import com.codingexercise.common.HotelDealResponse;
import com.codingexercise.dao.hoteldeal.HotelDealDAO;
import com.codingexercise.dao.hoteldeal.HotelDealDAOImp;
import com.codingexercise.services.ServiceBaseImp;

/**
 * Hotel Deal Service Implementation 
 * @author MBadwan
 *
 */
public class HotelDealServiceImp extends ServiceBaseImp implements HotelDealService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5138410821566488032L;

	private HotelDealDAO hotelDealDAO;

	/**
	 * 
	 */
	public HotelDealServiceImp() {
		super();
		hotelDealDAO = new HotelDealDAOImp();
	}

	public HotelDealDAO getHotelDealDAO() {
		return hotelDealDAO;
	}

	public void setHotelDealDAO(HotelDealDAO hotelDealDAO) {
		this.hotelDealDAO = hotelDealDAO;
	}

	@Override
	public HotelDealResponse loadHotelDeals(List<String> parameters) throws Exception {
		return hotelDealDAO.getHotelDeals(parameters).getBody();
	}

}
