package learn.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String showMyPage() {
		return "main-menu";
	}

	@RequestMapping(value = "/showForm")

	public String showForm() {
		// key of map should match with value in name attribute in jsp file

		return "helloworld-form";
	}

	@RequestMapping(value = "/processForm")

	public String processForm(HttpServletRequest req, Model model) {
		// key of map should match with value in name attribute in jsp file
		String myName = req.getParameter("studentName");
		myName = myName.toUpperCase();
		String result = "Bye " + myName;
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	@RequestMapping(value = "/processForm2")

	public String processForm2(@RequestParam("studentName") String myName, Model model) {
		// key of map should match with value in name attribute in jsp file
		myName = myName.toUpperCase();
		String result = "Hi " + myName;
		model.addAttribute("message",result);
		return "helloworld";
	}
}
