package src.main.java.org.tripfaces;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("org.tripfaces.Tour")
public class Tour extends UINamingContainer {
	
	enum PropertyKeys {
		theme, widgetVar, showHeader, header, animation, showCloseBox, showNavigation, backToTopWhenEnded, onStart, onEnd,
		finishLabel, prevLabel, nextLabel, enableKeyBinding, enableAnimation, skipUndefinedTrip
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
	
	public String getFinishLabel() {
		return (String) getStateHelper().get(PropertyKeys.finishLabel);
	}
	
	public void setFinishLabel(String finishLabel) {
		getStateHelper().put(PropertyKeys.finishLabel, finishLabel);
	}	
	
	public String getPrevLabel() {
		return (String) getStateHelper().get(PropertyKeys.prevLabel);
	}
	
	public void setPrevLabel(String prevLabel) {
		getStateHelper().put(PropertyKeys.prevLabel, prevLabel);
	}	
	
	public String getNextLabel() {
		return (String) getStateHelper().get(PropertyKeys.nextLabel);
	}
	
	public void setNextLabel(String nextLabel) {
		getStateHelper().put(PropertyKeys.nextLabel, nextLabel);
	}
	
	public String getEnableKeyBinding() {
		return (String) getStateHelper().get(PropertyKeys.enableKeyBinding);
	}
	
	public void setEnableKeyBinding(String enableKeyBinding) {
		getStateHelper().put(PropertyKeys.enableKeyBinding, enableKeyBinding);
	}	
	
	public String getEnableAnimation() {
		return (String) getStateHelper().get(PropertyKeys.enableAnimation);
	}
	
	public void setEnableAnimation(String enableAnimation) {
		getStateHelper().put(PropertyKeys.enableAnimation, enableAnimation);
	}	
	
	public String getSkipUndefinedTrip() {
		return (String) getStateHelper().get(PropertyKeys.skipUndefinedTrip);
	}
	
	public void setSkipUndefinedTrip(String skipUndefinedTrip) {
		getStateHelper().put(PropertyKeys.skipUndefinedTrip, skipUndefinedTrip);
	}
}
