package org.ecom.ama;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient 
/* or  @EnableEurekaClient */
public class AmaCatalogController {
	@RequestMapping(value="/catalog",method=RequestMethod.GET)
	public List<Catalog> getCatalogDetails()
	{
		Catalog catalog1=new Catalog(101,"Mobile",true,324.34f);
		Catalog catalog2=new Catalog(102,"Groceries",true,456.34f);
		Catalog catalog3=new Catalog(103,"Clothing",true,3254.34f);
		Catalog catalog4=new Catalog(104,"Kitchen",true,4354.34f);
		List<Catalog> catlogList=new ArrayList<>();
		catlogList.add(catalog1);
		catlogList.add(catalog2);
		catlogList.add(catalog3);
		catlogList.add(catalog4);;
		return catlogList;

	}
}
