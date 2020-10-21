package net.Omarket.chatting;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class chattingDTO {
  
	private int u_code_msg;
	private int msg_code;
	private String msg_content ;
	private Date msg_date;
	private String msg_check;
	
	private int ch_code;
	private int p_code ;
	
	private String chList_code;
	private int u_code_chL;
	private int chList_join;	
	
}//class END
