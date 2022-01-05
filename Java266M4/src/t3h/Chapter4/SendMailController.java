package t3h.Chapter4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import t3h.domain.MailInfo;

@Controller
public class SendMailController {
    @Autowired
    private JavaMailSender mailSender;
    
    @RequestMapping("Chapter4/sendmail.html")
    public String index() {
    	return "Chapter4.sendmail";
    }
    
    @RequestMapping(value ="Chapter4/sendmail.html", method=RequestMethod.POST)
    public String index(Model model, MailInfo obj) {
    	SimpleMailMessage message = new SimpleMailMessage();
    	message.setTo(obj.getEmail());
    	message.setSubject(obj.getSubject());
    	message.setText(obj.getSubject());
    	try {
    		mailSender.send(message);
    	}catch(Exception e) {
    		model.addAttribute("msg", "send fail. ");
    		e.printStackTrace();
    	}
    	return "Chapter4.sendmail";
    }
}
