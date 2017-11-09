package com.boso.creation.prototype;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class PrototypePatternTest {

	private PrototypePattern prototype = new PrototypePattern();
	
	
	@Test
	void loadShapeFromCache() throws Exception {
		Shape shape = prototype.getCacheClonedObject("1");
		assertThat(shape.draw(), equalTo("Inside Circle::draw() method."));
	}
	
	@Test
	void loadShapeSquareFromCache() throws Exception {
		Shape shape = prototype.getCacheClonedObject("2");
		assertThat(shape.draw(), equalTo("Inside Square::draw() method."));
	}

	@Test
	void loadShapeRectangleFromCache() throws Exception {
		Shape shape = prototype.getCacheClonedObject("3");
		assertThat(shape.draw(), equalTo("Inside Rectangle::draw() method."));
	}
	
}
