package net.codejava;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private CoinRepository CoinRepo;
	
	@Autowired
	private BuyerRepository BuyerRepo;
	
	@RequestMapping(" ")
	public ModelAndView secondMethod() {
		return new ModelAndView("index");
	}

	/*@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}*/
	
	@RequestMapping("/register")
	public ModelAndView showregform(Model model) {
model.addAttribute("user", new User());
		
		
		return new ModelAndView("signup_form");
	}
	/*@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		
		return "register_success";
	}
	*/
	@RequestMapping("/process_register")
	public ModelAndView processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return new ModelAndView("register_success");
	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}
	
	/*@RequestMapping("/users")
	public ModelAndView listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return new ModelAndView("users");
	}*/
	
	/*@GetMapping("/buyfg")
	public String listBuyers(Model model) {
		List<Coin> listBuyers = CoinRepo.findAll();
		model.addAttribute("listBuyers", listBuyers);
		
		return "buy";
	}*/
	@RequestMapping("/buyfg")
	public ModelAndView thirdmethod(Model model) {
		List<Coin> listBuyers = CoinRepo.findAll();
		model.addAttribute("listBuyers", listBuyers);
		return new ModelAndView("buy");
	}
	
	/*@GetMapping("/Coinregistration")
	public String CoinRegistration(Model model) {
		
		
		return "CoinReg";
	}*/
	@RequestMapping("/Coinregistration")
	public ModelAndView CoinRegistration(Model model) {
		
		return new ModelAndView("CoinReg");
	}
	
	/*@PostMapping("/coin_registeration")
	public String CoinRegister(Coin Coin) {
		
		CoinRepo.save(Coin);
		
		return "index";
	}*/
	@RequestMapping("/coin_registeration")
	public ModelAndView CoinRegister(Coin Coin) {
		CoinRepo.save(Coin);
		return new ModelAndView("CoinReg");
	}
	
	/*@GetMapping("/BuyerRegistration")
	public String BuyerRegistration(Model model) {
			
			
			return "index";
			}
		*/
	@RequestMapping("/BuyerRegistration")
	public ModelAndView BuyerRegistration(Model model) {
		
		return new ModelAndView("BuyerRegistration");
	}
		/*@PostMapping("/buyer1")
		public String BuyerRegister(Buyer Buyer) {
			
			
			
			BuyerRepo.save(Buyer);
			
			return "successBuy";
		}*/
	@RequestMapping("/buyer1")
	public ModelAndView BuyerRegister(Buyer Buyer) {
		BuyerRepo.save(Buyer);
		return new ModelAndView("successBuy");
	}
}
