package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BwtConverterTest {
	
	@Test
	public void testGetLSequence() {
		BwtConverter bwtConverter = new BwtConverter();
		Bwt bwt = bwtConverter.getLSequence("banana");
		assertEquals("annb$aa", bwt.L);
		assertEquals("$aaabnn", bwt.F);
	}
}
