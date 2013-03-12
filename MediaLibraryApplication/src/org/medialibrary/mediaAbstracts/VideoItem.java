package org.medialibrary.mediaAbstracts;

import java.util.ArrayList;

public abstract class VideoItem extends MediaItem {
	String director;
	ArrayList<String> cast = new ArrayList<String>();
	int runtimeInMinutes;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public ArrayList<String> getCast() {
		return cast;
	}
	public void setCast(ArrayList<String> cast) {
		this.cast = cast;
	}
	public int getRuntimeInMinutes() {
		return runtimeInMinutes;
	}
	public void setRuntimeInMinutes(int runtimeInMinutes) {
		this.runtimeInMinutes = runtimeInMinutes;
	}

}
