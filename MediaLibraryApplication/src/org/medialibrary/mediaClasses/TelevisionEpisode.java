package org.medialibrary.mediaClasses;

import org.medialibrary.mediaAbstracts.VideoItem;

public class TelevisionEpisode extends VideoItem {
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public int getEpisodeNumber() {
		return episodeNumber;
	}
	public void setEpisodeNumber(int episodeNumber) {
		this.episodeNumber = episodeNumber;
	}
	int season;
	int episodeNumber;

}
