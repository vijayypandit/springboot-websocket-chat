package com.example.springboot.websocket.api.model;

import org.apache.logging.log4j.message.Message;

public class ChatMessage {

private String content;
private String sender;

private MessageType type ;
private enum MessageType{
	CHAT,LEAVE,JOIN
	
	
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}
public MessageType getType() {
	return type;
}
public void setType(MessageType type) {
	this.type = type;
}


}
