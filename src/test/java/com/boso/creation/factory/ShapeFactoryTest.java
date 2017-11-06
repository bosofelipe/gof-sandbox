package com.boso.creation.factory;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.boso.creational.factory.FactoryException;
import com.boso.creational.factory.Shape;
import com.boso.creational.factory.ShapeFactory;

@RunWith(JUnitPlatform.class)
public class ShapeFactoryTest {

	private ShapeFactory factory = new ShapeFactory();

	@Test
	public void createSquareShape() throws Exception {
		Shape shape = factory.getShape("square");
		MatcherAssert.assertThat(shape.draw(), CoreMatchers.equalTo("This is a square"));
	}

	@Test
	public void createSquareShapeUpperCaseType() throws Exception {
		Shape shape = factory.getShape("SQUARE");
		MatcherAssert.assertThat(shape.draw(), CoreMatchers.equalTo("This is a square"));
	}

	@Test
	public void createRectangleShape() throws Exception {
		Shape shape = factory.getShape("rectangle");
		MatcherAssert.assertThat(shape.draw(), CoreMatchers.equalTo("This is a rectangle"));
	}

	@Test
	public void createRectangleShapeUpperCaseType() throws Exception {
		Shape shape = factory.getShape("RECTANGLE");
		MatcherAssert.assertThat(shape.draw(), CoreMatchers.equalTo("This is a rectangle"));
	}

	@Test
	public void createCircleShape() throws Exception {
		Shape shape = factory.getShape("circle");
		MatcherAssert.assertThat(shape.draw(), CoreMatchers.equalTo("This is a circle"));
	}

	@Test
	public void createCircleShapeUpperCaseType() throws Exception {
		Shape shape = factory.getShape("CIRCLE");
		MatcherAssert.assertThat(shape.draw(), CoreMatchers.equalTo("This is a circle"));
	}

	@Test
	public void errorWhenNullType() throws Exception {
		Assertions.assertThrows(FactoryException.class, () -> {
			factory.getShape(null);
		});
	}

	@Test
	public void errorWhenInvalidType() throws Exception {
		Assertions.assertThrows(FactoryException.class, () -> {
			factory.getShape("losangle");
		});
	}
}
