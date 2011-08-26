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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableExpressionAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableBaseCellAddressAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:named-expression}.
 *
 */
public class TableNamedExpressionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "named-expression" );


	/**
	 * Create the instance of <code>TableNamedExpressionElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableNamedExpressionElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:named-expression}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableNamedExpressionElement}
	 *
     * @param tableNameAttributeValue  The mandatory attribute {@odf.attribute  table:name}"
     * @param tableExpressionAttributeValue  The mandatory attribute {@odf.attribute  table:expression}"
     *
	 */
	public void init(String tableNameAttributeValue, String tableExpressionAttributeValue)
	{
		setTableExpressionAttribute( tableExpressionAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableNameAttribute()
	{
		TableNameAttribute attr = (TableNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @param tableNameValue   The type is <code>String</code>
	 */
	public void setTableNameAttribute( String tableNameValue )
	{
		TableNameAttribute attr =  new TableNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableExpressionAttribute</code> , See {@odf.attribute table:expression}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableExpressionAttribute()
	{
		TableExpressionAttribute attr = (TableExpressionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "expression" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableExpressionAttribute</code> , See {@odf.attribute table:expression}
	 *
	 * @param tableExpressionValue   The type is <code>String</code>
	 */
	public void setTableExpressionAttribute( String tableExpressionValue )
	{
		TableExpressionAttribute attr =  new TableExpressionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableExpressionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableBaseCellAddressAttribute</code> , See {@odf.attribute table:base-cell-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableBaseCellAddressAttribute()
	{
		TableBaseCellAddressAttribute attr = (TableBaseCellAddressAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "base-cell-address" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableBaseCellAddressAttribute</code> , See {@odf.attribute table:base-cell-address}
	 *
	 * @param tableBaseCellAddressValue   The type is <code>String</code>
	 */
	public void setTableBaseCellAddressAttribute( String tableBaseCellAddressValue )
	{
		TableBaseCellAddressAttribute attr =  new TableBaseCellAddressAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableBaseCellAddressValue );
	}

}