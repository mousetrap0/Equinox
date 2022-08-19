package kr.co.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BreakVO {

	private int breakId;
	private String lineId;
	private Date breakTime;
	private Date notifyTime;
	private String notifyToKtYn;
	private Date recoveryTime;
	private String breakPoint;
	private String actualReportYn;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	
}
