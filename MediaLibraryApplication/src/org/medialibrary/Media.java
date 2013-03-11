package org.medialibrary;

import java.awt.image.BufferedImage;

public class Media {
	
	public String title;
	public String genre;
	public String publisher;
	public BufferedImage mediaItemPreview;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BufferedImage getMediaItemPreview() {
		return mediaItemPreview;
	}

	public void setMediaItemPreview(BufferedImage mediaItemPreview) {
		this.mediaItemPreview = mediaItemPreview;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
