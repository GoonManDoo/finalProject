package co.caboni.prj.shipping.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShippingController {

	@RequestMapping("/shipping.do")
	public String shipping() {
		return "sales/shipping";
		
	}
}
