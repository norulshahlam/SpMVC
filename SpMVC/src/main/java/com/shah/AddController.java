/*
this project is using spring mvc, unlike normal mvc
all settings used will be xml / annotation based

@RequestParam: fetch the values from the client diretly without using httpservlet request or request object

 */

package  com.shah;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shah.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j){ //receive data from client side

		AddService as = new AddService();
		int k=as.add(i, j);
		
		ModelAndView mv = new ModelAndView(); //create modelAndView to pass values to webpage
		mv.setViewName("display"); //what webpage you want to call
		mv.addObject("k", k); //what value you 1 2 pass. using key and values
		
		return mv;
	}
}
 