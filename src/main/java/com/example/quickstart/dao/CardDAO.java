package com.example.quickstart.dao;


import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class CardDAO {

//    返回所有Card对象组成的List集合
    public List<Card> getCards() {
        //定义一个含有若干匿名Card对象的Card类型数组
        Card[] cards = {
           new Card("000.jpg","3小时前","homework1","少数派","000.jpg"),



        };
     List<Card> cardList = Arrays.asList(cards);
   return cardList;
    }
    public User getUser(){
          User user = new User();
          user.setAvatar("title.png");
          return user;
    }
}
