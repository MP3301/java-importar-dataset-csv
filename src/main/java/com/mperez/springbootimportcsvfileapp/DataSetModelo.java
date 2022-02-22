package com.mperez.springbootimportcsvfileapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_set_modelo")
public class DataSetModelo {

	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "county_fips")
	private Double county_fips;

	@Column(name = "county_name")
	private String county_name;

	@Column(name = "state_name")
	private String state_name;

	@Column(name = "date")
	private String date;

	@Column(name = "county_vmt")
	private Double county_vmt;

	@Column(name = "baseline_jan_vmt")
	private Double baseline_jan_vmt;

	@Column(name = "percent_change_from_jan")
	private Double percent_change_from_jan;

	@Column(name = "mean7_county_vmt")
	private Double mean7_county_vmt;

	@Column(name = "mean7_percent_change_from_jan")
	private Double mean7_percent_change_from_jan;

	@Column(name = "date_at_low")
	private String date_at_low;

	@Column(name = "mean7_county_vmt_at_low")
	private Double mean7_county_vmt_at_low;

	@Column(name = "percent_change_from_low")
	private Double percent_change_from_low;

	public DataSetModelo() {

	}

	/**
	 * @param id
	 * @param county_fips
	 * @param county_name
	 * @param state_name
	 * @param date
	 * @param county_vmt
	 * @param baseline_jan_vmt
	 * @param percent_change_from_jan
	 * @param mean7_county_vmt
	 * @param mean7_percent_change_from_jan
	 * @param date_at_low
	 * @param mean7_county_vmt_at_low
	 * @param percent_change_from_low
	 */
	public DataSetModelo(long id, Double county_fips, String county_name, String state_name, String date,
			Double county_vmt, Double baseline_jan_vmt, Double percent_change_from_jan, Double mean7_county_vmt,
			Double mean7_percent_change_from_jan, String date_at_low, Double mean7_county_vmt_at_low,
			Double percent_change_from_low) {
		super();
		this.id = id;
		this.county_fips = county_fips;
		this.county_name = county_name;
		this.state_name = state_name;
		this.date = date;
		this.county_vmt = county_vmt;
		this.baseline_jan_vmt = baseline_jan_vmt;
		this.percent_change_from_jan = percent_change_from_jan;
		this.mean7_county_vmt = mean7_county_vmt;
		this.mean7_percent_change_from_jan = mean7_percent_change_from_jan;
		this.date_at_low = date_at_low;
		this.mean7_county_vmt_at_low = mean7_county_vmt_at_low;
		this.percent_change_from_low = percent_change_from_low;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the county_fips
	 */
	public Double getCounty_fips() {
		return county_fips;
	}

	/**
	 * @param county_fips the county_fips to set
	 */
	public void setCounty_fips(Double county_fips) {
		this.county_fips = county_fips;
	}

	/**
	 * @return the county_name
	 */
	public String getCounty_name() {
		return county_name;
	}

	/**
	 * @param county_name the county_name to set
	 */
	public void setCounty_name(String county_name) {
		this.county_name = county_name;
	}

	/**
	 * @return the state_name
	 */
	public String getState_name() {
		return state_name;
	}

	/**
	 * @param state_name the state_name to set
	 */
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the county_vmt
	 */
	public Double getCounty_vmt() {
		return county_vmt;
	}

	/**
	 * @param county_vmt the county_vmt to set
	 */
	public void setCounty_vmt(Double county_vmt) {
		this.county_vmt = county_vmt;
	}

	/**
	 * @return the baseline_jan_vmt
	 */
	public Double getBaseline_jan_vmt() {
		return baseline_jan_vmt;
	}

	/**
	 * @param baseline_jan_vmt the baseline_jan_vmt to set
	 */
	public void setBaseline_jan_vmt(Double baseline_jan_vmt) {
		this.baseline_jan_vmt = baseline_jan_vmt;
	}

	/**
	 * @return the percent_change_from_jan
	 */
	public Double getPercent_change_from_jan() {
		return percent_change_from_jan;
	}

	/**
	 * @param percent_change_from_jan the percent_change_from_jan to set
	 */
	public void setPercent_change_from_jan(Double percent_change_from_jan) {
		this.percent_change_from_jan = percent_change_from_jan;
	}

	/**
	 * @return the mean7_county_vmt
	 */
	public Double getMean7_county_vmt() {
		return mean7_county_vmt;
	}

	/**
	 * @param mean7_county_vmt the mean7_county_vmt to set
	 */
	public void setMean7_county_vmt(Double mean7_county_vmt) {
		this.mean7_county_vmt = mean7_county_vmt;
	}

	/**
	 * @return the mean7_percent_change_from_jan
	 */
	public Double getMean7_percent_change_from_jan() {
		return mean7_percent_change_from_jan;
	}

	/**
	 * @param mean7_percent_change_from_jan the mean7_percent_change_from_jan to set
	 */
	public void setMean7_percent_change_from_jan(Double mean7_percent_change_from_jan) {
		this.mean7_percent_change_from_jan = mean7_percent_change_from_jan;
	}

	/**
	 * @return the date_at_low
	 */
	public String getDate_at_low() {
		return date_at_low;
	}

	/**
	 * @param date_at_low the date_at_low to set
	 */
	public void setDate_at_low(String date_at_low) {
		this.date_at_low = date_at_low;
	}

	/**
	 * @return the mean7_county_vmt_at_low
	 */
	public Double getMean7_county_vmt_at_low() {
		return mean7_county_vmt_at_low;
	}

	/**
	 * @param mean7_county_vmt_at_low the mean7_county_vmt_at_low to set
	 */
	public void setMean7_county_vmt_at_low(Double mean7_county_vmt_at_low) {
		this.mean7_county_vmt_at_low = mean7_county_vmt_at_low;
	}

	/**
	 * @return the percent_change_from_low
	 */
	public Double getPercent_change_from_low() {
		return percent_change_from_low;
	}

	/**
	 * @param percent_change_from_low the percent_change_from_low to set
	 */
	public void setPercent_change_from_low(Double percent_change_from_low) {
		this.percent_change_from_low = percent_change_from_low;
	}

	@Override
	public String toString() {
		return "DataSetModelo [id=" + id + ", county_fips=" + county_fips + ", county_name=" + county_name
				+ ", state_name=" + state_name + ", date=" + date + ", county_vmt=" + county_vmt + ", baseline_jan_vmt="
				+ baseline_jan_vmt + ", percent_change_from_jan=" + percent_change_from_jan + ", mean7_county_vmt="
				+ mean7_county_vmt + ", mean7_percent_change_from_jan=" + mean7_percent_change_from_jan
				+ ", date_at_low=" + date_at_low + ", mean7_county_vmt_at_low=" + mean7_county_vmt_at_low
				+ ", percent_change_from_low=" + percent_change_from_low + "]";
	}

}
