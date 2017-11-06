package com.boso.creation.abstractfactory;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.boso.creational.factory.FactoryException;
import com.boso.creational.factory.Shape;

@RunWith(JUnitPlatform.class)
public class AbstractFactoryTest {

	AbstractFactory colorFactory = FactoryProducer.getFactory("color");
	AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

	
	@Test
	void fillRedColor() throws Exception {
		Color color = colorFactory.getColor("Red");
		MatcherAssert.assertThat("Filling red color", CoreMatchers.equalTo(color.fill()));
	}
	
	@Test
	void fillGreenColor() throws Exception {
		Color color = colorFactory.getColor("Green");
		MatcherAssert.assertThat("Filling green color", CoreMatchers.equalTo(color.fill()));
	}
	
	@Test
	void fillBlueColor() throws Exception {
		Color color = colorFactory.getColor("Blue");
		MatcherAssert.assertThat("Filling blue color", CoreMatchers.equalTo(color.fill()));
	}
	
	@Test
	void drawSquare() throws Exception {
		Shape shape = shapeFactory.getShape("Square");
		MatcherAssert.assertThat("This is a square", CoreMatchers.equalTo(shape.draw()));
	}
	
	@Test
	void drawRectangle() throws Exception {
		Shape shape = shapeFactory.getShape("Rectangle");
		MatcherAssert.assertThat("This is a rectangle", CoreMatchers.equalTo(shape.draw()));
	}
	
	@Test
	void drawCircle() throws Exception {
		Shape shape = shapeFactory.getShape("Circle");
		MatcherAssert.assertThat("This is a circle", CoreMatchers.equalTo(shape.draw()));
	}
	
	@Test
	void errorWhenInvalidTypeColor() {
		Assertions.assertThrows(FactoryException.class, () -> {
			FactoryProducer.getFactory("xyz");
		});
	}
}
