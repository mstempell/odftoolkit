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
package org.odftoolkit.odfdom.dom.attribute.table;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfAttribute;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.element.table.TableCellRangeSourceElement;
import org.odftoolkit.odfdom.dom.element.table.TableContentValidationElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotGroupElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotGroupMemberElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotMemberElement;
import org.odftoolkit.odfdom.dom.element.table.TableDataPilotTableElement;
import org.odftoolkit.odfdom.dom.element.table.TableDatabaseRangeElement;
import org.odftoolkit.odfdom.dom.element.table.TableNamedExpressionElement;
import org.odftoolkit.odfdom.dom.element.table.TableNamedRangeElement;
import org.odftoolkit.odfdom.dom.element.table.TableOperationElement;
import org.odftoolkit.odfdom.dom.element.table.TableSourceServiceElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableTemplateElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute table:name}.
 *
 */
public class TableNameAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.newName( OdfNamespaceNames.TABLE, "name" );

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute table:name}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public TableNameAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute table:name}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}
	
	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * The value set of {@odf.attribute table:name}.
	 */
	public enum Value {
	 
	 REMOVE_DEPENDENTS( "remove-dependents" ), REMOVE_PRECEDENTS( "remove-precedents" ), TRACE_DEPENDENTS( "trace-dependents" ), TRACE_ERRORS( "trace-errors" ), TRACE_PRECEDENTS( "trace-precedents" );
              
		private String mValue;

		Value( String value )
		{
			mValue = value;
		}
	 	
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static Value enumValueOf( String value )
	    {
	        for( Value aIter : values() )
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
	 * @param attrValue The <code>Enum</code> value of the attribute.
	 */
	public void setEnumValue(Value attrValue) {
		setValue(attrValue.toString());
	}
    
	/**
	 * @return Returns the <code>Enum</code> value of the attribute
	 */
	public Value getEnumValue(){
		return Value.enumValueOf(this.getValue());
	}
    
	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 * @throws IllegalArgumentException If the provided attribute value is invalid
	 */
	@Override
	public void setValue(String attrValue) {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof TableCellRangeSourceElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableContentValidationElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableDataPilotGroupElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableDataPilotGroupMemberElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableDataPilotMemberElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableDataPilotTableElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableDatabaseRangeElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableNamedExpressionElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableNamedRangeElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableOperationElement ){
					super.setValue(TableOperationElement.TableNameAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof TableSourceServiceElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableTableElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof TableTableTemplateElement ){
					super.setValue(attrValue);
				}			
			} catch (NullPointerException e) {
				// TODO: validation handling/logging
				throw new IllegalArgumentException(e);
			}
			  catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw (e);
			}
		}else{
			//2DO:what should do when the owner element is null?
			super.setValue(attrValue);
		}
	}
    
	/**
	 * @return Returns the <code>String</code> value of the attribute
	 */
	@Override
	public String getValue(){
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof TableCellRangeSourceElement ){
					return super.getValue();
				}else if( parentElement instanceof TableContentValidationElement ){
					return super.getValue();
				}else if( parentElement instanceof TableDataPilotGroupElement ){
					return super.getValue();
				}else if( parentElement instanceof TableDataPilotGroupMemberElement ){
					return super.getValue();
				}else if( parentElement instanceof TableDataPilotMemberElement ){
					return super.getValue();
				}else if( parentElement instanceof TableDataPilotTableElement ){
					return super.getValue();
				}else if( parentElement instanceof TableDatabaseRangeElement ){
					return super.getValue();
				}else if( parentElement instanceof TableNamedExpressionElement ){
					return super.getValue();
				}else if( parentElement instanceof TableNamedRangeElement ){
					return super.getValue();
				}else if( parentElement instanceof TableOperationElement ){
					return TableOperationElement.TableNameAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof TableSourceServiceElement ){
					return super.getValue();
				}else if( parentElement instanceof TableTableElement ){
					return super.getValue();
				}else if( parentElement instanceof TableTableTemplateElement ){
					return super.getValue();
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw new NumberFormatException("the value of table:name is not valid");
			}
		}else{
			//2DO:what should do when the owner element is null?
			return super.getValue();
		}
		return null;
	}
	
	/**
	 * Returns the default value of {@odf.attribute table:name}.
	 * 
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		return null;
	}
	
	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if {@odf.attribute table:name} has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return false;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}
