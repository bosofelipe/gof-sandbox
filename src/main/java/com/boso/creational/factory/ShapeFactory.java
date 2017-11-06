package com.boso.creational.factory;

import com.boso.creation.abstractfactory.AbstractFactory;
import com.boso.creation.abstractfactory.Color;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			throw new FactoryException("You need pass a shape type");
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		throw new FactoryException("Invalid shapeType to create an object");
	}

	@Override
	public Color getColor(String color) {
		throw new FactoryException("Error on create color");
	}
}
