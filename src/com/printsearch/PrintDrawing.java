package com.printsearch;

public class PrintDrawing {

	private String bearingMax = "";
	private String bearingMin = "";
	private String cust = "";
	private String custPin = "";
	private String custRev = "";
	private String date = "";
	private String dateCreated = "";
	private String dia1 = "";
	private String dia2 = "";
	private String dmgDrawingPath = "";
	private String drawingName = "";
	private String face1 = "";
	private String face2 = "";
	private String newBasePrice = "";
	private String oem = "";
	private String originatingCustomer = "";
	private String partNo = "";
	private String pdfPath = "";
	private String prevPartNo = "";
	private String productCode = "";
	private String revNumber = "";
	private String scannedPath = "";
	private String steps = "";
	private String subcontractor = "";
	private String type = "";
	private String xlsmPath = "";
	private String xlsxPath = "";

	public String getBearingMax() {
		return bearingMax;
	}

	public void setBearingMax(String bearingMax) {
		this.bearingMax = bearingMax;
	}

	public String getBearingMin() {
		return bearingMin;
	}

	public void setBearingMin(String bearingMin) {
		this.bearingMin = bearingMin;
	}

	public String getCust() {
		return cust;
	}

	public void setCust(String cust) {
		this.cust = cust;
	}

	public String getCustPin() {
		return custPin;
	}

	public void setCustPin(String custPin) {
		this.custPin = custPin;
	}

	public String getCustRev() {
		return custRev;
	}

	public void setCustRev(String custRev) {
		this.custRev = custRev;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDia1() {
		return dia1;
	}

	public void setDia1(String dia1) {
		this.dia1 = dia1;
	}

	public String getDia2() {
		return dia2;
	}

	public void setDia2(String dia2) {
		this.dia2 = dia2;
	}

	public String getDmgDrawingPath() {
		return dmgDrawingPath;
	}

	public void setDmgDrawingPath(String dmgDrawingPath) {
		this.dmgDrawingPath = dmgDrawingPath;
	}

	public String getDrawingName() {
		return drawingName;
	}

	public void setDrawingName(String drawingName) {
		this.drawingName = drawingName;
	}

	public String getFace1() {
		return face1;
	}

	public void setFace1(String face1) {
		this.face1 = face1;
	}

	public String getFace2() {
		return face2;
	}

	public void setFace2(String face2) {
		this.face2 = face2;
	}

	public String getNewBasePrice() {
		return newBasePrice;
	}

	public void setNewBasePrice(String newBasePrice) {
		this.newBasePrice = newBasePrice;
	}

	public String getOem() {
		return oem;
	}

	public void setOem(String oem) {
		this.oem = oem;
	}

	public String getOriginatingCustomer() {
		return originatingCustomer;
	}

	public void setOriginatingCustomer(String originatingCustomer) {
		this.originatingCustomer = originatingCustomer;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPdfPath() {
		return pdfPath;
	}

	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}

	public String getPrevPartNo() {
		return prevPartNo;
	}

	public void setPrevPartNo(String prevPartNo) {
		this.prevPartNo = prevPartNo;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRevNumber() {
		return revNumber;
	}

	public void setRevNumber(String revNumber) {
		this.revNumber = revNumber;
	}

	public String getScannedPath() {
		return scannedPath;
	}

	public void setScannedPath(String scannedPath) {
		this.scannedPath = scannedPath;
	}

	public String getSteps() {
		return steps;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public String getSubcontractor() {
		return subcontractor;
	}

	public void setSubcontractor(String subcontractor) {
		this.subcontractor = subcontractor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getXlsmPath() {
		return xlsmPath;
	}

	public void setXlsmPath(String xlsmPath) {
		this.xlsmPath = xlsmPath;
	}

	public String getXlsxPath() {
		return xlsxPath;
	}

	public void setXlsxPath(String xlsxPath) {
		this.xlsxPath = xlsxPath;
	}

	// Default constructor
	public PrintDrawing() {

		// Initialize variables to default values

		this.bearingMax = "";
		this.bearingMin = "";
		this.cust = "";
		this.custPin = "";
		this.custRev = "";
		this.date = "";
		this.dateCreated = "";
		this.dia1 = "";
		this.dia2 = "";
		this.drawingName = "";
		this.dmgDrawingPath = "";
		this.face1 = "";
		this.face2 = "";
		this.newBasePrice = "";
		this.oem = "";
		this.originatingCustomer = "";
		this.partNo = "";
		this.pdfPath = "";
		this.prevPartNo = "";
		this.productCode = "";
		this.revNumber = "";
		this.scannedPath = "";
		this.steps = "";
		this.subcontractor = "";
		this.type = "";
		this.xlsxPath = "";
		this.xlsmPath = "";
	}

	public PrintDrawing(
			int id,
			String bearingMax,
			String bearingMin,
			String cust,
			String custPin,
			String custRev,
			String date,
			String dateCreated,
			String dia1,
			String dia2,
			String dmgDrawingPath,
			String drawingName,
			String face1,
			String face2,
			String newBasePrice,
			String oem,
			String originatingCustomer,
			String partNo,
			String pdfPath,
			String prevPartNo,
			String productCode,
			String revNumber,
			String scannedPath,
			String steps,
			String subcontractor,
			String type,
			String xlsmPath,
			String xlsxPath) {
		super();

		this.bearingMax = bearingMax;
		this.bearingMin = bearingMin;
		this.cust = cust;
		this.custPin = custPin;
		this.custRev = custRev;
		this.date = date;
		this.dateCreated = dateCreated;
		this.dia1 = dia1;
		this.dia2 = dia2;
		this.dmgDrawingPath = dmgDrawingPath;
		this.drawingName = drawingName;
		this.face1 = face1;
		this.face2 = face2;
		this.newBasePrice = newBasePrice;
		this.oem = oem;
		this.originatingCustomer = originatingCustomer;
		this.partNo = partNo;
		this.pdfPath = pdfPath;
		this.prevPartNo = prevPartNo;
		this.productCode = productCode;
		this.revNumber = revNumber;
		this.scannedPath = scannedPath;
		this.steps = steps;
		this.subcontractor = subcontractor;
		this.type = type;
		this.xlsmPath = xlsmPath;
		this.xlsxPath = xlsxPath;
	}

}