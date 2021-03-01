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
 * Exception when the IP address is invalid.
 *
 */
public class InvalidIPAddressException extends GetMyIPAddressException {

	/**
	 * Serialization ID.
	 */
	private static final long serialVersionUID = 5484816548984747417L;

	/**
	 * Create the exception with the given IP address.
	 * 
	 * @param ipAddress The IP address.
	 */
	public InvalidIPAddressException(final String ipAddress) {
		super("Invalid IP address: " + ipAddress);
	}
}
