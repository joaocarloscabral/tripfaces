package io.tripfaces;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("io.tripfaces.Tour")
public class Tour extends UINamingContainer {

	enum PropertyKeys {
		theme, widgetVar, showHeader, header, animation, delay, showCloseBox, showNavigation, backToTopWhenEnded, onStart, onEnd, onTripStop, onTripChange, onTripClose
	}

	public String getTheme() {
		return (String) getStateHelper().get(PropertyKeys.theme);
	}

	public void setTheme(String theme) {
		getStateHelper().put(PropertyKeys.theme, theme);
	}

	public String getWidgetVar() {
		return (String) getStateHelper().get(PropertyKeys.widgetVar);
	}

	public void setWidgetVar(String widgetVar) {
		getStateHelper().put(PropertyKeys.widgetVar, widgetVar);
	}

	public String getShowHeader() {
		return (String) getStateHelper().get(PropertyKeys.showHeader);
	}

	public void setShowHeader(String showHeader) {
		getStateHelper().put(PropertyKeys.showHeader, showHeader);
	}

	public String getHeader() {
		return (String) getStateHelper().get(PropertyKeys.header);
	}

	public void setHeader(String header) {
		getStateHelper().put(PropertyKeys.header, header);
	}

	public String getAnimation() {
		return (String) getStateHelper().get(PropertyKeys.animation);
	}

	public void setAnimation(String animation) {
		getStateHelper().put(PropertyKeys.animation, animation);
	}

	public void setDelay(String delay) {
		getStateHelper().put(PropertyKeys.delay, delay);
	}

	public String getDelay() {
		return (String) getStateHelper().get(PropertyKeys.delay);
	}

	public String getShowCloseBox() {
		return (String) getStateHelper().get(PropertyKeys.showCloseBox);
	}

	public void setShowCloseBox(String showCloseBox) {
		getStateHelper().put(PropertyKeys.showCloseBox, showCloseBox);
	}

	public String getShowNavigation() {
		return (String) getStateHelper().get(PropertyKeys.showNavigation);
	}

	public void setShowNavigation(String showNavigation) {
		getStateHelper().put(PropertyKeys.showNavigation, showNavigation);
	}
	
	public String getBackToTopWhenEnded() {
		return (String) getStateHelper().get(PropertyKeys.backToTopWhenEnded);
	}
	
	public void setBackToTopWhenEnded(String backToTopWhenEnded) {
		getStateHelper().put(PropertyKeys.backToTopWhenEnded, backToTopWhenEnded);
	}
	
	public String getOnStart() {
		return (String) getStateHelper().get(PropertyKeys.onStart);
	}
	
	public void setOnStart(String onStart) {
		getStateHelper().put(PropertyKeys.onStart, onStart);
	}
	
	public String getOnEnd() {
		return (String) getStateHelper().get(PropertyKeys.onEnd);
	}	
	
	public void setOnEnd(String onEnd) {
		getStateHelper().put(PropertyKeys.onEnd, onEnd);
	}
	
	public String getOnTripStop() {
		return (String) getStateHelper().get(PropertyKeys.onTripStop);
	}	

	public void setOnTripStop(String onTripStop) {
		getStateHelper().put(PropertyKeys.onTripStop, onTripStop);
	}
	
	public String getOnTripChange() {
		return (String) getStateHelper().get(PropertyKeys.onTripChange);
	}
	
	public void setOnTripChange(String onTripChange) {
		getStateHelper().put(PropertyKeys.onTripChange, onTripChange);
	}
	
	public String getOnTripClose() {
		return (String) getStateHelper().get(PropertyKeys.onTripClose);
	}
	
	public void setOnTripClose(String onTripClose) {
		getStateHelper().put(PropertyKeys.onTripClose, onTripClose);
	}		
	 
}
