package com.nt.rotator;

import java.util.Random;
public class AddRotator {
	
	private String links[]= {"https://www.raymond.in/","https://www.panasonic.com/in/","https://www.samsung.com/in/","https://mobile.mi.com/in/","https://www.oppo.com/en/"};
	private String images[]= {"images/raymond.jpg","images/panasonic.jpg","images/samsung.jpg","images/mi.jpg","images/oppo.jpg"};
	
	public String[] getLinks() {
		return links;
	}
	public void setLinks(String[] links) {
		this.links = links;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	
	int counter=0;
	
	public void nextAdvertisement() {
		Random rad=new Random();
			counter=rad.nextInt(5);
	}
	
	public String getImage() {
		return images[counter];
	}
	
	public String getLink() {
		return links[counter];
	}
	
	
	
	

}
