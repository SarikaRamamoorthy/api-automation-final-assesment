package org.testing.responsePojo.productDetails;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResponse{
	private List<DataItemResponse> data;

	public void setData(List<DataItemResponse> data){
		this.data = data;
	}
	public List<DataItemResponse> getData(){
		return data;
	}
}