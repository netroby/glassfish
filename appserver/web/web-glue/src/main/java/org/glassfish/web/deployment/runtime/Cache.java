/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.web.deployment.runtime;

/**
* this class contains runtime information for the web bundle 
* it was kept to be backward compatible with the schema2beans descriptors
* generated by iAS 7.0 engineering team.
*
* @author Jerome Dochez
*/
public class Cache extends WebPropertyContainer
{
    
    static public final String CACHE_HELPER = "CacheHelper";	// NOI18N
    static public final String DEFAULT_HELPER = "DefaultHelper";	// NOI18N
    static public final String PROPERTY = "WebProperty";	// NOI18N
    static public final String CACHE_MAPPING = "CacheMapping";	// NOI18N
    static public final String MAX_ENTRIES = "MaxEntries";
    static public final String TIMEOUT_IN_SECONDS = "TimeoutInSeconds";
    static public final String ENABLED = "Enabled";
    
    public Cache() {
	
    	// set default values
	setAttributeValue("MaxEntries", "4096");
	setAttributeValue("TimeoutInSeconds", "30");
    }
    
    // This attribute is an array, possibly empty
    public void setCacheHelper(int index, CacheHelper value)
    {
	setValue(CACHE_HELPER, index, value);
    }
    
    //
    public CacheHelper getCacheHelper(int index)
    {
	return (CacheHelper)getValue(CACHE_HELPER, index);
    }
    
    // This attribute is an array, possibly empty
    public void setCacheHelper(CacheHelper[] value)
    {
	setValue(CACHE_HELPER, value);
    }
    
    //
    public CacheHelper[] getCacheHelper()
    {
	return (CacheHelper[])getValues(CACHE_HELPER);
    }
    
    // Return the number of properties
    public int sizeCacheHelper()
    {
	return size(CACHE_HELPER);
    }
    
    // Add a new element returning its index in the list
    public int addCacheHelper(CacheHelper value)
    {
	return addValue(CACHE_HELPER, value);
    }
    
    // Add a new element returning its index in the list
    public void addNewCacheHelper(CacheHelper value)
    {
	addCacheHelper(value);
    }    
    
    //
    // Remove an element using its reference
    // Returns the index the element had in the list
    //
    public int removeCacheHelper(CacheHelper value)
    {
	return removeValue(CACHE_HELPER, value);
    }
    
    // This attribute is optional
    public void setDefaultHelper(DefaultHelper value)
    {
	setValue(DEFAULT_HELPER, value);
    }
    
    //
    public DefaultHelper getDefaultHelper()
    {
	return (DefaultHelper)getValue(DEFAULT_HELPER);
    }
    
    // This attribute is an array, possibly empty
    public void setCacheMapping(int index, CacheMapping value)
    {
	setValue(CACHE_MAPPING, index, value);
    }
    
    //
    public CacheMapping getCacheMapping(int index)
    {
	return (CacheMapping)getValue(CACHE_MAPPING, index);
    }
    
    // This attribute is an array, possibly empty
    public void setCacheMapping(CacheMapping[] value)
    {
	setValue(CACHE_MAPPING, value);
    }
    
    //
    public CacheMapping[] getCacheMapping()
    {
	return (CacheMapping[])getValues(CACHE_MAPPING);
    }
    
    // Return the number of properties
    public int sizeCacheMapping()
    {
	return size(CACHE_MAPPING);
    }
    
    // Add a new element returning its index in the list
    public int addCacheMapping(CacheMapping value)
    {
	return addValue(CACHE_MAPPING, value);
    }
    
    // Add a new element returning its index in the list
    public void addNewCacheMapping(CacheMapping value)
    {
	addCacheMapping(value);
    }
    
    //
    // Remove an element using its reference
    // Returns the index the element had in the list
    //
    public int removeCacheMapping(CacheMapping value)
    {
	return removeValue(CACHE_MAPPING, value);
    }
    
    // This method verifies that the mandatory properties are set
    public boolean verify()
    {
	return true;
    }
    
}