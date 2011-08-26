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

package org.odftoolkit.odfdom.dom.element.dr3d;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStyleablePresentationElement;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import java.util.List;
import org.odftoolkit.odfdom.dom.type.OdfStyleNames;

;

/**
 * ODF DOM Element implementation for element "<dr3d:rotate>".
 */
public abstract class OdfRotateElement extends OdfStyleablePresentationElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DR3D, "rotate" );

    public OdfRotateElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(Integer _aViewbox, String _aD)
    {
        setViewbox( _aViewbox );
        setD( _aD );
    }

    /**
     * Get value of attribute "svg:viewBox".
     */
    public Integer getViewbox()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SVG, "viewBox" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "svg:viewBox".
     */
    public void setViewbox( Integer _aViewbox )
    {                    
        String aStringVal = Integer.toString( _aViewbox );
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "viewBox" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:d".
     */
    public String getD()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "d" ) );
    }

    /**
     * Set value of attribute "svg:d".
     */
    public void setD( String _aD )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "d" ), _aD );
    }

    /**
     * Get value of attribute "draw:z-index".
     */
    public Integer getZIndex()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "z-index" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:z-index".
     */
    public void setZIndex( Integer _aZIndex )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aZIndex );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "z-index" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:id".
     */
    public String getDrawid()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "id" ) );
    }

    /**
     * Set value of attribute "draw:id".
     */
    public void setDrawid( String _aDrawid )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "id" ), _aDrawid );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:layer".
     */
    public String getLayer()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ) );
    }

    /**
     * Set value of attribute "draw:layer".
     */
    public void setLayer( String _aLayer )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ), _aLayer );
    }

    /**
     * Get value of attribute "draw:style-name".
     */
    public String getDrawStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:style-name".
     */
    public void setDrawStyleName( String _aDrawStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aDrawStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:class-names".
     */
    public List<String> getDrawClassNames()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "class-names" ) );
        return OdfStyleNames.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:class-names".
     */
    public void setDrawClassNames( List<String> _aDrawClassNames )
    {                    
        String aStringVal = OdfStyleNames.toString( _aDrawClassNames );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "class-names" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:style-name".
     */
    public String getPresentationStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:style-name".
     */
    public void setPresentationStyleName( String _aPresentationStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aPresentationStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:class-names".
     */
    public List<String> getPresentationClassNames()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "class-names" ) );
        return OdfStyleNames.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:class-names".
     */
    public void setPresentationClassNames( List<String> _aPresentationClassNames )
    {                    
        String aStringVal = OdfStyleNames.toString( _aPresentationClassNames );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "class-names" ), aStringVal );
    }

    /**
     * Get value of attribute "dr3d:transform".
     */
    public String getTransform()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DR3D, "transform" ) );
    }

    /**
     * Set value of attribute "dr3d:transform".
     */
    public void setTransform( String _aTransform )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DR3D, "transform" ), _aTransform );
    }

}
