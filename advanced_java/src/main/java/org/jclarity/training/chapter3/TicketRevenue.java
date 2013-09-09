package org.jclarity.training.chapter3;

import java.math.BigDecimal;

/**
 * TicketRevenue business logic.
 */
public class TicketRevenue {

    // This method is provided so that the test class compiles
	public BigDecimal estimateTotalRevenue(int numberOfTicketsSold) {
		BigDecimal totalRevenue = BigDecimal.ZERO;
		if (numberOfTicketsSold == 1) {
			totalRevenue = new BigDecimal("30");
		}
		return totalRevenue;
	}
}