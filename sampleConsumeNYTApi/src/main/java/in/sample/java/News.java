package in.sample.java;

import java.io.Serializable;

public class News implements Serializable {

	private String title;
	private String section;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

}