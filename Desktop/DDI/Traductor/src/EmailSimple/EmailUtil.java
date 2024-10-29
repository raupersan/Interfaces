package EmailSimple;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {

	public static void sendEmail(Session session, String toEmail, String subject, String body) {
		try {
			MimeMessage msg = new MimeMessage(session);
			msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
		      msg.addHeader("format", "flowed");
		      msg.addHeader("Content-Transfer-Encoding", "8bit");
		      msg.setFrom(new InternetAddress("no_reply@example.com", "NO BIZUM NO RESPONDER"));//Datos de ejemplo	      	      
		      msg.setReplyTo(InternetAddress.parse("no_reply_DOSA@DAM.com", false));	      
		      msg.setSubject(subject, "UTF-8");
		      msg.setText(body, "UTF-8");
		      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));	   
		      System.out.println("MENSAJE CREADO");  	  
		      Transport.send(msg);
		      System.out.println("¡EMAIL ENVIADO!");//SI NO DA ERROR

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
