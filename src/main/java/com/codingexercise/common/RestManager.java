package com.codingexercise.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class RestManager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1140620262576234338L;

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
 
	private RestTemplate restTemplate;

	private static RestManager instance = null;

	private RestManager() {
		try
		{
		restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();        
        //Add the Jackson Message converter
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		// Note: here we are making this converter to process any kind of response, 
		// not only application/*json, which is the default behaviour
		List<MediaType> tempListMediaType = new ArrayList<MediaType>();
		tempListMediaType.add(MediaType.ALL);
		converter.setSupportedMediaTypes(tempListMediaType);//         Arrays.asList({MediaType.ALL}));         
		messageConverters.add(converter);  
		restTemplate.setMessageConverters(messageConverters);  
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		int iaaa = 0;
		iaaa =iaaa;
	}

	public static RestManager getInstance() {
		if (instance == null) {
			instance = new RestManager();
		}
		return instance;
	}

	public enum AvailableServices {

		READ_HOTEL_DEALS("https://offersvc.expedia.com/offers", "/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel", HttpMethod.GET);

		AvailableServices(String serviceName, String servicePath, HttpMethod httpMethod) {
			this.serviceName = serviceName;
			this.servicePath = servicePath;
			this.httpMethod = httpMethod;
		}

		private String serviceName;
		private String servicePath;
		private HttpMethod httpMethod;

		public String getServiceName() {
			return serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServicePath() {
			return servicePath;
		}

		public void setServicePath(String servicePath) {
			this.servicePath = servicePath;
		}

		public HttpMethod getHttpMethod() {
			return httpMethod;
		}

		public void setHttpMethod(HttpMethod httpMethod) {
			this.httpMethod = httpMethod;
		}

		public String buildServicePath() {
			return this.serviceName + this.servicePath;
		}
	}

}
