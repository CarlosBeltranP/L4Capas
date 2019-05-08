package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;



@Controller
public class MainController {
	
	//Controlador por defecto
		@RequestMapping("/")
		public ModelAndView initMain() {
			ModelAndView mav = new ModelAndView();
			Product producto=new Product();
			mav.addObject("message", "Bienvenidos a MVC");
			mav.addObject("product", producto);
			mav.setViewName("product_main");
			return mav;

		}
		
		/*@RequestMapping("/formData")
		@ResponseBody
		public User form(@ModelAttribute User user) {
			
			return user;
		}*/
		
		@RequestMapping("/formData")
		public ModelAndView form(@Valid @ModelAttribute Product product ,BindingResult result) {
			ModelAndView mav= new ModelAndView();
			if(result.hasErrors()) {
				mav.addObject("message","Errores al enviar formulario");
				mav.setViewName("product_main");
			}
			else {
				mav.addObject("message","El producto ha sido ingresado exitosamente");
				mav.setViewName("form");
			}
			
			return mav;
		}

}