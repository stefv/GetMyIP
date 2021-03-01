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
package fr.devrefs.getmyip.core;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/**
 * IP informations.
 */
public class IPInfo {

	private InetAddress ipAddress;

	/**
	 * Creates the object with the IP address.
	 * @param ipAddress The {@link InetAddress} for this IP.
	 */
	public IPInfo(final InetAddress ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * Gets the IP address as a string.
	 * 
	 * @return The IP address.
	 */
	public String getAsString() {
		return ipAddress.getHostAddress();
	}

	/**
	 * Tests if the IP Address is an IP v4 address.
	 * 
	 * @return true if IP v4.
	 */
	public boolean isIPV4() {
		return ipAddress instanceof Inet4Address;
	}

	/**
	 * Tests if the IP Address is an IP v6 address.
	 * 
	 * @return true if IP v6.
	 */
	public boolean isIPV6() {
		return ipAddress instanceof Inet6Address;
	}
}
