package java8;

import java.io.Serializable;

public interface IdentifiableEnum<ID extends Serializable> extends Serializable {

	public static final String	GET_ID_METHOD_NAME		= "getId";
	public static final String	GET_BY_ID_METHOD_NAME	= "getById";

	public ID getId();

}

