package fr.cyriljean.bollywood.bean;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LanguageController {
	public LanguageController() {
	}

	private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();

	public String changeLanguage(String lang) {
		locale = new Locale(lang);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
		return "";
	}

	public Locale getLocale() {
		return locale;
	}

	public String getLanguage() {
		return locale.getLanguage();
	}

}
