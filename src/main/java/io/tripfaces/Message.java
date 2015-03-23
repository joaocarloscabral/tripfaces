package io.tripfaces;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("io.tripfaces.Message")
public class Message extends UINamingContainer {

	enum PropertyKeys {
		target, value, animation, delay, showNavigation, position, expose
	}

	public String getTarget() {
		return (String) getStateHelper().get(PropertyKeys.target);
	}

	public void setTarget(String target) {
		getStateHelper().put(PropertyKeys.target, target);
	}

	public String getValue() {
		return (String) getStateHelper().get(PropertyKeys.value);
	}

	public void setValue(String value) {
		getStateHelper().put(PropertyKeys.value, value);
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

	public String getShowNavigation() {
		return (String) getStateHelper().get(PropertyKeys.showNavigation);
	}

	public void setShowNavigation(String showNavigation) {
		getStateHelper().put(PropertyKeys.showNavigation, showNavigation);
	}

	public void setPosition(String position) {
		getStateHelper().put(PropertyKeys.position, position);
	}

	public String getPosition() {
		return (String) getStateHelper().get(PropertyKeys.position);
	}

	public void setExpose(String expose) {
		getStateHelper().put(PropertyKeys.expose, expose);
	}

	public String getExpose() {
		return (String) getStateHelper().get(PropertyKeys.expose);
	}
}
