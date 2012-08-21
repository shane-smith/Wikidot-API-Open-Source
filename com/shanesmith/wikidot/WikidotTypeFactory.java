/**
 * Wikidot API Open Source Project
 * Java API library
 * 
 * Lead developer: Shane Smith (leiger)
 * Developer Website: www.shane-smith.com
 * Project Website: api-java.wikidot.com
 * 
 * Licensed under GNU GPL v3
 **/

package com.shanesmith.wikidot;

import org.apache.xmlrpc.common.TypeFactoryImpl;
import org.apache.xmlrpc.common.XmlRpcController;

/**
 * This class extends TypeFactoryImpl and caters for the Wikidot API's use of "<NIL>" as a data type.
 * @author Shane Smith (leiger)
 */
public class WikidotTypeFactory extends TypeFactoryImpl
{
	public WikidotTypeFactory(XmlRpcController pController)
	{
		super(pController);
	}
	
	// TODO
}
