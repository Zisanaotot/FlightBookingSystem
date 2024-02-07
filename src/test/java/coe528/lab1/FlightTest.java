/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import coe528.lab1.Flight;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author afares
 */
public class FlightTest {
    
    public FlightTest() {
    }

    private Flight z, x;
	private int a, b;
	private double f;
	private String c, d, e;

	@BeforeEach
	public void setUp() throws Exception {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
                
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testConstructor() {
        boolean actual = false;
        Flight f1 = new Flight(0, "Toronto", "Montreal", "02/09/2004", 300, 250);
        if(f1.getFlightNumber() == 0 && f1.getOrigin().equals("Toronto") && f1.getDestination().equals("Montreal") && f1.getDepartureTime().equals("02/09/2004") && f1.getCapacity() == 300 && f1.getOriginalPrice() == 250)
            actual = true;
        boolean expected= true;
        assertEquals(expected, actual);
	}
        
        @org.junit.jupiter.api.Test
        @Test
        public void testInvalidConstructor(){
            boolean actual = false;
            boolean expected = true;
            try {
            x = new Flight(0, "Montreal", "Montreal", "02/09/2004", 300, 250); }
            catch(IllegalArgumentException d) {
            actual = true;
            }
        assertEquals(expected, actual);
        }

	@org.junit.jupiter.api.Test
        @Test
	public void testGetOrigin() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		assertEquals("Toronto", z.getOrigin());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testSetOrigin() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		z.setOrigin("Orlando");
		assertEquals("Orlando", z.getOrigin());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testGetFlightNumber() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		assertEquals(1030, z.getFlightNumber());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testSetFlightNumber() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		z.setFlightNumber(999);
		assertEquals(999, z.getFlightNumber());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testGetDestination() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		assertEquals("Kolkata", z.getDestination());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testSetDestination() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		z.setDestination("Montreal");
		assertEquals("Montreal", z.getDestination());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testGetDepartureTime() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		assertEquals("03/02/99 7:50pm", z.getDepartureTime());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testSetDepartureTime() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		z.setDepartureTime("1234");
		assertEquals("1234", z.getDepartureTime());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testGetCapacity() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		assertEquals(500, z.getCapacity());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testSetCapacity() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		z.setCapacity(123);
		assertEquals(123, z.getCapacity());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testGetNumberOfSeatsLeft() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		assertEquals(500, z.getNumberOfSeatsLeft());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testSetNumberOfSeatsLeft() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		z.setNumberOfSeatsLeft(30);
		assertEquals(30, z.getNumberOfSeatsLeft());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testGetOriginalPrice() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		assertEquals(1000, z.getOriginalPrice());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testSetOriginalPrice() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		z.setOriginalPrice(987);
		assertEquals(987, z.getOriginalPrice());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testBookASeat() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		z.bookASeat();
		assertEquals(499, z.getNumberOfSeatsLeft());
	}

	@org.junit.jupiter.api.Test
        @Test
	public void testToString() {
            z = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50pm", 500, 1000);
		assertNotNull(z.toString());
	}

}