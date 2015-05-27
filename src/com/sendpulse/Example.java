package com.sendpulse;
import java.util.Map;

import com.sendpulse.restapi.Sendpulse;
public class Example {
	// https://login.sendpulse.com/settings/#api
    private static String userId = "";
    private static String secret = "";
	public static void main(String[] args) { 
		Sendpulse sendpulse = new Sendpulse(userId,secret);
		Map<String, Object> result = (Map<String, Object>) sendpulse.listAddressBooks(1, 0);
		System.out.println("Result: " + result);
	}
}
