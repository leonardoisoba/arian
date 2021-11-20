package com.arian.core.models;

import java.util.List;

import com.adobe.cq.sightly.WCMUsePojo;
import com.arian.core.view.models.SocialsNetworks;

public class TileModel extends WCMUsePojo {

	private String name;
	private String rol;
	private String titleImage;

	private List<SocialsNetworks> socialsNetworks;

	@Override
	public void activate() throws Exception {
		name = getProperties().get("name", "Enter a Name");
		rol = getProperties().get("rol", "Enter a Rol");
		titleImage = getProperties().get("tileImage", "Enter a Title Image");
		//socialsNetworks = getProperties().get("socialsNetworks", SocialsNetworks.class);
	}

	public String getName() {
		return name;
	}

	public String getRol() {
		return rol;
	}

	public String getTitleImage() {
		return titleImage;
	}
	
}
