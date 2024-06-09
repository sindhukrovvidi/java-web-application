package com.sprinboot.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody // should add this here or else the api will not work as @REsponseBody will let us retrun as it is.
	public String sayHello() {
		return "Hello!";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<!DOCTYPE html>");
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<h1>My First Heading</h1>");
		sb.append("<p>My first paragraph.</p>");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}
}
