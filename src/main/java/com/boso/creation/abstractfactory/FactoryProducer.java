package com.boso.creation.abstractfactory;

import com.boso.creational.factory.FactoryException;
import com.boso.creational.factory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}

		throw new FactoryException("Error on create an object");
	}
}
