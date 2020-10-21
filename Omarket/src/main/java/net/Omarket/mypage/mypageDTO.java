package net.Omarket.mypage;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class mypageDTO {
	
  private int trade_code;
	private int p_code;
	private Timestamp trade_date;
	private int u_code_buyer;
	
	private int jj_code;
	private int u_code;
	private int jj_p_code;
	
	private int eval_code;
	private int u_code_sender;
	private int u_code_receiver;
	private Date eval_date;
	private int eval_p_code;
	private String eval_pos;
	private String eval_pos_con1;
	private String eval_pos_con2;
	private String eval_pos_con3;
	private String eval_pos_con4;
	private String eval_pos_con5;
	private String eval_normal;
	private String eval_normal_con1;
	private String eval_normal_con2;
	private String eval_normal_con3;
	private String eval_normal_con4;
	private String eval_normal_con5;
	private String eval_nega;
	private String eval_nega_con1;
	private String eval_nega_con2;
	private String eval_nega_con3;
	private String eval_nega_con4;
	private String eval_nega_con5;
	
	private int manner_code;
	private int manner_sum;
	
}//class END
