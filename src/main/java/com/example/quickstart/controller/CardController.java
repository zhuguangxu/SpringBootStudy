package com.example.quickstart.controller;


import com.example.quickstart.dao.CardDAO;

import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通过ModelMap将数据带回页面
 * */
@Controller
@RequestMapping("/card")
public class CardController {

    //注入CardDAO的bean
    @Resource
    private CardDAO cardDAO;

    @GetMapping("card")
    public String getAll(ModelMap map){
        List<Card> cardList = cardDAO.getCards();
        User user =cardDAO.getUser();

        map.addAttribute("cardList",cardList);
        map.addAttribute("user",user);
        return "card";
    }
}
