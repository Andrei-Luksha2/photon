/* Copyright (c) 2019 Expedia Group.
 * All rights reserved.  http://www.homeaway.com

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *      http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.homeaway.datatools.photon.client.consumer.partition.consumer.watermark;

import static com.homeaway.datatools.photon.PhotonClientMockHelper.mockBeamReaderDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class BaseOffsetManagerTest {

    private static final Long OFFSET = -5L;
    private OffsetManager offsetManager;

    @Before
    public void init() {
        offsetManager = new BaseOffsetManager(mockBeamReaderDao(OFFSET));
    }

    @Test
    public void getNowWithOffsetTest() {
        Assert.assertEquals(OFFSET.longValue(), Instant.now().until(offsetManager.getNowWithOffset(), ChronoUnit.MILLIS));
    }
}
