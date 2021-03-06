/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhProductCapacityItemCheckedException extends Exception {

	public WhProductCapacityItemCheckedException() {
		super();
	}

	public WhProductCapacityItemCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhProductCapacityItemCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhProductCapacityItemCheckedException(String message) {
		super(message);
	}

	public WhProductCapacityItemCheckedException(Throwable cause) {
		super(cause);
	}


}
