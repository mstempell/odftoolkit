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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbAsTemplateAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbDescriptionAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentElement;
import org.odftoolkit.odfdom.dom.element.math.MathMathElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element db:component}.
 *
 */
public abstract class DbComponentElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DB, "component" );

	/**
	 * The value set of {@odf.attribute xlink:show}.
	 */
	 public enum XlinkShowAttributeValue {
	 
	 NONE( XlinkShowAttribute.Value.NONE.toString() );
              
		private String mValue;
	 	
		XlinkShowAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static XlinkShowAttributeValue enumValueOf( String value )
	    {
	        for( XlinkShowAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	/**
	 * The value set of {@odf.attribute xlink:actuate}.
	 */
	 public enum XlinkActuateAttributeValue {
	 
	 ONREQUEST( XlinkActuateAttribute.Value.ONREQUEST.toString() );
              
		private String mValue;
	 	
		XlinkActuateAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static XlinkActuateAttributeValue enumValueOf( String value )
	    {
	        for( XlinkActuateAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}

	/**
	 * Create the instance of <code>DbComponentElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbComponentElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:component}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DbComponentElement}
	 *
     * @param dbNameAttributeValue  The mandatory attribute {@odf.attribute  db:name}"
     *
	 */
	public void init(String dbNameAttributeValue)
	{
		setDbNameAttribute( dbNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkTypeAttribute()
	{
		XlinkTypeAttribute attr = (XlinkTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @param xlinkTypeValue   The type is <code>String</code>
	 */
	public void setXlinkTypeAttribute( String xlinkTypeValue )
	{
		XlinkTypeAttribute attr =  new XlinkTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkHrefAttribute()
	{
		XlinkHrefAttribute attr = (XlinkHrefAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "href" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @param xlinkHrefValue   The type is <code>String</code>
	 */
	public void setXlinkHrefAttribute( String xlinkHrefValue )
	{
		XlinkHrefAttribute attr =  new XlinkHrefAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkHrefValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkShowAttribute()
	{
		XlinkShowAttribute attr = (XlinkShowAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "show" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @param xlinkShowValue   The type is <code>String</code>
	 */
	public void setXlinkShowAttribute( String xlinkShowValue )
	{
		XlinkShowAttribute attr =  new XlinkShowAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkShowValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkActuateAttribute()
	{
		XlinkActuateAttribute attr = (XlinkActuateAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "actuate" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @param xlinkActuateValue   The type is <code>String</code>
	 */
	public void setXlinkActuateAttribute( String xlinkActuateValue )
	{
		XlinkActuateAttribute attr =  new XlinkActuateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkActuateValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbAsTemplateAttribute</code> , See {@odf.attribute db:as-template}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbAsTemplateAttribute()
	{
		DbAsTemplateAttribute attr = (DbAsTemplateAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "as-template" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbAsTemplateAttribute</code> , See {@odf.attribute db:as-template}
	 *
	 * @param dbAsTemplateValue   The type is <code>Boolean</code>
	 */
	public void setDbAsTemplateAttribute( Boolean dbAsTemplateValue )
	{
		DbAsTemplateAttribute attr =  new DbAsTemplateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbAsTemplateValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbNameAttribute()
	{
		DbNameAttribute attr = (DbNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @param dbNameValue   The type is <code>String</code>
	 */
	public void setDbNameAttribute( String dbNameValue )
	{
		DbNameAttribute attr =  new DbNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbTitleAttribute</code> , See {@odf.attribute db:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbTitleAttribute()
	{
		DbTitleAttribute attr = (DbTitleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "title" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbTitleAttribute</code> , See {@odf.attribute db:title}
	 *
	 * @param dbTitleValue   The type is <code>String</code>
	 */
	public void setDbTitleAttribute( String dbTitleValue )
	{
		DbTitleAttribute attr =  new DbTitleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbTitleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See {@odf.attribute db:description}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbDescriptionAttribute()
	{
		DbDescriptionAttribute attr = (DbDescriptionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "description" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See {@odf.attribute db:description}
	 *
	 * @param dbDescriptionValue   The type is <code>String</code>
	 */
	public void setDbDescriptionAttribute( String dbDescriptionValue )
	{
		DbDescriptionAttribute attr =  new DbDescriptionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbDescriptionValue );
	}

	/**
	 * Create child element {@odf.element office:document}.
	 *
     * @param officeMimetypeAttributeValue  the <code>String</code> value of <code>OfficeMimetypeAttribute</code>, see {@odf.attribute  office:mimetype} at specification
	 * @param officeVersionAttributeValue  the <code>String</code> value of <code>OfficeVersionAttribute</code>, see {@odf.attribute  office:version} at specification
	 * @return   return  the element {@odf.element office:document}
	 * DifferentQName 
	 */
    
	public OfficeDocumentElement newOfficeDocumentElement(String officeMimetypeAttributeValue, String officeVersionAttributeValue)
	{
		OfficeDocumentElement  officeDocument = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeDocumentElement.class);
		officeDocument.setOfficeMimetypeAttribute( officeMimetypeAttributeValue );
		officeDocument.setOfficeVersionAttribute( officeVersionAttributeValue );
		this.appendChild( officeDocument);
		return  officeDocument;      
	}
    
	/**
	 * Create child element {@odf.element math:math}.
	 *
    
	 * @return   return  the element {@odf.element math:math}
	 * DifferentQName 
	 */
    
	public MathMathElement newMathMathElement()
	{
		MathMathElement  mathMath = ((OdfFileDom)this.ownerDocument).newOdfElement(MathMathElement.class);
		this.appendChild( mathMath);
		return  mathMath;      
	}
    
}
