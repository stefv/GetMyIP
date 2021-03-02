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

import java.net.InetAddress;
import java.net.UnknownHostException;

import fr.devrefs.getmyip.core.exception.GetMyIPAddressException;
import junit.framework.TestCase;

/**
 * Test {@link MyIPTest}.
 */
public class MyIPTest extends TestCase {

	private static final String IPV4_ADDRESS = "192.168.0.123";

	private static final String IPV6_ADDRESS = "2001:db8:85a3:0:0:8a2e:370:7334";

	public void test_get() throws GetMyIPAddressException {
		final IPInfo ipInfo = MyIP.get();
		assertNotNull(ipInfo);
		final String ip = ipInfo.getAsString();
		assertNotNull(ip);
	}

	public void test_ipinfo_ipv4_getAsString() throws UnknownHostException {
		final InetAddress address = InetAddress.getByName(IPV4_ADDRESS);
		final IPInfo ipInfo = new IPInfo(address);
		assertEquals(IPV4_ADDRESS, ipInfo.getAsString());
	}

	public void test_ipinfo_ipv6_getAsString() throws UnknownHostException {
		final InetAddress address = InetAddress.getByName(IPV6_ADDRESS);
		final IPInfo ipInfo = new IPInfo(address);
		final String resultIP = ipInfo.getAsString();
		assertEquals(IPV6_ADDRESS, resultIP);
	}

	public void test_ipinfo_ipv4_isIPV4_true() throws UnknownHostException {
		final InetAddress address = InetAddress.getByName(IPV4_ADDRESS);
		final IPInfo ipInfo = new IPInfo(address);
		assertTrue(ipInfo.isIPV4());
	}

	public void test_ipinfo_ipv6_isIPV6_true() throws UnknownHostException {
		final InetAddress address = InetAddress.getByName(IPV6_ADDRESS);
		final IPInfo ipInfo = new IPInfo(address);
		assertTrue(ipInfo.isIPV6());
	}

	public void test_ipinfo_ipv4_isIPV4_false() throws UnknownHostException {
		final InetAddress address = InetAddress.getByName(IPV6_ADDRESS);
		final IPInfo ipInfo = new IPInfo(address);
		assertFalse(ipInfo.isIPV4());
	}

	public void test_ipinfo_ipv6_isIPV6_false() throws UnknownHostException {
		final InetAddress address = InetAddress.getByName(IPV4_ADDRESS);
		final IPInfo ipInfo = new IPInfo(address);
		assertFalse(ipInfo.isIPV6());
	}
}
