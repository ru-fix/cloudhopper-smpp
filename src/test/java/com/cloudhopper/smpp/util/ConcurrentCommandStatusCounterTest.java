package com.cloudhopper.smpp.util;
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

import com.cloudhopper.smpp.SmppConstants;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Maria Farooq
 */
public class ConcurrentCommandStatusCounterTest {

    @Test
    public void incrementAndGetTest (){
        ConcurrentCommandStatusCounter concurrentCommandStatusCounter = new ConcurrentCommandStatusCounter();
        assertEquals(0, concurrentCommandStatusCounter.getClientErrorCounter().intValue());
        assertEquals(0, concurrentCommandStatusCounter.getClientErrorCounter().intValue());

        concurrentCommandStatusCounter.incrementAndGet(SmppConstants.STATUS_OK);
        assertEquals(0, concurrentCommandStatusCounter.getClientErrorCounter().intValue());
        assertEquals(0, concurrentCommandStatusCounter.getClientErrorCounter().intValue());


        concurrentCommandStatusCounter.incrementAndGet(SmppConstants.STATUS_INVDSTADR);
        assertEquals(1, concurrentCommandStatusCounter.getClientErrorCounter().intValue());
        assertEquals(0, concurrentCommandStatusCounter.getServerErrorCounter().intValue());


        concurrentCommandStatusCounter.incrementAndGet(SmppConstants.STATUS_INVSYSID);
        assertEquals(1, concurrentCommandStatusCounter.getClientErrorCounter().intValue());
        assertEquals(1, concurrentCommandStatusCounter.getServerErrorCounter().intValue());
    }
}
