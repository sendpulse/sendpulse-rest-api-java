package com.sendpulse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import com.sendpulse.restapi.Sendpulse;

public class Example {
	// https://login.sendpulse.com/settings/#api
	private static String userId = "";
    private static String secret = "";
	public static void main(String[] args) { 
		Sendpulse sendpulse = new Sendpulse(userId,secret);
		//How to attach files
		byte[] bytes = null;
		try {
			bytes = Files.readAllBytes(Paths.get("example_file_path/example_file_name.pdf"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String content = Base64.getEncoder().encodeToString(bytes);
		Map<String, String> attachments = new HashMap<String, String>();
		attachments.put("example_file_name.pdf", content);
		smtpSendMail(sendpulse,"From Name","fromemail@example.com","Recipient Name","recipient@example.com","<b>HTML BODY</b>","Text body","Subject",attachments);
	}
	
	/**
	 * Sending email via SendPulse SMTP
	 * @param sendpulse
	 * @param from_name
	 * @param from_email
	 * @param name_to
	 * @param email_to
	 * @param html
	 * @param text
	 * @param subject
	 * @param attachments
	 */
	public static void smtpSendMail(Sendpulse sendpulse, String from_name, String from_email, String name_to, String email_to, String html,String text, String subject,Map<String, String> attachments){
		Map<String, Object> from = new HashMap<String, Object>();
		from.put("name", from_name);
		from.put("email", from_email);
		ArrayList<Map> to = new ArrayList<Map>();
		Map<String, Object> elementto = new HashMap<String, Object>();
		elementto.put("name", name_to);
		elementto.put("email", email_to);
		to.add(elementto);
		Map<String, Object> emaildata = new HashMap<String, Object>();
		emaildata.put("html",html);
		emaildata.put("text",text);
		emaildata.put("subject",subject);
		emaildata.put("from",from);
		emaildata.put("to",to);
		if(attachments.size()>0){
			emaildata.put("attachments_binary",attachments);
		}
		Map<String, Object> result = (Map<String, Object>) sendpulse.smtpSendMail(emaildata);
		System.out.println("Results: " + result);
	}
	
}
