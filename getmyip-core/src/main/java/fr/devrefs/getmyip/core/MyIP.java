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

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

import fr.devrefs.getmyip.core.exception.GetMyIPAddressException;
import fr.devrefs.getmyip.core.exception.InvalidIPAddressException;

/**
 * Class to get the public IP address.
 */
public class MyIP {

	/**
	 * The URL of the service to retrieve the IP.
	 */
	private static final String IPIFY_URL = "https://api.ipify.org";

	/**
	 * Retrieve the public IP address.
	 * 
	 * @return The {@link IPInfo}.
	 * @throws GetMyIPAddressException Exception.
	 */
	public static IPInfo get() throws GetMyIPAddressException {
		String ip = "unknown";
		try (Scanner s = new Scanner(new URL(IPIFY_URL).openStream(), "UTF-8").useDelimiter("\\A")) {
			ip = s.next();
			final InetAddress ipAddress = InetAddress.getByName(ip);
			return new IPInfo(ipAddress);
		} catch (UnknownHostException e) {
			throw new InvalidIPAddressException(ip);
		} catch (IOException e) {
			throw new GetMyIPAddressException("Can't find the IP address.", e);
		}
	}
}
