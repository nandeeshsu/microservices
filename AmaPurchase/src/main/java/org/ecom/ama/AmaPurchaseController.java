package org.ecom.ama;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class AmaPurchaseController {
	//method to return the list of catalog received my AmazonCatalogService (MS)
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/purchase",method=RequestMethod.GET)
	public List<Catalog> getAllCatalogs()
	{
		String url="http://AMAZONCATALOG/catalog";
		//exchange request sent to purchase with catalog by using specified parameters
		//p1 -> url to redirect , p2-> type of HTTP method , p3-> type of response expected. By def JSON and can be changed
		//p4->It must match with ResponseEntity type.It is to ensure that new URL
		//returns response in same format as of current URL
		ResponseEntity<List<Catalog>> catalogResponse=restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<Catalog>>() {
		});
		return catalogResponse.getBody();
	}
}
