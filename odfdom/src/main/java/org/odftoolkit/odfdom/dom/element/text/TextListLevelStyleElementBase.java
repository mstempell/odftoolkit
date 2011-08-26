/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
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
package org.odftoolkit.odfdom.dom.element.text;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.attribute.text.TextLevelAttribute;


/**
 * DOM implementation of OpenDocument base element 
 */
public abstract class TextListLevelStyleElementBase extends OdfStyleBase
{
	/**
	 * Create the instance of TextListLevelStyleElementBase 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 * @param  elementName   The type is <code>OdfName</code>
	 */
	public TextListLevelStyleElementBase( OdfFileDom ownerDoc, OdfName elementName )
	{
		super( ownerDoc, elementName );
	}
	/**
	 * Initialization of the mandatory attributes of {@link  TextListLevelStyleElementBase}
	 *
     * @param textLevelAttributeValue  The mandatory attribute {@odf.attribute  text:level}"
     **/
     
	public void init(int textLevelAttributeValue)
	{
		setTextLevelAttribute( Integer.valueOf(textLevelAttributeValue) );	
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextLevelAttribute</code> , See {@odf.attribute text:level}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextLevelAttribute()
	{
		TextLevelAttribute attr = (TextLevelAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "level" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextLevelAttribute</code> , See {@odf.attribute text:level}
	 *
	 * @param textLevelValue   The type is <code>Integer</code>
	 */
	public void setTextLevelAttribute( Integer textLevelValue )
	{
		TextLevelAttribute attr =  new TextLevelAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( textLevelValue.intValue() );
	}

}
      