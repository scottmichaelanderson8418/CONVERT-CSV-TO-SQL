package com.printsearch;

public class PrintDrawingDto {
	/* 1 */ private String bearingMax = "";
	/* 2 */ private String bearingMin = "";
	/* 3 */ private String cust = "";
	/* 4 */ private String custPin = "";
	/* 5 */ private String custRev = "";
	/* 6 */ private String date = "";
	/* 7 */ private String dateCreated = "";
	/* 8 */ private float dia1 = 0.0f;
	/* 9 */ private float dia2 = 0.0f;
	/* 10 */ private String dmgDrawingPath = "";
	/* 11 */ private String drawingName = "";
	/* 12 */ private float face1 = 0.0f;
	/* 13 */ private float face2 = 0.0f;
	/* 14 */ private String newBasePrice = "";
	/* 15 */ private String oem = "";
	/* 16 */ private String originatingCustomer = "";
	/* 17 */ private String partNo = "";
	/* 18 */ private String pdfPath = "";
	/* 19 */ private String prevPartNo = "";
	/* 20 */ private String productCode = "";
	/* 21 */ private String revNumber = "";
	/* 22 */ private String scannedPath = "";
	/* 23 */ private String steps = "";
	/* 24 */ private String subcontractor = "";
	/* 25 */ private String type = "";
	/* 26 */ private String xlsmPath = "";
	/* 27 */ private String xlsxPath = "";

	public PrintDrawingDto() {
		// Initialize fields
		this.xlsxPath = "";
		this.xlsmPath = "";
		this.pdfPath = "";
		this.scannedPath = "";
		this.dmgDrawingPath = "";
		this.drawingName = "";
		this.revNumber = "";
		this.dia1 = 0.0f;
		this.dia2 = 0.0f;
		this.face1 = 0.0f;
		this.face2 = 0.0f;
		this.bearingMax = "";
		this.bearingMin = "";
		this.steps = "";
		this.oem = "";
		this.type = "";
		this.cust = "";
		this.originatingCustomer = "";
		this.custPin = "";
		this.custRev = "";
		this.newBasePrice = "";
		this.date = "";
		this.subcontractor = "";
		this.productCode = "";
		this.prevPartNo = "";
		this.dateCreated = "";
		this.partNo = "";
	}

	public PrintDrawingDto(

			String bearingMax,
			String bearingMin,
			String cust,
			String custPin,
			String custRev,
			String date,
			String dateCreated,
			float dia1,
			float dia2,
			String dmgDrawingPath,
			String drawingName,
			float face1,
			float face2,
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

	public String getBearingMax() {
		return bearingMax;
	}

	public String getBearingMin() {
		return bearingMin;
	}

	public String getCust() {
		return cust;
	}

	public String getCustPin() {
		return custPin;
	}

	public String getCustRev() {
		return custRev;
	}

	public String getDate() {
		return date;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public float getDia1() {
		return dia1;
	}

	public float getDia2() {
		return dia2;
	}

	public String getDmgDrawingPath() {
		return dmgDrawingPath;
	}

	public String getDrawingName() {
		return drawingName;
	}

	public float getFace1() {
		return face1;
	}

	public float getFace2() {
		return face2;
	}

	public String getNewBasePrice() {
		return newBasePrice;
	}

	public String getOem() {
		return oem;
	}

	public String getOriginatingCustomer() {
		return originatingCustomer;
	}

	public String getPartNo() {
		return partNo;
	}

	public String getPdfPath() {
		return pdfPath;
	}

	public String getPrevPartNo() {
		return prevPartNo;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getRevNumber() {
		return revNumber;
	}

	public String getScannedPath() {
		return scannedPath;
	}

	public String getSteps() {
		return steps;
	}

	public String getSubcontractor() {
		return subcontractor;
	}

	public String getType() {
		return type;
	}

	public String getXlsmPath() {
		return xlsmPath;
	}

	public String getXlsxPath() {
		return xlsxPath;
	}

	public void setBearingMax(String bearingMax) {
		this.bearingMax = bearingMax;
	}

	public void setBearingMin(String bearingMin) {
		this.bearingMin = bearingMin;
	}

	public void setCust(String cust) {
		this.cust = cust;
	}

	public void setCustPin(String custPin) {
		this.custPin = custPin;
	}

	public void setCustRev(String custRev) {
		this.custRev = custRev;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDia1(float dia1) {
		this.dia1 = dia1;
	}

	public void setDia2(float dia2) {
		this.dia2 = dia2;
	}

	public void setDmgDrawingPath(String dmgDrawingPath) {
		this.dmgDrawingPath = dmgDrawingPath;
	}

	public void setDrawingName(String drawingName) {
		this.drawingName = drawingName;
	}

	public void setFace1(float face1) {
		this.face1 = face1;
	}

	public void setFace2(float face2) {
		this.face2 = face2;
	}

	public void setNewBasePrice(String newBasePrice) {
		this.newBasePrice = newBasePrice;
	}

	public void setOem(String oem) {
		this.oem = oem;
	}

	public void setOriginatingCustomer(String originatingCustomer) {
		this.originatingCustomer = originatingCustomer;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}

	public void setPrevPartNo(String prevPartNo) {
		this.prevPartNo = prevPartNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setRevNumber(String revNumber) {
		this.revNumber = revNumber;
	}

	public void setScannedPath(String scannedPath) {
		this.scannedPath = scannedPath;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public void setSubcontractor(String subcontractor) {
		this.subcontractor = subcontractor;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setXlsmPath(String xlsmPath) {
		this.xlsmPath = xlsmPath;
	}

	public void setXlsxPath(String xlsxPath) {
		this.xlsxPath = xlsxPath;
	}

}