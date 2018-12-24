package java8;

import java.util.HashMap;
import java.util.Map;

public enum ServiceType implements IdentifiableEnum<Byte> {
	USPS(1), //
	UPS(2), //
	DHL(3),
	FEDEX(4);
	

	private final Byte id;

	private static final Map<Byte, ServiceType> lookupMap = new HashMap<Byte, ServiceType>(values().length);
	static {
		for (final ServiceType status : values()) {
			lookupMap.put(status.id, status);
		}
	}

	private ServiceType(final int id) {
		this.id = Byte.valueOf((byte) id);
	}

	public Byte getId() {
		return id;
	}

	public static ServiceType getById(final Byte id) {
		// ValidationUtils.nonNullArgument(id, "id");
		return lookupMap.get(id);
	}

	public String toStringValue() {
		return String.valueOf(getId());
	}

}