package net.Omarket.main;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class mainDTO {
	
  private int p_code;
	private String p_name;
	private Timestamp p_rdate;
	private Timestamp p_edate;
	private String p_status;
	private String p_location;
	private int p_hit;
	private int p_chatcnt;
	private int p_jjimcnt;
	private String p_category;
	private String p_price;
	private String p_content;
	private String p_nego;
	private int u_code_seller;
	
	private int pic_code;
	private String pic_name;
	private String pic_oname;
	private int pic_size;
	
}//class END
