/*
 * $HeadURL: http://juliusdavies.ca/svn/not-yet-commons-ssl/trunk/src/java/org/apache/commons/ssl/rmi/RemoteDate.java $
 * $Revision: 121 $
 * $Date: 2007-11-14 09:26:57 +0400 (Ср., 14 нояб. 2007) $
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.commons.ssl.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * @author Credit Union Central of British Columbia
 * @author <a href="http://www.cucbc.com/">www.cucbc.com</a>
 * @author <a href="mailto:juliusdavies@cucbc.com">juliusdavies@cucbc.com</a>
 * @since 22-Feb-2007
 */
public interface RemoteDate extends Remote {
    public Date getDate() throws RemoteException;
}
