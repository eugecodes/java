/*
 * An XML document type.
 * Localname: buildProjectWithPropertiesByName
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one buildProjectWithPropertiesByName(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class BuildProjectWithPropertiesByNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument
{
    
    public BuildProjectWithPropertiesByNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDPROJECTWITHPROPERTIESBYNAME$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProjectWithPropertiesByName");
    
    
    /**
     * Gets the "buildProjectWithPropertiesByName" element
     */
    public com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName getBuildProjectWithPropertiesByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESBYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buildProjectWithPropertiesByName" element
     */
    public void setBuildProjectWithPropertiesByName(com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName buildProjectWithPropertiesByName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESBYNAME$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESBYNAME$0);
            }
            target.set(buildProjectWithPropertiesByName);
        }
    }
    
    /**
     * Appends and returns a new empty "buildProjectWithPropertiesByName" element
     */
    public com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName addNewBuildProjectWithPropertiesByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESBYNAME$0);
            return target;
        }
    }
    /**
     * An XML buildProjectWithPropertiesByName(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class BuildProjectWithPropertiesByNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.BuildProjectWithPropertiesByName
    {
        
        public BuildProjectWithPropertiesByNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN0$0 = 
            new javax.xml.namespace.QName("", "in0");
        private static final javax.xml.namespace.QName IN1$2 = 
            new javax.xml.namespace.QName("", "in1");
        private static final javax.xml.namespace.QName IN2$4 = 
            new javax.xml.namespace.QName("", "in2");
        private static final javax.xml.namespace.QName IN3$6 = 
            new javax.xml.namespace.QName("", "in3");
        private static final javax.xml.namespace.QName IN4$8 = 
            new javax.xml.namespace.QName("", "in4");
        private static final javax.xml.namespace.QName IN5$10 = 
            new javax.xml.namespace.QName("", "in5");
        
        
        /**
         * Gets the "in0" element
         */
        public java.lang.String getIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "in0" element
         */
        public org.apache.xmlbeans.XmlString xgetIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN0$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "in0" element
         */
        public void setIn0(java.lang.String in0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN0$0);
                }
                target.setStringValue(in0);
            }
        }
        
        /**
         * Sets (as xml) the "in0" element
         */
        public void xsetIn0(org.apache.xmlbeans.XmlString in0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IN0$0);
                }
                target.set(in0);
            }
        }
        
        /**
         * Gets the "in1" element
         */
        public java.lang.String getIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "in1" element
         */
        public org.apache.xmlbeans.XmlString xgetIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN1$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "in1" element
         */
        public void setIn1(java.lang.String in1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN1$2);
                }
                target.setStringValue(in1);
            }
        }
        
        /**
         * Sets (as xml) the "in1" element
         */
        public void xsetIn1(org.apache.xmlbeans.XmlString in1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IN1$2);
                }
                target.set(in1);
            }
        }
        
        /**
         * Gets the "in2" element
         */
        public java.lang.String getIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "in2" element
         */
        public org.apache.xmlbeans.XmlString xgetIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN2$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "in2" element
         */
        public void setIn2(java.lang.String in2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN2$4);
                }
                target.setStringValue(in2);
            }
        }
        
        /**
         * Sets (as xml) the "in2" element
         */
        public void xsetIn2(org.apache.xmlbeans.XmlString in2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IN2$4);
                }
                target.set(in2);
            }
        }
        
        /**
         * Gets the "in3" element
         */
        public java.lang.String getIn3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN3$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "in3" element
         */
        public org.apache.xmlbeans.XmlString xgetIn3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN3$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "in3" element
         */
        public void setIn3(java.lang.String in3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN3$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN3$6);
                }
                target.setStringValue(in3);
            }
        }
        
        /**
         * Sets (as xml) the "in3" element
         */
        public void xsetIn3(org.apache.xmlbeans.XmlString in3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN3$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IN3$6);
                }
                target.set(in3);
            }
        }
        
        /**
         * Gets the "in4" element
         */
        public boolean getIn4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN4$8, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "in4" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetIn4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IN4$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "in4" element
         */
        public void setIn4(boolean in4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN4$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN4$8);
                }
                target.setBooleanValue(in4);
            }
        }
        
        /**
         * Sets (as xml) the "in4" element
         */
        public void xsetIn4(org.apache.xmlbeans.XmlBoolean in4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IN4$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(IN4$8);
                }
                target.set(in4);
            }
        }
        
        /**
         * Gets the "in5" element
         */
        public com.urbancode.anthill3.integration.ArrayOfPropertyFacade getIn5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfPropertyFacade)get_store().find_element_user(IN5$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "in5" element
         */
        public void setIn5(com.urbancode.anthill3.integration.ArrayOfPropertyFacade in5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfPropertyFacade)get_store().find_element_user(IN5$10, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfPropertyFacade)get_store().add_element_user(IN5$10);
                }
                target.set(in5);
            }
        }
        
        /**
         * Appends and returns a new empty "in5" element
         */
        public com.urbancode.anthill3.integration.ArrayOfPropertyFacade addNewIn5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfPropertyFacade)get_store().add_element_user(IN5$10);
                return target;
            }
        }
    }
}
