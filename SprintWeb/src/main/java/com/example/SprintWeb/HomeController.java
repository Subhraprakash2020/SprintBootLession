package com.example.SprintWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
	
//	public String home(HttpServletRequest req) {
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		session.setAttribute("name", name);
//		System.out.println("Hi");
//		return "home";
//}
	
//	public ModelAndView home(@RequestParam("name") String myName) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", myName);
//		mv.setViewName("home");
//		return mv;
//	}
	
	@RequestMapping("alien")

	public ModelAndView alien(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		return mv;
	}
}
