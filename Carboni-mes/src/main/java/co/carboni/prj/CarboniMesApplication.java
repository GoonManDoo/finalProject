package co.carboni.prj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@MapperScan(basePackages = "co.carboni.prj.**.mapper")
public class CarboniMesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarboniMesApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "home/login";
	}

}
