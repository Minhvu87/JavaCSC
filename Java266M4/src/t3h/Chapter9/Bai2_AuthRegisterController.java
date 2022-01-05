package t3h.Chapter9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import t3h.dao.MemberRepository;
import t3h.domain.Member;

@Controller
public class Bai2_AuthRegisterController {

	MemberRepository repository = new MemberRepository();
	
	@RequestMapping(value = "/auth/register.html", method = RequestMethod.POST)
	public String register(Member obj) {
		repository.add(obj);
		
		return "redirect:/auth/logon.html";
	}
		
	@RequestMapping("/auth/register.html")
	public String register() {
		return "Chapter9.auth.register";
	}
}
