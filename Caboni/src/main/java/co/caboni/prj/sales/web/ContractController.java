package co.caboni.prj.sales.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContractController {
	
	@RequestMapping("/contract.do")
	public String contract() {
		return "sales/contract";
		
	}

}