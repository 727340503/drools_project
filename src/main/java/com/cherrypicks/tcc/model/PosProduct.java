package com.cherrypicks.tcc.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PosProduct implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String prodBarcode;

	private java.lang.String prodCancel;

	public PosProduct() {
	}

	private String prodCode;

	private String prodDesc;

	private Double prodQty;

	private String prodUnit;

	private Double prodAmt;

	private String prodCat;

	private String prodSubCat;

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdUnit() {
		return prodUnit;
	}

	public void setProdUnit(String prodUnit) {
		this.prodUnit = prodUnit;
	}

	public String getProdCat() {
		return prodCat;
	}

	public void setProdCat(String prodCat) {
		this.prodCat = prodCat;
	}

	public String getProdSubCat() {
		return prodSubCat;
	}

	public void setProdSubCat(String prodSubCat) {
		this.prodSubCat = prodSubCat;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public java.lang.String getProdBarcode() {
		return this.prodBarcode;
	}

	public void setProdBarcode(java.lang.String prodBarcode) {
		this.prodBarcode = prodBarcode;
	}

	public java.lang.String getProdCancel() {
		return this.prodCancel;
	}

	public void setProdCancel(java.lang.String prodCancel) {
		this.prodCancel = prodCancel;
	}

	public java.lang.Double getProdAmt() {
		return this.prodAmt;
	}

	public void setProdAmt(java.lang.Double prodAmt) {
		this.prodAmt = prodAmt;
	}

	public java.lang.Double getProdQty() {
		return this.prodQty;
	}

	public void setProdQty(java.lang.Double prodQty) {
		this.prodQty = prodQty;
	}

	public PosProduct(java.lang.String prodBarcode,
			java.lang.String prodCancel, java.lang.String prodCode,
			java.lang.String prodDesc, java.lang.Double prodQty,
			java.lang.String prodUnit, java.lang.Double prodAmt,
			java.lang.String prodCat, java.lang.String prodSubCat) {
		this.prodBarcode = prodBarcode;
		this.prodCancel = prodCancel;
		this.prodCode = prodCode;
		this.prodDesc = prodDesc;
		this.prodQty = prodQty;
		this.prodUnit = prodUnit;
		this.prodAmt = prodAmt;
		this.prodCat = prodCat;
		this.prodSubCat = prodSubCat;
	}

}