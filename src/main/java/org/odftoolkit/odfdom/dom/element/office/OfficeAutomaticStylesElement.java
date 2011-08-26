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

package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfContainerElementBase;

import org.odftoolkit.odfdom.dom.element.style.StyleStyleElement;
import org.odftoolkit.odfdom.dom.element.text.TextListStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberNumberStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberCurrencyStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberPercentageStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberDateStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTimeStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberBooleanStyleElement;
import org.odftoolkit.odfdom.dom.element.number.NumberTextStyleElement;
import org.odftoolkit.odfdom.dom.element.style.StylePageLayoutElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element office:automatic-styles}.
 *
 */
public abstract class OfficeAutomaticStylesElement extends OdfContainerElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.OFFICE, "automatic-styles" );


	/**
	 * Create the instance of <code>OfficeAutomaticStylesElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public OfficeAutomaticStylesElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element office:automatic-styles}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element style:style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element style:style}
	 * DifferentQName 
	 */
    
	public StyleStyleElement newStyleStyleElement(String styleNameAttributeValue)
	{
		StyleStyleElement  styleStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleStyleElement.class);
		styleStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( styleStyle);
		return  styleStyle;      
	}
    
	/**
	 * Create child element {@odf.element text:list-style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element text:list-style}
	 * DifferentQName 
	 */
    
	public TextListStyleElement newTextListStyleElement(String styleNameAttributeValue)
	{
		TextListStyleElement  textListStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListStyleElement.class);
		textListStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( textListStyle);
		return  textListStyle;      
	}
    
	/**
	 * Create child element {@odf.element number:number-style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element number:number-style}
	 * DifferentQName 
	 */
    
	public NumberNumberStyleElement newNumberNumberStyleElement(String styleNameAttributeValue)
	{
		NumberNumberStyleElement  numberNumberStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberNumberStyleElement.class);
		numberNumberStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( numberNumberStyle);
		return  numberNumberStyle;      
	}
    
	/**
	 * Create child element {@odf.element number:currency-style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element number:currency-style}
	 * DifferentQName 
	 */
    
	public NumberCurrencyStyleElement newNumberCurrencyStyleElement(String styleNameAttributeValue)
	{
		NumberCurrencyStyleElement  numberCurrencyStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberCurrencyStyleElement.class);
		numberCurrencyStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( numberCurrencyStyle);
		return  numberCurrencyStyle;      
	}
    
	/**
	 * Create child element {@odf.element number:percentage-style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element number:percentage-style}
	 * DifferentQName 
	 */
    
	public NumberPercentageStyleElement newNumberPercentageStyleElement(String styleNameAttributeValue)
	{
		NumberPercentageStyleElement  numberPercentageStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberPercentageStyleElement.class);
		numberPercentageStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( numberPercentageStyle);
		return  numberPercentageStyle;      
	}
    
	/**
	 * Create child element {@odf.element number:date-style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element number:date-style}
	 * DifferentQName 
	 */
    
	public NumberDateStyleElement newNumberDateStyleElement(String styleNameAttributeValue)
	{
		NumberDateStyleElement  numberDateStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberDateStyleElement.class);
		numberDateStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( numberDateStyle);
		return  numberDateStyle;      
	}
    
	/**
	 * Create child element {@odf.element number:time-style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element number:time-style}
	 * DifferentQName 
	 */
    
	public NumberTimeStyleElement newNumberTimeStyleElement(String styleNameAttributeValue)
	{
		NumberTimeStyleElement  numberTimeStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberTimeStyleElement.class);
		numberTimeStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( numberTimeStyle);
		return  numberTimeStyle;      
	}
    
	/**
	 * Create child element {@odf.element number:boolean-style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element number:boolean-style}
	 * DifferentQName 
	 */
    
	public NumberBooleanStyleElement newNumberBooleanStyleElement(String styleNameAttributeValue)
	{
		NumberBooleanStyleElement  numberBooleanStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberBooleanStyleElement.class);
		numberBooleanStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( numberBooleanStyle);
		return  numberBooleanStyle;      
	}
    
	/**
	 * Create child element {@odf.element number:text-style}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element number:text-style}
	 * DifferentQName 
	 */
    
	public NumberTextStyleElement newNumberTextStyleElement(String styleNameAttributeValue)
	{
		NumberTextStyleElement  numberTextStyle = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberTextStyleElement.class);
		numberTextStyle.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( numberTextStyle);
		return  numberTextStyle;      
	}
    
	/**
	 * Create child element {@odf.element style:page-layout}.
	 *
     * @param styleNameAttributeValue  the <code>String</code> value of <code>StyleNameAttribute</code>, see {@odf.attribute  style:name} at specification
	 * @return   return  the element {@odf.element style:page-layout}
	 * DifferentQName 
	 */
    
	public StylePageLayoutElement newStylePageLayoutElement(String styleNameAttributeValue)
	{
		StylePageLayoutElement  stylePageLayout = ((OdfFileDom)this.ownerDocument).newOdfElement(StylePageLayoutElement.class);
		stylePageLayout.setStyleNameAttribute( styleNameAttributeValue );
		this.appendChild( stylePageLayout);
		return  stylePageLayout;      
	}
    
}
