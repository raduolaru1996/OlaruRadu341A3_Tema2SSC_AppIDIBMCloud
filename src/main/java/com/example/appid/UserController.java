package com.example.appid;

import java.security.KeyStore.Entry.Attribute;
import java.security.Principal;

import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nimbusds.oauth2.sdk.http.HTTPResponse;

@RestController
public class UserController {
	
	@RequestMapping("/user")
    public @ResponseBody Principal user(@AuthenticationPrincipal Principal principal) {
        return principal;
    }

    @RequestMapping("/userInfo")
    public @ResponseBody String userInfo(@AuthenticationPrincipal Principal principal) {
        return String.valueOf(principal);
    }
    
    @RequestMapping("/contulMeu")
    @ResponseBody
    public ModelAndView contulMeu() {
    	ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/contulMeu.html");
        return modelAndView;
    }
    
    @RequestMapping("/login?logout")
    @ResponseBody
    public ModelAndView inapoi() {
    	ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/");
        return modelAndView;
    }
    
}
