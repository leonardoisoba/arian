package com.arian.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import com.adobe.cq.sightly.WCMUsePojo;
import com.arian.core.view.models.SocialsNetwork;

public class TileModel extends WCMUsePojo {

	private String name;
	private String rol;
	private String titleImage;

	private List<SocialsNetwork> socialsNetworks;

	@Override
	public void activate() throws Exception {
		name = getProperties().get("name", "Enter a Name");
		rol = getProperties().get("rol", "Enter a Rol");
		titleImage = getProperties().get("tileImage", "Enter a Title Image");
		socialsNetworks = new ArrayList<>();
		populateSocialNetworks();
	}

	private void populateSocialNetworks() {
		Resource socialsNetworksResource = getResource().getChild("socialsNetworks");
		if(socialsNetworksResource!=null && socialsNetworksResource.hasChildren()) {
			Iterable<Resource> iterSocials = socialsNetworksResource.getChildren();
			for (Resource socialsNetworkRes : iterSocials) {
				SocialsNetwork socialsNetwork = new SocialsNetwork();
				ValueMap snProperties = socialsNetworkRes.getValueMap();
				socialsNetwork.setSocialId(snProperties.get("socialId", ""));
				socialsNetwork.setSocialImage(snProperties.get("socialImage", ""));
				socialsNetwork.setSocialLink(snProperties.get("socialLink", "#"));
				socialsNetwork.setSocialName(snProperties.get("socialName", ""));
				socialsNetworks.add(socialsNetwork);
			}
		}
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

	public List<SocialsNetwork> getSocialsNetworks() {
		return socialsNetworks;
	}
	
}
