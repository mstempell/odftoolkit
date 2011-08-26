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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDisplayOutlineLevelAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextSeparationCharacterAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:sequence-decl}.
 *
 */
public abstract class TextSequenceDeclElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "sequence-decl" );


	/**
	 * Create the instance of <code>TextSequenceDeclElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextSequenceDeclElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:sequence-decl}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextSequenceDeclElement}
	 *
     * @param textNameAttributeValue  The mandatory attribute {@odf.attribute  text:name}"
     * @param textDisplayOutlineLevelAttributeValue  The mandatory attribute {@odf.attribute  text:display-outline-level}"
     *
	 */
	public void init(String textNameAttributeValue, int textDisplayOutlineLevelAttributeValue)
	{
		setTextNameAttribute( textNameAttributeValue );
		setTextDisplayOutlineLevelAttribute( Integer.valueOf(textDisplayOutlineLevelAttributeValue) );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextNameAttribute()
	{
		TextNameAttribute attr = (TextNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @param textNameValue   The type is <code>String</code>
	 */
	public void setTextNameAttribute( String textNameValue )
	{
		TextNameAttribute attr =  new TextNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDisplayOutlineLevelAttribute</code> , See {@odf.attribute text:display-outline-level}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextDisplayOutlineLevelAttribute()
	{
		TextDisplayOutlineLevelAttribute attr = (TextDisplayOutlineLevelAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "display-outline-level" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDisplayOutlineLevelAttribute</code> , See {@odf.attribute text:display-outline-level}
	 *
	 * @param textDisplayOutlineLevelValue   The type is <code>Integer</code>
	 */
	public void setTextDisplayOutlineLevelAttribute( Integer textDisplayOutlineLevelValue )
	{
		TextDisplayOutlineLevelAttribute attr =  new TextDisplayOutlineLevelAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( textDisplayOutlineLevelValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextSeparationCharacterAttribute</code> , See {@odf.attribute text:separation-character}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextSeparationCharacterAttribute()
	{
		TextSeparationCharacterAttribute attr = (TextSeparationCharacterAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "separation-character" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextSeparationCharacterAttribute</code> , See {@odf.attribute text:separation-character}
	 *
	 * @param textSeparationCharacterValue   The type is <code>String</code>
	 */
	public void setTextSeparationCharacterAttribute( String textSeparationCharacterValue )
	{
		TextSeparationCharacterAttribute attr =  new TextSeparationCharacterAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textSeparationCharacterValue );
	}

}
