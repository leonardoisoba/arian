package com.arian.core.models;

import com.adobe.cq.sightly.WCMUsePojo;

public class TilesContainerModel extends WCMUsePojo {

	private String title;
	private String subtitle;

	@Override
	public void activate() throws Exception {
		title = getProperties().get("title", "Enter a Title");
		subtitle = getProperties().get("subtitle", String.class);
	}

	public String getTitle() {
		return title;
	}

	public String getSubtitle() {
		return subtitle;
	}

}
