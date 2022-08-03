package kr.co.vo;

import java.util.Date;

public class KtBreakVO {

	private int ktBreakId;
	private int breakId;
	private String lineId;
	private Date breakTime;
	private Date notifyTime;
	private Date notifyTimeToKt;
	private Date recoveryTime;
	private String breakPoint;
	private String actualReportYn;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	
	
	public int getKtBreakId() {
		return ktBreakId;
	}
	public void setKtBreakId(int ktBreakId) {
		this.ktBreakId = ktBreakId;
	}
	public int getBreakId() {
		return breakId;
	}
	public void setBreakId(int breakId) {
		this.breakId = breakId;
	}
	public String getLineId() {
		return lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}
	public Date getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(Date breakTime) {
		this.breakTime = breakTime;
	}
	public Date getNotifyTime() {
		return notifyTime;
	}
	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}
	public Date getNotifyTimeToKt() {
		return notifyTimeToKt;
	}
	public void setNotifyTimeToKt(Date notifyTimeToKt) {
		this.notifyTimeToKt = notifyTimeToKt;
	}
	public Date getRecoveryTime() {
		return recoveryTime;
	}
	public void setRecoveryTime(Date recoveryTime) {
		this.recoveryTime = recoveryTime;
	}
	public String getBreakPoint() {
		return breakPoint;
	}
	public void setBreakPoint(String breakPoint) {
		this.breakPoint = breakPoint;
	}
	public String getActualReportYn() {
		return actualReportYn;
	}
	public void setActualReportYn(String actualReportYn) {
		this.actualReportYn = actualReportYn;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
