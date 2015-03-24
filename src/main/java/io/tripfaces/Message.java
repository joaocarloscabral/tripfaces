package io.tripfaces;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("io.tripfaces.Message")
public class Message extends UINamingContainer {

	enum PropertyKeys {
		target, value, animation, delay, showNavigation, position, expose,
		canGoPrev, canGoNext, showCloseBox, finishLabel,
		prevLabel, nextLabel, onTripStart, onTripEnd, onTripPause, onTripResume,
		onTripStop, onTripChange, onTripClose
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
	
	public String getCanGoPrev() {
		return (String) getStateHelper().get(PropertyKeys.canGoPrev);
	}

	public void setCanGoPrev(String canGoPrev) {
		getStateHelper().put(PropertyKeys.canGoPrev, canGoPrev);
	}
	
	public String getCanGoNext() {
		return (String) getStateHelper().get(PropertyKeys.canGoNext);
	}

	public void setCanGoNext(String canGoNext) {
		getStateHelper().put(PropertyKeys.canGoNext, canGoNext);
	}
	
	public String getShowCloseBox() {
		return (String) getStateHelper().get(PropertyKeys.showCloseBox);
	}

	public void setShowCloseBox(String showCloseBox) {
		getStateHelper().put(PropertyKeys.showCloseBox, showCloseBox);
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
	
	public String getOnTripStart() {
		return (String) getStateHelper().get(PropertyKeys.onTripStart);
	}

	public void setOnTripStart(String onTripStart) {
		getStateHelper().put(PropertyKeys.onTripStart, onTripStart);
	}
	
	public String getOnTripEnd() {
		return (String) getStateHelper().get(PropertyKeys.onTripEnd);
	}

	public void setOnTripEnd(String onTripEnd) {
		getStateHelper().put(PropertyKeys.onTripEnd, onTripEnd);
	}
	
	public String getOnTripPause() {
		return (String) getStateHelper().get(PropertyKeys.onTripPause);
	}

	public void setOnTripPause(String onTripPause) {
		getStateHelper().put(PropertyKeys.onTripPause, onTripPause);
	}
	
	public String getOnTripResume() {
		return (String) getStateHelper().get(PropertyKeys.onTripResume);
	}

	public void setOnTripResume(String onTripResume) {
		getStateHelper().put(PropertyKeys.onTripResume, onTripResume);
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
