package com.liferay.docs.guestbook.exception;

import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.annotation.versioning.ProviderType;
/**
 * @author AllenChen
 */
@ProviderType
public class GuestbookEntryAddressException extends PortalException {
	
	public GuestbookEntryAddressException() {
	}

	public GuestbookEntryAddressException(String msg) {
		super(msg);
	}

	public GuestbookEntryAddressException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public GuestbookEntryAddressException(Throwable cause) {
		super(cause);
	}
	

}
