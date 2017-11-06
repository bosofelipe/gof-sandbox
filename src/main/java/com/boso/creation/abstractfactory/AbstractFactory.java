package com.boso.creation.abstractfactory;

import com.boso.creational.factory.Shape;

public abstract class AbstractFactory {

	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
