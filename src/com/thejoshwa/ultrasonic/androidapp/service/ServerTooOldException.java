/*
 This file is part of Subsonic.

 Subsonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Subsonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2009 (C) Sindre Mehus
 */
package com.thejoshwa.ultrasonic.androidapp.service;

/**
 * Thrown if the REST API version implemented by the server is too old.
 *
 * @author Sindre Mehus
 * @version $Id$
 */
public class ServerTooOldException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7955245839000220002L;

    public ServerTooOldException(String text) {
    	super(createMessage(text));
    }

    private static String createMessage(String text) {
        StringBuilder builder = new StringBuilder();
        
        if (text != null) {
            builder.append(text).append(" ");
        }

        builder.append("Subsonic server version is too old. Please upgrade.");
        return builder.toString();
    }
}
