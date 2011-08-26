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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIndexAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:operation}.
 *
 */
public abstract class TableOperationElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "operation" );

	/**
	 * The value set of {@odf.attribute table:name}.
	 */
	 public enum TableNameAttributeValue {
	 
	 REMOVE_DEPENDENTS( TableNameAttribute.Value.REMOVE_DEPENDENTS.toString() ), REMOVE_PRECEDENTS( TableNameAttribute.Value.REMOVE_PRECEDENTS.toString() ), TRACE_DEPENDENTS( TableNameAttribute.Value.TRACE_DEPENDENTS.toString() ), TRACE_ERRORS( TableNameAttribute.Value.TRACE_ERRORS.toString() ), TRACE_PRECEDENTS( TableNameAttribute.Value.TRACE_PRECEDENTS.toString() );
              
		private String mValue;
	 	
		TableNameAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static TableNameAttributeValue enumValueOf( String value )
	    {
	        for( TableNameAttributeValue aIter : values() )
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
	 * Create the instance of <code>TableOperationElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableOperationElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:operation}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableOperationElement}
	 *
     * @param tableNameAttributeValue  The mandatory attribute {@odf.attribute  table:name}"
     * @param tableIndexAttributeValue  The mandatory attribute {@odf.attribute  table:index}"
     *
	 */
	public void init(String tableNameAttributeValue, int tableIndexAttributeValue)
	{
		setTableIndexAttribute( Integer.valueOf(tableIndexAttributeValue) );
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
	 * Receives the value of the ODFDOM attribute representation <code>TableIndexAttribute</code> , See {@odf.attribute table:index}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableIndexAttribute()
	{
		TableIndexAttribute attr = (TableIndexAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "index" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIndexAttribute</code> , See {@odf.attribute table:index}
	 *
	 * @param tableIndexValue   The type is <code>Integer</code>
	 */
	public void setTableIndexAttribute( Integer tableIndexValue )
	{
		TableIndexAttribute attr =  new TableIndexAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( tableIndexValue.intValue() );
	}

}
