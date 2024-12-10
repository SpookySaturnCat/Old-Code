
public class Class {
public double radius;

public Class() {
	this(10);
}

public Class (double radius) {
	this.radius = radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}

public double getRadius() {
	return radius;
}
public double getArea() {
	return radius * radius * Math.PI;
}
public String toString() {
	return "radius " + radius + " area: " + getArea();
}
}
