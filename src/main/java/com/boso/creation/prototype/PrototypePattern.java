package com.boso.creation.prototype;

public class PrototypePattern {

	public Shape getCacheClonedObject(String id) {
		ShapeCache.loadCache();
		Shape clonedShape = (Shape) ShapeCache.getShape(id);
		return clonedShape;
	}
}
