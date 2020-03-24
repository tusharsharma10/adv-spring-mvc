package learn.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student s1 = new Student();
		model.addAttribute("student2", s1);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student2") Student s) {
		
		System.out.println("Student: "+s.getFirstName()+" "+s.getLastName());
		return "student-confirmation";
	}
	
}
