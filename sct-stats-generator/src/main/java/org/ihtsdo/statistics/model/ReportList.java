/**
 * Copyright (c) 2016 TermMed SA
 * Organization
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/
 */

/**
 * Author: Alejandro Rodriguez
 */
package org.ihtsdo.statistics.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReportList {

	List<ReportDescriptor> reportDescriptor;

	public List<ReportDescriptor> getReportDescriptor() {
		return reportDescriptor;
	}

	public void setReportDescriptor(List<ReportDescriptor> reportDescriptor) {
		this.reportDescriptor = reportDescriptor;
	}
	
}
