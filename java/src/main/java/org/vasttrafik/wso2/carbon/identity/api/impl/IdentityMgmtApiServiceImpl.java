package org.vasttrafik.wso2.carbon.identity.api.impl;

import java.util.Locale;
import java.util.ResourceBundle;

import org.vasttrafik.wso2.carbon.common.api.impl.AbstractApiServiceImpl;
import org.vasttrafik.wso2.carbon.common.api.utils.AbstractErrorListResourceBundle;
import org.vasttrafik.wso2.carbon.common.api.utils.ResponseUtils;


/**
 * Base class for community API resources.
 * 
 * @author Lars Andersson, Västtrafik AB
 *
 */
public class IdentityMgmtApiServiceImpl extends AbstractApiServiceImpl {
	
	/**
	 * Resource bundle to use when constructing messages and responses
	 */
	private static AbstractErrorListResourceBundle resourceBundle = null;
	
	/**
	 * ResponseUtils instance
	 */
	protected static ResponseUtils responseUtils = null;
	
	/**
	 * The resource bundle name
	 */
	private static final String bundleName = "org.vasttrafik.wso2.carbon.identity.api.utils.IdentityErrorListResourceBundle";
	
	/**
	 * Default constructor.
	 */
	public IdentityMgmtApiServiceImpl() {
		super();
	}
	
	@Override
	protected ResponseUtils getResponseUtils() {
		return responseUtils;
	}
	
	static {
		try {
			// Get system country and language
			String country  = System.getProperty("user.country");
			String language = System.getProperty("user.language");
			
			// Create Locale
			@SuppressWarnings("unused")
			Locale locale = new Locale(language, country);
			
			// Load the resource bundle
			resourceBundle = (AbstractErrorListResourceBundle)
					ResourceBundle.getBundle(bundleName, /*locale*/new Locale("sv", "SE"), ResponseUtils.class.getClassLoader());

			// Create a ResponseUtils instance
			responseUtils = new ResponseUtils(resourceBundle);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
