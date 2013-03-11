package org.medialibrary.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.medialibrary.Media;

public class MediaTest {

	Media media;
	String initialTitle;
	String newTitle;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		media = new Media();
		initialTitle = "The Shawshank Redemption";
		newTitle = "Fight Club";
	}

	@After
	public void tearDown() throws Exception {
		initialTitle = null;
		media = null;
	}

	@Test
	public void testGetTitle() {
		media.setTitle(initialTitle);
		assertEquals(initialTitle, media.getTitle());
	}
	
	@Test
	public void testSetTitle() {
		media.setTitle(newTitle);
		assertEquals(newTitle, media.title);
	}



}
