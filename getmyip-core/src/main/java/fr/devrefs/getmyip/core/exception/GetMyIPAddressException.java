/*
 * Copyright 2020 https://github.com/stefv
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.devrefs.getmyip.core.exception;

/**
 * General exception.
 *
 */
public class GetMyIPAddressException extends Exception {

	/**
	 * Serialization ID.
	 */
	private static final long serialVersionUID = -3803641352954408498L;

	/**
	 * Create the exception with the given message.
	 * 
	 * @param message The message of the exception.
	 */
	public GetMyIPAddressException(String message) {
		super(message);
	}

	/**
	 * Create the exception with the given cause.
	 * 
	 * @param cause The cause.
	 */
	public GetMyIPAddressException(Throwable cause) {
		super(cause);
	}

	/**
	 * Create the exception with the given message and the cause.
	 * 
	 * @param message The message of the exception.
	 * @param cause   The cause.
	 */
	public GetMyIPAddressException(String message, Throwable cause) {
		super(message, cause);
	}
}
