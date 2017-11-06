package com.boso.creation.abstractfactory;

import com.boso.creational.factory.FactoryException;
import com.boso.creational.factory.Shape;

public class ColorFactory extends AbstractFactory{

	public Color getColor(String colorType) {
		if (colorType == null) {
			throw new FactoryException("You need pass a shape type");
		}
		if (colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();

		} else if (colorType.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (colorType.equalsIgnoreCase("RED")) {
			return new Red();
		}

		throw new FactoryException("Invalid shapeType to create an object");
	}

	@Override
	public Shape getShape(String color) {
		throw new FactoryException("Error on create shape");
	}
}
