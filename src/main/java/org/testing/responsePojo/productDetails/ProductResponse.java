package org.testing.responsePojo.productDetails;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResponse{
	private List<DataItem> data;

	public void setData(List<DataItem> data){
		this.data = data;
	}
	public List<DataItem> getData(){
		return data;
	}
}