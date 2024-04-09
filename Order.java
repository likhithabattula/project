public class Order {

	private int orderId;
	private int customerId;
	private int designerId;
	private Date orderDate;
	private Date deliveryDate;
	private String status;

	/**
	 * 
	 * @param customerId
	 * @param designerId
	 * @param orderDate
	 * @param deliveryDate
	 */
	public boolean placeOrder(int customerId, int designerId, Date orderDate, Date deliveryDate) {
		// TODO - implement Order.placeOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param orderId
	 */
	public String trackOrder(int orderId) {
		// TODO - implement Order.trackOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param orderId
	 * @param newStatus
	 */
	public boolean updateStatus(int orderId, String newStatus) {
		// TODO - implement Order.updateStatus
		throw new UnsupportedOperationException();
	}

}