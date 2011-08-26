/*
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
 */

package org.openoffice.odf.codegen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import org.openoffice.odf.codegen.rng.RngAttribute;

/**
 *
 * @author cl93746
 */
public class Attribute
{
    private String Name;
    private String QName;
    private String ValueType;
    private String ConversionType;
    private String DefaultValue;
    private HashSet< String > Values;
    private boolean Optional;

    Attribute( String qName, String valueType, String conversionType, Iterator<String> values, boolean optional, String defaultValue )
    {
        Name = qName;
        ValueType = valueType;
        ConversionType = conversionType;
        QName = qName;
        DefaultValue = defaultValue;
        if( values != null )
        {
            while( values.hasNext() )
            {
                addValue( values.next() );
            }
        }
        Optional = optional;
    }

    public String getDefaultValue()
    {
        return DefaultValue;
    }

    public boolean isOptional()
    {
        return Optional;
    }
    
    public String getName()
    {
        return Name;
    }

    public void addValue( String value )
    {
        if( Values == null )
            Values = new HashSet< String >();
        
        if( !Values.contains(value) )
            Values.add(value);
    }
    
    public String getValueType()
    {
        return ValueType;
    }
    
    public void setValueType( String type )
    {
        if( ValueType.equals( ConversionType ) )
            ConversionType = type;
        ValueType = type;
    }

    public String getConversionType()
    {
        return ConversionType;
    }
    
    public void setConversionType( String type )
    {
        ConversionType = type;
    }
    
    public Iterator< String > getValues()
    {
        if( Values != null )
        {
            return Values.iterator();
        }
        else
        {
            Vector< String > temp = new Vector< String >();
            return temp.iterator();
        }
    }
    
    public String getQName()
    {
        return QName;
    }

    public int getValueCount()
    {
        return (Values == null) ? 0 : Values.size();
    }
    
    public boolean hasValue( String value )
    {
        return (Values != null) && Values.contains(value);
    }

    void setName(String name)
    {
        Name = name;
    }
}
