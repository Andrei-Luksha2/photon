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
package com.homeaway.datatools.photon.client.consumer.partition.consumer;

import com.homeaway.datatools.photon.api.beam.PhotonMessageHandler;
import com.homeaway.datatools.photon.dao.model.beam.PhotonBeamReader;

import java.util.UUID;

public interface BeamConsumer {

    void consume(PhotonBeamReader photonBeamReader, PhotonMessageHandler photonMessageHandler);

    void consume(PhotonBeamReader photonBeamReader, PhotonMessageHandler photonMessageHandler, Boolean isAsync);

    void stopConsumers(UUID key);
}
