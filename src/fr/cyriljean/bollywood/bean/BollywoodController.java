package fr.cyriljean.bollywood.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class BollywoodController {
	
	public BollywoodController() {
	}

	private String actor = "";
	private String name = "";
	private String img = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		switch (actor) {
		case "aamir":
			this.actor = actor;
			this.name = "Aamir Khan";
			this.img = "/resources/img/aamir.jpg";
			break;
			
		case "karishma":
			this.actor = actor;
			this.name = "Karishma Kapoor";
			this.img = "/resources/img/karishma.jpg";
			break;

		default:
			this.actor = "";
			this.name = "Tunak Tunak Tun !";
			this.img = "/resources/img/tunak.gif";
			break;
		}
		this.actor = actor;
	}



}
