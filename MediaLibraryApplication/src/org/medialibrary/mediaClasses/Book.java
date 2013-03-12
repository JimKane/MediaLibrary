package org.medialibrary.mediaClasses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.medialibrary.mediaAbstracts.MediaItem;
@Entity
@Table(name = "BOOKS")
public class Book extends MediaItem {
	@Id
	@GeneratedValue
	String author;
	String language;
	int numberOfPages;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

}
