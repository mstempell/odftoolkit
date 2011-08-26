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
import org.odftoolkit.odfdom.dom.attribute.table.TableIsSelectionAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOnUpdateKeepStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOnUpdateKeepSizeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableHasPersistentDataAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOrientationAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableContainsHeaderAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDisplayFilterButtonsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTargetRangeAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableRefreshDelayAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:database-range}.
 *
 */
public abstract class TableDatabaseRangeElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "database-range" );


	/**
	 * Create the instance of <code>TableDatabaseRangeElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDatabaseRangeElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:database-range}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableDatabaseRangeElement}
	 *
     * @param tableTargetRangeAddressAttributeValue  The mandatory attribute {@odf.attribute  table:target-range-address}"
     *
	 */
	public void init(String tableTargetRangeAddressAttributeValue)
	{
		setTableTargetRangeAddressAttribute( tableTargetRangeAddressAttributeValue );
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
	 * Receives the value of the ODFDOM attribute representation <code>TableIsSelectionAttribute</code> , See {@odf.attribute table:is-selection}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableIsSelectionAttribute()
	{
		TableIsSelectionAttribute attr = (TableIsSelectionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "is-selection" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableIsSelectionAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIsSelectionAttribute</code> , See {@odf.attribute table:is-selection}
	 *
	 * @param tableIsSelectionValue   The type is <code>Boolean</code>
	 */
	public void setTableIsSelectionAttribute( Boolean tableIsSelectionValue )
	{
		TableIsSelectionAttribute attr =  new TableIsSelectionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableIsSelectionValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableOnUpdateKeepStylesAttribute</code> , See {@odf.attribute table:on-update-keep-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableOnUpdateKeepStylesAttribute()
	{
		TableOnUpdateKeepStylesAttribute attr = (TableOnUpdateKeepStylesAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "on-update-keep-styles" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableOnUpdateKeepStylesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableOnUpdateKeepStylesAttribute</code> , See {@odf.attribute table:on-update-keep-styles}
	 *
	 * @param tableOnUpdateKeepStylesValue   The type is <code>Boolean</code>
	 */
	public void setTableOnUpdateKeepStylesAttribute( Boolean tableOnUpdateKeepStylesValue )
	{
		TableOnUpdateKeepStylesAttribute attr =  new TableOnUpdateKeepStylesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableOnUpdateKeepStylesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableOnUpdateKeepSizeAttribute</code> , See {@odf.attribute table:on-update-keep-size}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableOnUpdateKeepSizeAttribute()
	{
		TableOnUpdateKeepSizeAttribute attr = (TableOnUpdateKeepSizeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "on-update-keep-size" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableOnUpdateKeepSizeAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableOnUpdateKeepSizeAttribute</code> , See {@odf.attribute table:on-update-keep-size}
	 *
	 * @param tableOnUpdateKeepSizeValue   The type is <code>Boolean</code>
	 */
	public void setTableOnUpdateKeepSizeAttribute( Boolean tableOnUpdateKeepSizeValue )
	{
		TableOnUpdateKeepSizeAttribute attr =  new TableOnUpdateKeepSizeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableOnUpdateKeepSizeValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableHasPersistentDataAttribute</code> , See {@odf.attribute table:has-persistent-data}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableHasPersistentDataAttribute()
	{
		TableHasPersistentDataAttribute attr = (TableHasPersistentDataAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "has-persistent-data" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableHasPersistentDataAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableHasPersistentDataAttribute</code> , See {@odf.attribute table:has-persistent-data}
	 *
	 * @param tableHasPersistentDataValue   The type is <code>Boolean</code>
	 */
	public void setTableHasPersistentDataAttribute( Boolean tableHasPersistentDataValue )
	{
		TableHasPersistentDataAttribute attr =  new TableHasPersistentDataAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableHasPersistentDataValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableOrientationAttribute</code> , See {@odf.attribute table:orientation}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableOrientationAttribute()
	{
		TableOrientationAttribute attr = (TableOrientationAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "orientation" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableOrientationAttribute</code> , See {@odf.attribute table:orientation}
	 *
	 * @param tableOrientationValue   The type is <code>String</code>
	 */
	public void setTableOrientationAttribute( String tableOrientationValue )
	{
		TableOrientationAttribute attr =  new TableOrientationAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableOrientationValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableContainsHeaderAttribute</code> , See {@odf.attribute table:contains-header}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableContainsHeaderAttribute()
	{
		TableContainsHeaderAttribute attr = (TableContainsHeaderAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "contains-header" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableContainsHeaderAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableContainsHeaderAttribute</code> , See {@odf.attribute table:contains-header}
	 *
	 * @param tableContainsHeaderValue   The type is <code>Boolean</code>
	 */
	public void setTableContainsHeaderAttribute( Boolean tableContainsHeaderValue )
	{
		TableContainsHeaderAttribute attr =  new TableContainsHeaderAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableContainsHeaderValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDisplayFilterButtonsAttribute</code> , See {@odf.attribute table:display-filter-buttons}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableDisplayFilterButtonsAttribute()
	{
		TableDisplayFilterButtonsAttribute attr = (TableDisplayFilterButtonsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "display-filter-buttons" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableDisplayFilterButtonsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDisplayFilterButtonsAttribute</code> , See {@odf.attribute table:display-filter-buttons}
	 *
	 * @param tableDisplayFilterButtonsValue   The type is <code>Boolean</code>
	 */
	public void setTableDisplayFilterButtonsAttribute( Boolean tableDisplayFilterButtonsValue )
	{
		TableDisplayFilterButtonsAttribute attr =  new TableDisplayFilterButtonsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableDisplayFilterButtonsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTargetRangeAddressAttribute</code> , See {@odf.attribute table:target-range-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTargetRangeAddressAttribute()
	{
		TableTargetRangeAddressAttribute attr = (TableTargetRangeAddressAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "target-range-address" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTargetRangeAddressAttribute</code> , See {@odf.attribute table:target-range-address}
	 *
	 * @param tableTargetRangeAddressValue   The type is <code>String</code>
	 */
	public void setTableTargetRangeAddressAttribute( String tableTargetRangeAddressValue )
	{
		TableTargetRangeAddressAttribute attr =  new TableTargetRangeAddressAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableTargetRangeAddressValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableRefreshDelayAttribute</code> , See {@odf.attribute table:refresh-delay}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableRefreshDelayAttribute()
	{
		TableRefreshDelayAttribute attr = (TableRefreshDelayAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "refresh-delay" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableRefreshDelayAttribute</code> , See {@odf.attribute table:refresh-delay}
	 *
	 * @param tableRefreshDelayValue   The type is <code>String</code>
	 */
	public void setTableRefreshDelayAttribute( String tableRefreshDelayValue )
	{
		TableRefreshDelayAttribute attr =  new TableRefreshDelayAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableRefreshDelayValue );
	}

	/**
	 * Create child element {@odf.element table:database-source-sql}.
	 *
     * @param tableDatabaseNameAttributeValue  the <code>String</code> value of <code>TableDatabaseNameAttribute</code>, see {@odf.attribute  table:database-name} at specification
	 * @param tableSqlStatementAttributeValue  the <code>String</code> value of <code>TableSqlStatementAttribute</code>, see {@odf.attribute  table:sql-statement} at specification
	 * @return   return  the element {@odf.element table:database-source-sql}
	 * DifferentQName 
	 */
    
	public TableDatabaseSourceSqlElement newTableDatabaseSourceSqlElement(String tableDatabaseNameAttributeValue, String tableSqlStatementAttributeValue)
	{
		TableDatabaseSourceSqlElement  tableDatabaseSourceSql = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDatabaseSourceSqlElement.class);
		tableDatabaseSourceSql.setTableDatabaseNameAttribute( tableDatabaseNameAttributeValue );
		tableDatabaseSourceSql.setTableSqlStatementAttribute( tableSqlStatementAttributeValue );
		this.appendChild( tableDatabaseSourceSql);
		return  tableDatabaseSourceSql;      
	}
    
	/**
	 * Create child element {@odf.element table:database-source-query}.
	 *
     * @param tableDatabaseNameAttributeValue  the <code>String</code> value of <code>TableDatabaseNameAttribute</code>, see {@odf.attribute  table:database-name} at specification
	 * @param tableQueryNameAttributeValue  the <code>String</code> value of <code>TableQueryNameAttribute</code>, see {@odf.attribute  table:query-name} at specification
	 * @return   return  the element {@odf.element table:database-source-query}
	 * DifferentQName 
	 */
    
	public TableDatabaseSourceQueryElement newTableDatabaseSourceQueryElement(String tableDatabaseNameAttributeValue, String tableQueryNameAttributeValue)
	{
		TableDatabaseSourceQueryElement  tableDatabaseSourceQuery = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDatabaseSourceQueryElement.class);
		tableDatabaseSourceQuery.setTableDatabaseNameAttribute( tableDatabaseNameAttributeValue );
		tableDatabaseSourceQuery.setTableQueryNameAttribute( tableQueryNameAttributeValue );
		this.appendChild( tableDatabaseSourceQuery);
		return  tableDatabaseSourceQuery;      
	}
    
	/**
	 * Create child element {@odf.element table:database-source-table}.
	 *
     * @param tableDatabaseNameAttributeValue  the <code>String</code> value of <code>TableDatabaseNameAttribute</code>, see {@odf.attribute  table:database-name} at specification
	 * @param tableDatabaseTableNameAttributeValue  the <code>String</code> value of <code>TableDatabaseTableNameAttribute</code>, see {@odf.attribute  table:database-table-name} at specification
	 * @return   return  the element {@odf.element table:database-source-table}
	 * DifferentQName 
	 */
    
	public TableDatabaseSourceTableElement newTableDatabaseSourceTableElement(String tableDatabaseNameAttributeValue, String tableDatabaseTableNameAttributeValue)
	{
		TableDatabaseSourceTableElement  tableDatabaseSourceTable = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDatabaseSourceTableElement.class);
		tableDatabaseSourceTable.setTableDatabaseNameAttribute( tableDatabaseNameAttributeValue );
		tableDatabaseSourceTable.setTableDatabaseTableNameAttribute( tableDatabaseTableNameAttributeValue );
		this.appendChild( tableDatabaseSourceTable);
		return  tableDatabaseSourceTable;      
	}
    
	/**
	 * Create child element {@odf.element table:filter}.
	 *
	 * @return   return  the element {@odf.element table:filter}
	 * DifferentQName 
	 */
	public TableFilterElement newTableFilterElement()
	{
		TableFilterElement  tableFilter = ((OdfFileDom)this.ownerDocument).newOdfElement(TableFilterElement.class);
		this.appendChild( tableFilter);
		return  tableFilter;
	}                   
               
	/**
	 * Create child element {@odf.element table:sort}.
	 *
	 * @return   return  the element {@odf.element table:sort}
	 * DifferentQName 
	 */
	public TableSortElement newTableSortElement()
	{
		TableSortElement  tableSort = ((OdfFileDom)this.ownerDocument).newOdfElement(TableSortElement.class);
		this.appendChild( tableSort);
		return  tableSort;
	}                   
               
	/**
	 * Create child element {@odf.element table:subtotal-rules}.
	 *
	 * @return   return  the element {@odf.element table:subtotal-rules}
	 * DifferentQName 
	 */
	public TableSubtotalRulesElement newTableSubtotalRulesElement()
	{
		TableSubtotalRulesElement  tableSubtotalRules = ((OdfFileDom)this.ownerDocument).newOdfElement(TableSubtotalRulesElement.class);
		this.appendChild( tableSubtotalRules);
		return  tableSubtotalRules;
	}                   
               
}
