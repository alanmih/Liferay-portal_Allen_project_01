package com.liferay.docs.guestbook.exception;

import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author AllenChen
 */
@ProviderType
public class GuestbookEntryPhoneException extends PortalException {
	
	public GuestbookEntryPhoneException() {
	}

	public GuestbookEntryPhoneException(String msg) {
		super(msg);
	}

	public GuestbookEntryPhoneException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public GuestbookEntryPhoneException(Throwable cause) {
		super(cause);
	}

}
