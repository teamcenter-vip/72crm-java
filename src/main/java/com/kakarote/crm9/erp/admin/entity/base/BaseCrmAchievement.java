package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCrmAchievement<M extends BaseCrmAchievement<M>> extends Model<M> implements IBean {

	public void setAchievementId(java.lang.Integer achievementId) {
		set("achievement_id", achievementId);
	}
	
	public java.lang.Integer getAchievementId() {
		return getInt("achievement_id");
	}

	public void setObjId(java.lang.Integer objId) {
		set("obj_id", objId);
	}
	
	public java.lang.Integer getObjId() {
		return getInt("obj_id");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setYear(java.lang.String year) {
		set("year", year);
	}
	
	public java.lang.String getYear() {
		return getStr("year");
	}

	public void setJanuary(java.math.BigDecimal january) {
		set("january", january);
	}
	
	public java.math.BigDecimal getJanuary() {
		return get("january");
	}

	public void setFebruary(java.math.BigDecimal february) {
		set("february", february);
	}
	
	public java.math.BigDecimal getFebruary() {
		return get("february");
	}

	public void setMarch(java.math.BigDecimal march) {
		set("march", march);
	}
	
	public java.math.BigDecimal getMarch() {
		return get("march");
	}

	public void setApril(java.math.BigDecimal april) {
		set("april", april);
	}
	
	public java.math.BigDecimal getApril() {
		return get("april");
	}

	public void setMay(java.math.BigDecimal may) {
		set("may", may);
	}
	
	public java.math.BigDecimal getMay() {
		return get("may");
	}

	public void setJune(java.math.BigDecimal june) {
		set("june", june);
	}
	
	public java.math.BigDecimal getJune() {
		return get("june");
	}

	public void setJuly(java.math.BigDecimal july) {
		set("july", july);
	}
	
	public java.math.BigDecimal getJuly() {
		return get("july");
	}

	public void setAugust(java.math.BigDecimal august) {
		set("august", august);
	}
	
	public java.math.BigDecimal getAugust() {
		return get("august");
	}

	public void setSeptember(java.math.BigDecimal september) {
		set("september", september);
	}
	
	public java.math.BigDecimal getSeptember() {
		return get("september");
	}

	public void setOctober(java.math.BigDecimal october) {
		set("october", october);
	}
	
	public java.math.BigDecimal getOctober() {
		return get("october");
	}

	public void setNovember(java.math.BigDecimal november) {
		set("november", november);
	}
	
	public java.math.BigDecimal getNovember() {
		return get("november");
	}

	public void setDecember(java.math.BigDecimal december) {
		set("december", december);
	}
	
	public java.math.BigDecimal getDecember() {
		return get("december");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setYeartarget(java.math.BigDecimal yeartarget) {
		set("yeartarget", yeartarget);
	}
	
	public java.math.BigDecimal getYeartarget() {
		return get("yeartarget");
	}

}
