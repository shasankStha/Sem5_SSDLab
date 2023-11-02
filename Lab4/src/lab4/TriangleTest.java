package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class TriangleTest {
	
	
	@Test
	void testIsIsosceles() {
		Triangle tri = new Triangle(5,5,7); //Constructor with three parameters tested
		assertTrue(tri.isIsosceles());
	}
	
	@RepeatedTest(10)
	void testIsEquilateral() {
		Triangle tri = new Triangle(); //Constructor with no parameter tested
		assertTrue(tri.isEquilateral());
	}
	
	@Test 
	void testIsScalene() {
		Triangle tri = new Triangle(5,6,7);
		assertTrue(tri.isScalene());
	}
	
	@ParameterizedTest
	@CsvSource({"1,2,4","2,3,4","5,6,7"})
	void testSetSides(int a, int b, int c) {
		Triangle tri = new Triangle();
		tri.setSides(a, b, c);
		assertEquals(a+b+c,tri.getPerimeter());
		tri.setSides(a);	
		assertTrue(tri.isEquilateral());
		tri.setSides(b, c);
		assertTrue(tri.isIsosceles());
	}
	
	@Test
	void testTriangleCopy() {
		Triangle tri = new Triangle(3); 
		Triangle copyTri =tri.copy();
		assertEquals(3,copyTri.getAverageLength()); 
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2})
	void testGetPerimeter(int side) {
		Triangle tri = new Triangle(side);	// Constructor with single pararmeter Tested
		assertEquals(6,tri.getPerimeter());
	}
	
	@ParameterizedTest
	@CsvSource({"2,3,4"})
	void testGetAverageLength(int a, int b, int c) {
		Triangle tri = new Triangle(a,b,c);
		assertEquals(3,tri.getAverageLength());
	}

}
