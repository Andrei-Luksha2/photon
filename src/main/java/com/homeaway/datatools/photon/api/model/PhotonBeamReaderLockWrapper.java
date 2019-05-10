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
package com.homeaway.datatools.photon.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.homeaway.datatools.photon.dao.model.beam.PhotonBeamReader;
import lombok.Data;
import java.util.concurrent.locks.ReentrantLock;

@Data
public class PhotonBeamReaderLockWrapper {

    private PhotonBeamReader photonBeamReader;

    @JsonIgnore
    private ReentrantLock lock;

    @JsonIgnore
    private ReentrantLock consumerGroupLock;

    public static PhotonBeamReaderLockWrapper of(PhotonBeamReader reader) {
        PhotonBeamReaderLockWrapper wrapper = new PhotonBeamReaderLockWrapper();
        wrapper.setLock(new ReentrantLock());
        wrapper.setConsumerGroupLock(new ReentrantLock());
        wrapper.setPhotonBeamReader(reader);
        return wrapper;
    }
}

