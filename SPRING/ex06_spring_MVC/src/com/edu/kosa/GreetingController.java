package com.edu.kosa;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

	@RequestMapping("/greeting.bo")
	public ModelAndView hi() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("greeting", getGreeting());
		mav.setViewName("hi"); // hi.jsp로 이동 : WEB-INF 및에 있는 jsp 폴더에서 hi.jsp로 가는데 이거는 viewResolver를 통해 결합이 돼서 이동.

		return mav;
	}

	private Object getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if (hour >=6 && hour<=11) {
			return "빠빠빠 빠밤 빠빠바빠~ 굿모닝~";
		} else if(hour>=12 && hour<=15) {
			return "맛점!";
		} else if(hour>=17 && hour<=20) {
			return "편안한 저녁,,,,";
		} else return "go home";
	}
}
