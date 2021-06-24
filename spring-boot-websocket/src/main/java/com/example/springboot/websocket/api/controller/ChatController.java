package com.example.springboot.websocket.api.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.example.springboot.websocket.api.model.ChatMessage;

@Controller
public class ChatController {

	//register a new user 
		@MessageMapping("/chat.register")
		@SendTo("/topic/public")
		public ChatMessage register(@Payload ChatMessage chatMesage , SimpMessageHeaderAccessor headerAccessor) {
			
			headerAccessor.getSessionAttributes().put("username",chatMesage.getSender());
			
			return chatMesage;
			
			
			
		}
		
		//to send a message to the user
		@MessageMapping("/chat.send")
		@SendTo("/topic/public")
		public ChatMessage sendMessage(@Payload ChatMessage chatMessage)
		{
			return chatMessage;
			
		}
}
