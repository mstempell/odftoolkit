/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgXAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgYAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCellRangeAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartDataSourceHasLabelsAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dVrpAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dVpnAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dVupAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dProjectionAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dDistanceAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dFocalLengthAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dShadowSlantAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dShadeModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dAmbientColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dLightingModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.dr3d.Dr3dTransformAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;

import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dLightElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element chart:plot-area}.
 *
 */
public abstract class ChartPlotAreaElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.CHART, "plot-area" );


	/**
	 * Create the instance of <code>ChartPlotAreaElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public ChartPlotAreaElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.newName(OdfNamespaceNames.CHART, "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element chart:plot-area}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgXAttribute</code> , See {@odf.attribute svg:x}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgXAttribute()
	{
		SvgXAttribute attr = (SvgXAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "x" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgXAttribute</code> , See {@odf.attribute svg:x}
	 *
	 * @param svgXValue   The type is <code>String</code>
	 */
	public void setSvgXAttribute( String svgXValue )
	{
		SvgXAttribute attr =  new SvgXAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgXValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgYAttribute</code> , See {@odf.attribute svg:y}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgYAttribute()
	{
		SvgYAttribute attr = (SvgYAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "y" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgYAttribute</code> , See {@odf.attribute svg:y}
	 *
	 * @param svgYValue   The type is <code>String</code>
	 */
	public void setSvgYAttribute( String svgYValue )
	{
		SvgYAttribute attr =  new SvgYAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgYValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgWidthAttribute</code> , See {@odf.attribute svg:width}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgWidthAttribute()
	{
		SvgWidthAttribute attr = (SvgWidthAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "width" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgWidthAttribute</code> , See {@odf.attribute svg:width}
	 *
	 * @param svgWidthValue   The type is <code>String</code>
	 */
	public void setSvgWidthAttribute( String svgWidthValue )
	{
		SvgWidthAttribute attr =  new SvgWidthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgWidthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgHeightAttribute</code> , See {@odf.attribute svg:height}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgHeightAttribute()
	{
		SvgHeightAttribute attr = (SvgHeightAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "height" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgHeightAttribute</code> , See {@odf.attribute svg:height}
	 *
	 * @param svgHeightValue   The type is <code>String</code>
	 */
	public void setSvgHeightAttribute( String svgHeightValue )
	{
		SvgHeightAttribute attr =  new SvgHeightAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgHeightValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartStyleNameAttribute()
	{
		ChartStyleNameAttribute attr = (ChartStyleNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.CHART), "style-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @param chartStyleNameValue   The type is <code>String</code>
	 */
	public void setChartStyleNameAttribute( String chartStyleNameValue )
	{
		ChartStyleNameAttribute attr =  new ChartStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( chartStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCellRangeAddressAttribute</code> , See {@odf.attribute table:cell-range-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableCellRangeAddressAttribute()
	{
		TableCellRangeAddressAttribute attr = (TableCellRangeAddressAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "cell-range-address" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCellRangeAddressAttribute</code> , See {@odf.attribute table:cell-range-address}
	 *
	 * @param tableCellRangeAddressValue   The type is <code>String</code>
	 */
	public void setTableCellRangeAddressAttribute( String tableCellRangeAddressValue )
	{
		TableCellRangeAddressAttribute attr =  new TableCellRangeAddressAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableCellRangeAddressValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartDataSourceHasLabelsAttribute</code> , See {@odf.attribute chart:data-source-has-labels}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartDataSourceHasLabelsAttribute()
	{
		ChartDataSourceHasLabelsAttribute attr = (ChartDataSourceHasLabelsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.CHART), "data-source-has-labels" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return ChartDataSourceHasLabelsAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartDataSourceHasLabelsAttribute</code> , See {@odf.attribute chart:data-source-has-labels}
	 *
	 * @param chartDataSourceHasLabelsValue   The type is <code>String</code>
	 */
	public void setChartDataSourceHasLabelsAttribute( String chartDataSourceHasLabelsValue )
	{
		ChartDataSourceHasLabelsAttribute attr =  new ChartDataSourceHasLabelsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( chartDataSourceHasLabelsValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dVrpAttribute</code> , See {@odf.attribute dr3d:vrp}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dVrpAttribute()
	{
		Dr3dVrpAttribute attr = (Dr3dVrpAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "vrp" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dVrpAttribute</code> , See {@odf.attribute dr3d:vrp}
	 *
	 * @param dr3dVrpValue   The type is <code>String</code>
	 */
	public void setDr3dVrpAttribute( String dr3dVrpValue )
	{
		Dr3dVrpAttribute attr =  new Dr3dVrpAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dVrpValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dVpnAttribute</code> , See {@odf.attribute dr3d:vpn}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dVpnAttribute()
	{
		Dr3dVpnAttribute attr = (Dr3dVpnAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "vpn" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dVpnAttribute</code> , See {@odf.attribute dr3d:vpn}
	 *
	 * @param dr3dVpnValue   The type is <code>String</code>
	 */
	public void setDr3dVpnAttribute( String dr3dVpnValue )
	{
		Dr3dVpnAttribute attr =  new Dr3dVpnAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dVpnValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dVupAttribute</code> , See {@odf.attribute dr3d:vup}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dVupAttribute()
	{
		Dr3dVupAttribute attr = (Dr3dVupAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "vup" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dVupAttribute</code> , See {@odf.attribute dr3d:vup}
	 *
	 * @param dr3dVupValue   The type is <code>String</code>
	 */
	public void setDr3dVupAttribute( String dr3dVupValue )
	{
		Dr3dVupAttribute attr =  new Dr3dVupAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dVupValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dProjectionAttribute</code> , See {@odf.attribute dr3d:projection}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dProjectionAttribute()
	{
		Dr3dProjectionAttribute attr = (Dr3dProjectionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "projection" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dProjectionAttribute</code> , See {@odf.attribute dr3d:projection}
	 *
	 * @param dr3dProjectionValue   The type is <code>String</code>
	 */
	public void setDr3dProjectionAttribute( String dr3dProjectionValue )
	{
		Dr3dProjectionAttribute attr =  new Dr3dProjectionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dProjectionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dDistanceAttribute</code> , See {@odf.attribute dr3d:distance}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dDistanceAttribute()
	{
		Dr3dDistanceAttribute attr = (Dr3dDistanceAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "distance" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dDistanceAttribute</code> , See {@odf.attribute dr3d:distance}
	 *
	 * @param dr3dDistanceValue   The type is <code>String</code>
	 */
	public void setDr3dDistanceAttribute( String dr3dDistanceValue )
	{
		Dr3dDistanceAttribute attr =  new Dr3dDistanceAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dDistanceValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dFocalLengthAttribute</code> , See {@odf.attribute dr3d:focal-length}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dFocalLengthAttribute()
	{
		Dr3dFocalLengthAttribute attr = (Dr3dFocalLengthAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "focal-length" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dFocalLengthAttribute</code> , See {@odf.attribute dr3d:focal-length}
	 *
	 * @param dr3dFocalLengthValue   The type is <code>String</code>
	 */
	public void setDr3dFocalLengthAttribute( String dr3dFocalLengthValue )
	{
		Dr3dFocalLengthAttribute attr =  new Dr3dFocalLengthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dFocalLengthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dShadowSlantAttribute</code> , See {@odf.attribute dr3d:shadow-slant}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dShadowSlantAttribute()
	{
		Dr3dShadowSlantAttribute attr = (Dr3dShadowSlantAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "shadow-slant" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dShadowSlantAttribute</code> , See {@odf.attribute dr3d:shadow-slant}
	 *
	 * @param dr3dShadowSlantValue   The type is <code>String</code>
	 */
	public void setDr3dShadowSlantAttribute( String dr3dShadowSlantValue )
	{
		Dr3dShadowSlantAttribute attr =  new Dr3dShadowSlantAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dShadowSlantValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dShadeModeAttribute</code> , See {@odf.attribute dr3d:shade-mode}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dShadeModeAttribute()
	{
		Dr3dShadeModeAttribute attr = (Dr3dShadeModeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "shade-mode" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dShadeModeAttribute</code> , See {@odf.attribute dr3d:shade-mode}
	 *
	 * @param dr3dShadeModeValue   The type is <code>String</code>
	 */
	public void setDr3dShadeModeAttribute( String dr3dShadeModeValue )
	{
		Dr3dShadeModeAttribute attr =  new Dr3dShadeModeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dShadeModeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dAmbientColorAttribute</code> , See {@odf.attribute dr3d:ambient-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dAmbientColorAttribute()
	{
		Dr3dAmbientColorAttribute attr = (Dr3dAmbientColorAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "ambient-color" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dAmbientColorAttribute</code> , See {@odf.attribute dr3d:ambient-color}
	 *
	 * @param dr3dAmbientColorValue   The type is <code>String</code>
	 */
	public void setDr3dAmbientColorAttribute( String dr3dAmbientColorValue )
	{
		Dr3dAmbientColorAttribute attr =  new Dr3dAmbientColorAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dAmbientColorValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dLightingModeAttribute</code> , See {@odf.attribute dr3d:lighting-mode}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dLightingModeAttribute()
	{
		Dr3dLightingModeAttribute attr = (Dr3dLightingModeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "lighting-mode" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dLightingModeAttribute</code> , See {@odf.attribute dr3d:lighting-mode}
	 *
	 * @param dr3dLightingModeValue   The type is <code>String</code>
	 */
	public void setDr3dLightingModeAttribute( String dr3dLightingModeValue )
	{
		Dr3dLightingModeAttribute attr =  new Dr3dLightingModeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dLightingModeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>Dr3dTransformAttribute</code> , See {@odf.attribute dr3d:transform}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDr3dTransformAttribute()
	{
		Dr3dTransformAttribute attr = (Dr3dTransformAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DR3D), "transform" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>Dr3dTransformAttribute</code> , See {@odf.attribute dr3d:transform}
	 *
	 * @param dr3dTransformValue   The type is <code>String</code>
	 */
	public void setDr3dTransformAttribute( String dr3dTransformValue )
	{
		Dr3dTransformAttribute attr =  new Dr3dTransformAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dr3dTransformValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XML), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}

	/**
	 * Create child element {@odf.element dr3d:light}.
	 *
     * @param dr3dDirectionAttributeValue  the <code>String</code> value of <code>Dr3dDirectionAttribute</code>, see {@odf.attribute  dr3d:direction} at specification
	 * @return   return  the element {@odf.element dr3d:light}
	 * DifferentQName 
	 */
    
	public Dr3dLightElement newDr3dLightElement(String dr3dDirectionAttributeValue)
	{
		Dr3dLightElement  dr3dLight = ((OdfFileDom)this.ownerDocument).newOdfElement(Dr3dLightElement.class);
		dr3dLight.setDr3dDirectionAttribute( dr3dDirectionAttributeValue );
		this.appendChild( dr3dLight);
		return  dr3dLight;      
	}
    
	/**
	 * Create child element {@odf.element chart:axis}.
	 *
     * @param chartDimensionAttributeValue  the <code>String</code> value of <code>ChartDimensionAttribute</code>, see {@odf.attribute  chart:dimension} at specification
	 * @return   return  the element {@odf.element chart:axis}
	 * DifferentQName 
	 */
    
	public ChartAxisElement newChartAxisElement(String chartDimensionAttributeValue)
	{
		ChartAxisElement  chartAxis = ((OdfFileDom)this.ownerDocument).newOdfElement(ChartAxisElement.class);
		chartAxis.setChartDimensionAttribute( chartDimensionAttributeValue );
		this.appendChild( chartAxis);
		return  chartAxis;      
	}
    
	/**
	 * Create child element {@odf.element chart:series}.
	 *
	 * @return   return  the element {@odf.element chart:series}
	 * DifferentQName 
	 */
	public ChartSeriesElement newChartSeriesElement()
	{
		ChartSeriesElement  chartSeries = ((OdfFileDom)this.ownerDocument).newOdfElement(ChartSeriesElement.class);
		this.appendChild( chartSeries);
		return  chartSeries;
	}                   
               
	/**
	 * Create child element {@odf.element chart:stock-gain-marker}.
	 *
	 * @return   return  the element {@odf.element chart:stock-gain-marker}
	 * DifferentQName 
	 */
	public ChartStockGainMarkerElement newChartStockGainMarkerElement()
	{
		ChartStockGainMarkerElement  chartStockGainMarker = ((OdfFileDom)this.ownerDocument).newOdfElement(ChartStockGainMarkerElement.class);
		this.appendChild( chartStockGainMarker);
		return  chartStockGainMarker;
	}                   
               
	/**
	 * Create child element {@odf.element chart:stock-loss-marker}.
	 *
	 * @return   return  the element {@odf.element chart:stock-loss-marker}
	 * DifferentQName 
	 */
	public ChartStockLossMarkerElement newChartStockLossMarkerElement()
	{
		ChartStockLossMarkerElement  chartStockLossMarker = ((OdfFileDom)this.ownerDocument).newOdfElement(ChartStockLossMarkerElement.class);
		this.appendChild( chartStockLossMarker);
		return  chartStockLossMarker;
	}                   
               
	/**
	 * Create child element {@odf.element chart:stock-range-line}.
	 *
	 * @return   return  the element {@odf.element chart:stock-range-line}
	 * DifferentQName 
	 */
	public ChartStockRangeLineElement newChartStockRangeLineElement()
	{
		ChartStockRangeLineElement  chartStockRangeLine = ((OdfFileDom)this.ownerDocument).newOdfElement(ChartStockRangeLineElement.class);
		this.appendChild( chartStockRangeLine);
		return  chartStockRangeLine;
	}                   
               
	/**
	 * Create child element {@odf.element chart:wall}.
	 *
	 * @return   return  the element {@odf.element chart:wall}
	 * DifferentQName 
	 */
	public ChartWallElement newChartWallElement()
	{
		ChartWallElement  chartWall = ((OdfFileDom)this.ownerDocument).newOdfElement(ChartWallElement.class);
		this.appendChild( chartWall);
		return  chartWall;
	}                   
               
	/**
	 * Create child element {@odf.element chart:floor}.
	 *
	 * @return   return  the element {@odf.element chart:floor}
	 * DifferentQName 
	 */
	public ChartFloorElement newChartFloorElement()
	{
		ChartFloorElement  chartFloor = ((OdfFileDom)this.ownerDocument).newOdfElement(ChartFloorElement.class);
		this.appendChild( chartFloor);
		return  chartFloor;
	}                   
               
}
