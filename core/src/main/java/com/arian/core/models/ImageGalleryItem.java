package com.arian.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import com.adobe.cq.sightly.WCMUsePojo;
import com.arian.core.view.models.SocialsNetwork;

public class ImageGalleryItem extends WCMUsePojo {

	private String title;
	private String subtitle;
	private String offerttext;
	private String image;
	private String imageAlt ;

	@Override
	public void activate() throws Exception {
		title = getProperties().get("title", "Enter a title");
		subtitle = getProperties().get("subtitle", "Enter a subtitle");
		offerttext = getProperties().get("offerttext", "Enter a offert");
		image = getProperties().get("image", "Enter a image");
		imageAlt = getProperties().get("imageAlt", "Enter a image alternative");
	}

	public String getTitle() {
		return title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public String getOfferttext() {
		return offerttext;
	}

	public String getImage() {
		return image;
	}

	public String getImageAlt() {
		return imageAlt;
	}
	
	
	

}
