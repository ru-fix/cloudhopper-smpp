package com.cloudhopper.smpp.jmx;

/*
 * #%L
 * ch-smpp
 * %%
 * Copyright (C) 2009 - 2015 Cloudhopper by Twitter
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Map;

/**
 * Defines the interface for an SmppSession managed bean.
 * 
 * @author joelauer
 */
public interface DefaultSmppSessionMXBean {

    public boolean isBinding();

    public boolean isBound();

    public boolean isClosed();

    public boolean isOpen();

    public boolean isUnbinding();
    
    public String getStateName();
    
    public String getBindTypeName();

    public String getBoundDuration();
    
    public String getInterfaceVersionName();
    
    public String getLocalTypeName();

    public String getRemoteTypeName();

    public int getNextSequenceNumber();
    
    public String getLocalAddressAndPort();
    
    public String getRemoteAddressAndPort();

    public void close();

    public void close(long timeoutInMillis);

    public void destroy();

    public void unbind(long timeoutInMillis);
    
    // most from configuration of a session
    public String getName();

    public String getPassword();

    public long getRequestExpiryTimeout();

    public String getSystemId();

    public String getSystemType();

    public boolean isWindowMonitorEnabled();
    
    public long getWindowMonitorInterval();

    public int getMaxWindowSize();

    public long getWindowWaitTimeout();
    
    // pulled from state objects and counters
    public int getWindowSize();
    
    public String[] dumpWindow();
    
    public void resetCounters();
    
    public String getRxDataSMCounter();

    public String getRxDeliverSMCounter();

    public String getRxEnquireLinkCounter();

    public String getRxSubmitSMCounter();

    public String getTxDataSMCounter();

    public String getTxDeliverSMCounter();

    public String getTxEnquireLinkCounter();

    public String getTxSubmitSMCounter();
    
    public String getRxDataSMCounterAndReset();

    public String getRxDeliverSMCounterAndReset();

    public String getRxEnquireLinkCounterAndReset();

    public String getRxSubmitSMCounterAndReset();

    public String getTxDataSMCounterAndReset();

    public String getTxDeliverSMCounterAndReset();

    public String getTxEnquireLinkCounterAndReset();

    public String getTxSubmitSMCounterAndReset();

    public Integer getTxDataSMCounterRequest();

    public Integer getTxDataSMCounterExpired();

    public Integer getTxDataSMCounterResponse();

    public Double getTxDataSMCounterAvgWaitTime();

    public Double getTxDataSMCounterAvgResponseTime();

    public Double getTxDataSMCounterAvgEstimatedProcessingTime();

    public Integer getTxSubmitSMCounterRequest();

    public Integer getTxSubmitSMCounterExpired();

    public Integer getTxSubmitSMCounterResponse();

    public Double getTxSubmitSMCounterAvgWaitTime();

    public Double getTxSubmitSMCounterAvgResponseTime();

    public Double getTxSubmitSMCounterAvgEstimatedProcessingTime();

    public Integer getTxDeliverSMCounterRequest();

    public Integer getTxDeliverSMCounterExpired();

    public Integer getTxDeliverSMCounterResponse();

    public Double getTxDeliverSMCounterAvgWaitTime();

    public Double getTxDeliverSMCounterAvgResponseTime();

    public Double getTxDeliverSMCounterAvgEstimatedProcessingTime();

    public Integer getTxEnquireSMCounterRequest();

    public Integer getTxEnquireSMCounterExpired();

    public Integer getTxEnquireSMCounterResponse();

    public Double getTxEnquireSMCounterAvgWaitTime();

    public Double getTxEnquireSMCounterAvgResponseTime();

    public Double getTxEnquireSMCounterAvgEstimatedProcessingTime();

    public Integer getRxDataSMCounterRequest();

    public Integer getRxDataSMCounterExpired();

    public Integer getRxDataSMCounterResponse();

    public Double getRxDataSMCounterAvgWaitTime();

    public Double getRxDataSMCounterAvgResponseTime();

    public Double getRxDataSMCounterAvgEstimatedProcessingTime();

    public Integer getRxSubmitSMCounterRequest();

    public Integer getRxSubmitSMCounterExpired();

    public Integer getRxSubmitSMCounterResponse();

    public Double getRxSubmitSMCounterAvgWaitTime();

    public Double getRxSubmitSMCounterAvgResponseTime();

    public Double getRxSubmitSMCounterAvgEstimatedProcessingTime();

    public Integer getRxDeliverSMCounterRequest();

    public Integer getRxDeliverSMCounterExpired();

    public Integer getRxDeliverSMCounterResponse();

    public Double getRxDeliverSMCounterAvgWaitTime();

    public Double getRxDeliverSMCounterAvgResponseTime();

    public Double getRxDeliverSMCounterAvgEstimatedProcessingTime();

    public Integer getRxEnquireSMCounterRequest();

    public Integer getRxEnquireSMCounterExpired();

    public Integer getRxEnquireSMCounterResponse();

    public Double getRxEnquireSMCounterAvgWaitTime();

    public Double getRxEnquireSMCounterAvgResponseTime();

    public Double getRxEnquireSMCounterAvgEstimatedProcessingTime();

    public Long getTxDataSMRequestWaitTime();

    public Long getTxDataSMRequestResponseTime();

    public Long getTxDataSMRequestEstimatedProcessingTime();

    public Integer getTxDataSMResponseCommandStatusSuccessCounter();

    public Map getTxDataSMResponseCommandStatusCounter();

    public Long getRxDataSMRequestWaitTime();

    public Long getRxDataSMRequestResponseTime();

    public Long getRxDataSMRequestEstimatedProcessingTime();

    public Integer getRxDataSMResponseCommandStatusSuccessCounter();

    public Map getRxDataSMResponseCommandStatusCounter();

    public Long getTxSubmitSMRequestWaitTime();

    public Long getTxSubmitSMRequestResponseTime();

    public Long getTxSubmitSMRequestEstimatedProcessingTime();

    public Integer getTxSubmitSMResponseCommandStatusSuccessCounter();

    public Integer getTxSubmitSMResponseCommandStatusServerErrorCounter();

    public Map getTxSubmitSMResponseCommandStatusCounter();

    public Long getRxSubmitSMRequestWaitTime();

    public Long getRxSubmitSMRequestResponseTime();

    public Long getRxSubmitSMRequestEstimatedProcessingTime();

    public Integer getRxSubmitSMResponseCommandStatusSuccessCounter();

    public Integer getRxSubmitSMResponseCommandStatusServerErrorCounter();

    public Map getRxSubmitSMResponseCommandStatusCounter();

    public Long getTxDeliverSMRequestWaitTime();

    public Long getTxDeliverSMRequestResponseTime();

    public Long getTxDeliverSMRequestEstimatedProcessingTime();

    public Integer getTxDeliverSMResponseCommandStatusSuccessCounter();

    public Integer getTxDeliverSMResponseCommandStatusServerErrorCounter();

    public Map getTxDeliverSMResponseCommandStatusCounter();

    public Long getRxDeliverSMRequestWaitTime();

    public Long getRxDeliverSMRequestResponseTime();

    public Long getRxDeliverSMRequestEstimatedProcessingTime();

    public Integer getRxDeliverSMResponseCommandStatusSuccessCounter();

    public Integer getRxDeliverSMResponseCommandStatusServerErrorCounter();

    public Map getRxDeliverSMResponseCommandStatusCounter();

    public Long getTxEnquireSMRequestWaitTime();

    public Long getTxEnquireSMRequestResponseTime();

    public Long getTxEnquireSMRequestEstimatedProcessingTime();

    public Integer getTxEnquireSMResponseCommandStatusSuccessCounter();

    public Integer getTxEnquireSMResponseCommandStatusServerErrorCounter();

    public Map getTxEnquireLinkResponseCommandStatusCounter();

    public Long getRxEnquireSMRequestWaitTime();

    public Long getRxEnquireSMRequestResponseTime();

    public Long getRxEnquireSMRequestEstimatedProcessingTime();

    public Integer getRxEnquireSMResponseCommandStatusSuccessCounter();

    public Integer getRxEnquireSMResponseCommandStatusServerErrorCounter();

    public Map getRxEnquireLinkResponseCommandStatusCounter();

    public void enableLogBytes();
    
    public void disableLogBytes();
    
    public void enableLogPdu();
    
    public void disableLogPdu();
}
